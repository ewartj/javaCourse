package com.company;

public class VIPcustomer {
    private String customerName;
    private double customerCreditLimit;
    private String customerEmail;

    public VIPcustomer(){
        this ("Joe Blogs", 100.00, "joe@aol.com");
    }

    public VIPcustomer(String customerName, double customerCreditLimit) {
        this (customerName, customerCreditLimit, "not given");
    }

    public VIPcustomer(String customerName, double customerCreditLimit, String customerEmail) {
        this.customerName = customerName;
        this.customerCreditLimit = customerCreditLimit;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCustomerCreditLimit() {
        return customerCreditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
