<<<<<<< HEAD
package com.justin.cruddemo.controller;


import com.justin.cruddemo.service.CustomerService;
import com.justin.cruddemo.utils.dto.CustomerUI;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@Slf4j
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
    public CustomerUI getCustomerById(@PathVariable String id) throws Exception {
        return customerService.fetchCustomerById(id);

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
=======
package com.justin.cruddemo.controller;


import com.justin.cruddemo.service.CustomerService;
import com.justin.cruddemo.utils.dto.CustomerUI;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@Slf4j
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
    public CustomerUI getCustomerById(@PathVariable String id) throws Exception {
        return customerService.fetchCustomerById(id);

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
>>>>>>> ab307ba78077f79ffc8c780056cbdcdcb1457184
