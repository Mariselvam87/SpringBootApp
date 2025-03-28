package com.Project.SpringAngular.DTO;

import jakarta.persistence.GenerationType;

public class CustomerDTO {


    private int customerId;
    private String customername;
    private String customeraddress;
    private int mobile;

    public CustomerDTO(int customer, String customername, String customeraddress, int mobile) {
        this.customerId = customerId;
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
    }

    public int getCustomer() {
        return customerId;
    }

    public void setCustomer(int customer) {
        this.customerId = customer;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customer=" + customerId +
                ", customername=" + customername +
                ", customeraddress=" + customeraddress +
                ", mobile=" + mobile +
                '}';
    }
}
