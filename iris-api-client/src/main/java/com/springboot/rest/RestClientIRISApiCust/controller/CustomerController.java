package com.springboot.rest.RestClientIRISApiCust.controller;

import com.springboot.rest.RestClientIRISApiCust.model.CustomerStats;
import com.springboot.rest.RestClientIRISApiCust.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/customers")
    public String getCustomers() {
        return service.getCustomers();
    }
    @GetMapping("/customers/stats")
    public CustomerStats getCustomerStats() {
        return service.getCustomerStats();
    }
}
