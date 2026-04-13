package com.example.springboot.ApacheCamelEg2_RestToQueue.processor;

import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("uuidProcessor")
public class UuidProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        String body = exchange.getIn().getBody(String.class);

        String uuid = UUID.randomUUID().toString();

        exchange.setProperty("UNIQUE_ID", uuid);

        System.out.println("UUID for request " + body + " is >> " + uuid);
    }
}

