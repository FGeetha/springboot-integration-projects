package com.springboot.rest.RestClientIRISApiCust.model;


public class CustomerStats {

    private int totalCustomers;
    private int employedCount;
    private int unemployedCount;

    public int getTotalCustomers() {
        return totalCustomers;
    }

    public void setTotalCustomers(int totalCustomers) {
        this.totalCustomers = totalCustomers;
    }

    public int getEmployedCount() {
        return employedCount;
    }

    public void setEmployedCount(int employedCount) {
        this.employedCount = employedCount;
    }

    public int getUnemployedCount() {
        return unemployedCount;
    }

    public void setUnemployedCount(int unemployedCount) {
        this.unemployedCount = unemployedCount;
    }
}

