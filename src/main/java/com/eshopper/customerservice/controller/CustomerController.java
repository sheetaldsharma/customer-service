package com.eshopper.customerservice.controller;

import com.eshopper.customerservice.model.Customer;
import com.eshopper.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

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

    @RequestMapping("/{customerId}")
    public Optional<Customer> getCustomerDetails(@PathVariable("customerId") Integer customerId)
    {
        System.out.println("in getCustomerDetails"+customerId);
        return customerService.getCustomerDetails(customerId) ;
    }
}
