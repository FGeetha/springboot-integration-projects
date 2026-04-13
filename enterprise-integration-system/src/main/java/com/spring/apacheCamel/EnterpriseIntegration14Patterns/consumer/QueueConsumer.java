package com.spring.apacheCamel.EnterpriseIntegration14Patterns.consumer;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer extends RouteBuilder {

    @Override
    public void configure() {

        from("jms:queue:audit.queue")
            .log("AUDIT : ${body}");

        from("jms:queue:inventory.queue")
            .log("Inventory : ${body}");

        from("jms:queue:store.queue")
            .log("Store : ${body}");

        from("jms:queue:error.queue")
            .log("ERROR : ${body}");

        from("jms:queue:final.queue")
            .log("FINAL : ${body}");
    }
}
