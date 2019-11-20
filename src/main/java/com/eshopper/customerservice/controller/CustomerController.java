package com.eshopper.customerservice.controller;

import com.eshopper.customerservice.dto.OrderDTO;
import com.eshopper.customerservice.model.Customer;
import com.eshopper.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
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

    @GetMapping("/{customerId}")
    public Optional<Customer> getCustomerDetails(@PathVariable("customerId") Integer customerId)
    {
        System.out.println("in getCustomerDetails"+customerId);
        return customerService.getCustomerDetails(customerId) ;
    }

    @GetMapping("/{customerId}/orderDetails")
    public List<OrderDTO> getCustomerOrderDetails(@PathVariable("customerId") Integer customerId)
    {
        RestTemplate restTemplate = new RestTemplate();
        String orderAPI = "http://localhost:8082/order/"+customerId+"/orderDetails";
        List<OrderDTO> details = new ArrayList<>();
        try {
            ResponseEntity<List<OrderDTO>> orderServiceResponse = restTemplate.exchange(
                    orderAPI,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<OrderDTO>>() {});
            if(orderServiceResponse != null && orderServiceResponse.hasBody()){
                details = orderServiceResponse.getBody();
            }
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return details ;
    }
}
