package com.spring.apacheCamel.EnterpriseIntegration14Patterns.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.spring.apacheCamel.EnterpriseIntegration14Patterns.model.Order;

@Component
public class OrderValidator implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        Order order = exchange.getIn().getBody(Order.class);

        if (order.getOrderId() == null)
            throw new Exception("OrderId missing");
    }
}
