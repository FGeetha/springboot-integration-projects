package com.spring.apacheCamel.EnterpriseIntegration14Patterns.controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/xml")
public class XmlController {

    @Autowired
    private ProducerTemplate producerTemplate;

    @PostMapping
    public String processXml(@RequestBody String xml) {

        producerTemplate.sendBody("direct:xmlEntry", xml);

        return "XML sent to processing pipeline";
    }
}
