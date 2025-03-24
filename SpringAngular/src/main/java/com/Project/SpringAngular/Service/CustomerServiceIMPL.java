package com.Project.SpringAngular.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SpringAngular.DTO.CustomerSaveDTO;
import com.Project.SpringAngular.entity.Customer;
import com.Project.SpringAngular.repo.CustomerRepo;
@Service
public class CustomerServiceIMPL implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public String addCustomer(CustomerSaveDTO customerSaveDTO) {
		// TODO Auto-generated method stub

		Customer customer = new Customer(customerSaveDTO.getCustomername(), customerSaveDTO.getCustomeraddress(),
				customerSaveDTO.getMobile());
		customerRepo.save(customer);
		return customer.getCustomername();
		}

	@Override
	public List<CustomerSaveDTO> getAllCostomers() {
        var custometList = customerRepo.findAll();
        List<CustomerSaveDTO> customerSaveDTOs = new ArrayList<>();
        custometList.forEach(customer -> {
        	CustomerSaveDTO customerSaveDTO = new CustomerSaveDTO();
        	customerSaveDTO.setCustomeraddress(customer.getCustomeraddress());
        	customerSaveDTO.setCustomername(customer.getCustomername());
        	customerSaveDTO.setMobile(customer.getMobile());
        	customerSaveDTOs.add(customerSaveDTO);
        });
		
		return customerSaveDTOs;
	}
	
	public CustomerSaveDTO getCustomerById(Integer id) {
        var customer = customerRepo.findByCustomerId(id);
        	CustomerSaveDTO customerSaveDTO = new CustomerSaveDTO();
        	customerSaveDTO.setCustomeraddress(customer.getCustomeraddress());
        	customerSaveDTO.setCustomername(customer.getCustomername());
        	customerSaveDTO.setMobile(customer.getMobile());
		
		return customerSaveDTO;
	}

}
