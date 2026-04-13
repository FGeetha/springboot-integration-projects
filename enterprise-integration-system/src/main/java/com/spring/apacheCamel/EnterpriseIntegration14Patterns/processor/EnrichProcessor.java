package com.spring.apacheCamel.EnterpriseIntegration14Patterns.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.spring.apacheCamel.EnterpriseIntegration14Patterns.model.Order;

@Component
public class EnrichProcessor implements Processor {

    @Override
    public void process(Exchange exchange) {

        Order order = exchange.getIn().getBody(Order.class);

        order.setCustomerName(order.getCustomerName() + " VERIFIED");

        exchange.getIn().setBody(order);
    }
}
