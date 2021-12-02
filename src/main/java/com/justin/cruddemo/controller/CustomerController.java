package com.justin.cruddemo.controller;


import com.justin.cruddemo.service.CustomerService;
import com.justin.cruddemo.utils.dto.CustomerUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/createCustomer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String createCustomer(@RequestBody CustomerUI request)
    {
        return customerService.createCustomer(request);
    }

    @PostMapping(path = "/updateCustomer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateCustomer(@RequestBody CustomerUI request)
    {
        return customerService.updateCustomer(request);
    }

    @GetMapping(path = "/getAllCustomer")
    public List<CustomerUI> getAllCustomer()
    {
        return customerService.fetchAllCustomer();
    }

    @GetMapping(path = "/getCustomerById/{id}")
    public ResponseEntity<CustomerUI> getCustomerById(@PathVariable String id)
    {
        final CustomerUI customerUI = customerService.fetchCustomerById(id).get();
        return new ResponseEntity<CustomerUI>(customerUI, HttpStatus.OK);
    }

    @DeleteMapping(path = "/deleteAll")
    public void deleteAll()
    {
        customerService.deleteAll();
    }

    @DeleteMapping(path = "/deleteById/{id}")
    public void deleteById(@PathVariable String id)
    {
        customerService.deleteById(id);
    }

}
