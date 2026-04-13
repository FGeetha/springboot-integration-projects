package com.spring.apacheCamel.EnterpriseIntegration14Patterns.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.spring.apacheCamel.EnterpriseIntegration14Patterns.model.Order;

@Component
public class OrderTranslator implements Processor {

    @Override
    public void process(Exchange exchange) {

        Order order = exchange.getIn().getBody(Order.class);

        if (order.getCustomerName() != null)
            order.setCustomerName(order.getCustomerName().toUpperCase());

        exchange.getIn().setBody(order);
    }
}
