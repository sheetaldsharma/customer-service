package com.eshopper.customerservice.controller;

import com.eshopper.customerservice.model.Customer;
//import com.eshopper.customerservice.service.CustomerService;
import com.eshopper.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//@Configuration
//@ComponentScan("com.eshopper.customerservice")
@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/allCustomers")
    public List<Customer> getAllCustomer()
    {
        return (List<Customer>) customerService.getAllCustomers() ;
    }
}
