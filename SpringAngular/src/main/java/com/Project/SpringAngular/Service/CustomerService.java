package com.Project.SpringAngular.Service;

import java.util.List;

import com.Project.SpringAngular.DTO.CustomerSaveDTO;

public interface CustomerService {

	String addCustomer(CustomerSaveDTO customerSaveDTO);
	
	List<CustomerSaveDTO> getAllCostomers();
	
	CustomerSaveDTO getCustomerById(Integer id);
	
}
