package com.Project.SpringAngular.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Project.SpringAngular.DTO.CustomerSaveDTO;
import com.Project.SpringAngular.Service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO)
    {
        String id = customerService.addCustomer(customerSaveDTO);
        return id;
    }

    
    @GetMapping("/getAll")
    public List<CustomerSaveDTO> getAllCustomers() {
    	
    	return customerService.getAllCostomers();
    	
    }
    
    @GetMapping("/getById")
    public CustomerSaveDTO getcustomerById(@RequestParam(required = false) Integer id) {
    	
    	return customerService.getCustomerById(id);
    	
    }


}
