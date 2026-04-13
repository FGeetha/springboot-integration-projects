package com.spring.apacheCamel.EnterpriseIntegration14Patterns.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.support.processor.idempotent.MemoryIdempotentRepository;
import org.springframework.stereotype.Component;

import com.spring.apacheCamel.EnterpriseIntegration14Patterns.processor.*;
import com.spring.apacheCamel.EnterpriseIntegration14Patterns.aggregator.OrderAggregator;

@Component
public class OrderRoute extends RouteBuilder {

    private final OrderTranslator orderTranslator;
    private final OrderValidator orderValidator;
    private final EnrichProcessor enrichProcessor;
    private final OrderAggregator orderAggregator;

    public OrderRoute(OrderTranslator orderTranslator,
                      OrderValidator orderValidator,
                      EnrichProcessor enrichProcessor,
                      OrderAggregator orderAggregator) {

        this.orderTranslator = orderTranslator;
        this.orderValidator = orderValidator;
        this.enrichProcessor = enrichProcessor;
        this.orderAggregator = orderAggregator;
    }

    @Override
    public void configure() {

        //  Dead Letter Channel
        errorHandler(deadLetterChannel("jms:queue:error.queue")
                .useOriginalMessage()
                .logHandled(true));

        /*
         ENTRY ROUTE
        */
        from("jms:queue:orders.in")
            .routeId("order-entry")

            //  NO UNMARSHAL (you send object)

            .log("Order Received : ${body}")

            //  Idempotent Consumer
            .idempotentConsumer(
                    simple("${body.orderId}"),
                    MemoryIdempotentRepository.memoryIdempotentRepository(200)
            )

            //  Throttle
            .throttle(5).timePeriodMillis(1000)

            //  Translator
            .process(orderTranslator)

            //  Validator
            .process(orderValidator)

            //  Filter (Method call)
            .filter().method("orderFilter", "isValid")

            //  Content Based Router
            .choice()
                .when(simple("${body.type} == 'ONLINE'"))
                    .to("direct:onlineOrder")
                .when(simple("${body.type} == 'STORE'"))
                    .to("direct:storeOrder")
                .otherwise()
                    .to("jms:queue:unknown.queue")
            .end();


        /*
         ONLINE ORDER FLOW
        */
        from("direct:onlineOrder")
            .routeId("online-order")

            //  Enricher
            .process(enrichProcessor)

            //  Claim Check
            .setProperty("orderId", simple("${body.orderId}"))
            .setProperty("claimCheckBackup").body()

            //  Splitter
            .split(simple("${body.items}"))

                //  WireTap
                .wireTap("jms:queue:audit.queue")

                //  Load Balancer
                .loadBalance()
                    .roundRobin()
                    .to("jms:queue:inventory.queue",
                        "jms:queue:backup.inventory.queue")
                .end()

            .end()

            //  Aggregator
            .aggregate(exchangeProperty("orderId"), orderAggregator)
                .completionTimeout(5000)

            //  Resequencer
            .resequence(header("CamelSplitIndex")).batch()

            //  Claim Check Restore
            .setBody(exchangeProperty("claimCheckBackup"))

            //  Marshal
            .marshal().json(JsonLibrary.Jackson)

            //  Final Queue
            .to("jms:queue:final.queue");


        /*
         STORE ORDER FLOW
        */
        from("direct:storeOrder")
            .routeId("store-order")

            //  Message Translator (log)
            .log("Processing Store Order : ${body}")

            .to("jms:queue:store.queue");
    }
}
