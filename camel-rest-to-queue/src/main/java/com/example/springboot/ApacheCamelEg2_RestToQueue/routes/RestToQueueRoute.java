package com.example.springboot.ApacheCamelEg2_RestToQueue.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.example.springboot.ApacheCamelEg2_RestToQueue.processor.UuidProcessor;

@Component
public class RestToQueueRoute extends RouteBuilder {

    @Override
    public void configure() {

        restConfiguration()
                .component("servlet")
                .contextPath("/")
                .port(8080);

        rest("/send")

            .get()
            .to("direct:getRoute")

            .post()
            .consumes("application/json")
            .to("direct:postRoute");


        from("direct:getRoute")
            .log("GET request received: ${header.message}")
            .setBody(simple("Message received with id: ${header.message}"))
            .to("activemq:queue:demo.queue");


        from("direct:postRoute")
            .log("POST body: ${body}")
            .process(new UuidProcessor())
            .to("activemq:queue:demo.queue");
    }
}
