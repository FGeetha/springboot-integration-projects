package com.example.springboot.ApacheCamelEg2_RestToQueue.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumerRoute extends RouteBuilder {

    @Override
    public void configure() {

        from("activemq:queue:demo.queue")
            .routeId("queue-consumer")
            .log("Message received from queue: ${body}")
            .to("stream:out");
    }
}
