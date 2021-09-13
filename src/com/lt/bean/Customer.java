package com.lt.bean;

// java contains two type of classes and development 1st bean class(it is responsible to create the setter/getter)
// 2nd enterprise class which is responsible to development of business logic.

public class Customer {
    private int customerId;
    private String customerName;

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    private String customerAddress;

}
