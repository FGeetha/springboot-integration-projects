package com.spring.apacheCamel.EnterpriseIntegration14Patterns.controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.apacheCamel.EnterpriseIntegration14Patterns.model.Order;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    ProducerTemplate producerTemplate;

    @PostMapping
    public String createOrder(@RequestBody Order order) {

        producerTemplate.sendBody("jms:queue:orders.in", order);

        return "Order sent to processing pipeline";
    }
}
