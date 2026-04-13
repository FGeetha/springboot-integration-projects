package com.springboot.rest.RestClientIRISApiCust.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
//This commented service works and retrieves the response of the customer by hardcoding the url here
//Instead of hardcoding the url is given in the application.properties and with some enrichment
//and improvised logic for counting is done in the uncommented part below.
//@Service
//public class CustomerService {
//
//    private final RestTemplate restTemplate = new RestTemplate();
//
//    public String getCustomers() {
//
//        String url = "http://192.168.1.14:8080/irf-provider-container/api/v3.0.0/party/customers";
//
//        ResponseEntity<String> response =
//                restTemplate.getForEntity(url, String.class);
//
//        return response.getBody();
//    }

import com.springboot.rest.RestClientIRISApiCust.model.CustomerStats;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CustomerService {

    private final RestTemplate restTemplate;

    @Value("${iris.api.url}")
    private String irisUrl;

    public CustomerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

	public String getCustomers() {

		ResponseEntity<String> response = restTemplate.getForEntity(irisUrl, String.class);

		return response.getBody();
	}

    public CustomerStats getCustomerStats() {

        Map response = restTemplate.getForObject(irisUrl, Map.class);

        List<Map<String, Object>> body =
                (List<Map<String, Object>>) response.get("body");

        int employed = 0;
        int unemployed = 0;

        for (Map<String, Object> customer : body) {

            List<Map<String, String>> employmentDetails =
                    (List<Map<String, String>>) customer.get("employmentDetails");

            if (employmentDetails != null && !employmentDetails.isEmpty()) {

                String status = employmentDetails.get(0).get("employmentStatus");

                if ("EMPLOYED".equalsIgnoreCase(status)) {
                    employed++;
                }

                if ("UNEMPLOYED".equalsIgnoreCase(status)) {
                    unemployed++;
                }
            }
        }

        CustomerStats stats = new CustomerStats();
        stats.setTotalCustomers(body.size());
        stats.setEmployedCount(employed);
        stats.setUnemployedCount(unemployed);

        return stats;
    }


}
