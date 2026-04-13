package com.spring.apacheCamel.EnterpriseIntegration14Patterns.processor;

import org.springframework.stereotype.Component;

import com.spring.apacheCamel.EnterpriseIntegration14Patterns.model.Order;

@Component
public class OrderFilter {

    public boolean isValid(Order order) {
        return order.getAmount() > 0;
    }
}
