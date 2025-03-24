package com.Project.SpringAngular.DTO;

public class CustomerUpdateDTO {
	

    private int customerId;
    private String customername;
    private String customeraddress;
    private int mobile;

    public CustomerUpdateDTO(int customer, String customername, String customeraddress, int mobile) {
        this.customerId = customerId;
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
    }
    
    
    
    public CustomerUpdateDTO() {
    	
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customer) {
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

	
	
	
	
	
