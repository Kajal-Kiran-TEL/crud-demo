<<<<<<< HEAD
package com.justin.cruddemo.service;

import com.justin.cruddemo.model.Customer;
import com.justin.cruddemo.repository.CustomerRepository;
import com.justin.cruddemo.utils.dto.CustomerUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerUI> fetchAllCustomer() {

        List<CustomerUI> customerUIList = new ArrayList<>();
        List<Customer> customerList = customerRepository.findAll();
        for (Customer customer:customerList
             ) {
            CustomerUI customerUI = new CustomerUI();
            customerUI.setId(customer.getId());
            customerUI.setCustomerName(customer.getCustomerName());
            customerUI.setCustomerAddress(customer.getCustomerAddress());
            customerUI.setCustomerStatus(customer.isCustomerStatus());
            customerUI.setCreatedAt(customer.getCreatedAt());
            customerUIList.add(customerUI);
        }
        System.out.println(customerUIList);
        return customerUIList;
    }

    public CustomerUI fetchCustomerById(String id) throws Exception{

        Optional<Customer> customerOptional = customerRepository.findById(id);

        if(!customerOptional.get().isCustomerStatus()) {
            throw  new Exception(String.valueOf(UNAUTHORIZED));
        }

        CustomerUI customerUI = new CustomerUI();
        customerUI.setId(customerOptional.get().getId());
        customerUI.setCustomerName(customerOptional.get().getCustomerName());
        customerUI.setCustomerAddress(customerOptional.get().getCustomerAddress());
        customerUI.setCustomerStatus(customerOptional.get().isCustomerStatus());
        customerUI.setCustomerName(customerOptional.get().getCustomerName());
        customerUI.setCreatedAt(customerOptional.get().getCreatedAt());
        return customerUI;
    }

    public void deleteAll() {
        customerRepository.deleteAll();
    }

    public void deleteById(String id) {
        customerRepository.deleteById(id);
    }

    public String createCustomer(CustomerUI customerUI) {
        Customer customer = new Customer();
        customer.setId(customerUI.getId());
        customer.setCustomerName(customerUI.getCustomerName());
        customer.setCustomerAddress(customerUI.getCustomerAddress());
        customer.setCustomerStatus(customerUI.isCustomerStatus());
        customer.setCreatedAt(customerUI.getCreatedAt());
        return customerRepository.save(customer).toString();
    }

    public String updateCustomer(CustomerUI customerUI) {
        Customer customer = customerRepository.getById(customerUI.getId());
        customer.setId(customerUI.getId());
        customer.setCustomerName(customerUI.getCustomerName());
        customer.setCustomerAddress(customerUI.getCustomerAddress());
        customer.setCustomerStatus(customerUI.isCustomerStatus());
        customer.setCreatedAt(customerUI.getCreatedAt());
        return customerRepository.save(customer).toString();
    }

}
=======
package com.justin.cruddemo.service;

import com.justin.cruddemo.model.Customer;
import com.justin.cruddemo.repository.CustomerRepository;
import com.justin.cruddemo.utils.dto.CustomerUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerUI> fetchAllCustomer() {

        List<CustomerUI> customerUIList = new ArrayList<>();
        List<Customer> customerList = customerRepository.findAll();
        for (Customer customer:customerList
             ) {
            CustomerUI customerUI = new CustomerUI();
            customerUI.setId(customer.getId());
            customerUI.setCustomerName(customer.getCustomerName());
            customerUI.setCustomerAddress(customer.getCustomerAddress());
            customerUI.setCustomerStatus(customer.isCustomerStatus());
            customerUI.setCreatedAt(customer.getCreatedAt());
            customerUIList.add(customerUI);
        }
        System.out.println(customerUIList);
        return customerUIList;
    }

    public CustomerUI fetchCustomerById(String id) throws Exception{

        Optional<Customer> customerOptional = customerRepository.findById(id);

        if(!customerOptional.get().isCustomerStatus()) {
            throw  new Exception(String.valueOf(UNAUTHORIZED));
        }

        CustomerUI customerUI = new CustomerUI();
        customerUI.setId(customerOptional.get().getId());
        customerUI.setCustomerName(customerOptional.get().getCustomerName());
        customerUI.setCustomerAddress(customerOptional.get().getCustomerAddress());
        customerUI.setCustomerStatus(customerOptional.get().isCustomerStatus());
        customerUI.setCustomerName(customerOptional.get().getCustomerName());
        customerUI.setCreatedAt(customerOptional.get().getCreatedAt());
        return customerUI;
    }

    public void deleteAll() {
        customerRepository.deleteAll();
    }

    public void deleteById(String id) {
        customerRepository.deleteById(id);
    }

    public String createCustomer(CustomerUI customerUI) {
        Customer customer = new Customer();
        customer.setId(customerUI.getId());
        customer.setCustomerName(customerUI.getCustomerName());
        customer.setCustomerAddress(customerUI.getCustomerAddress());
        customer.setCustomerStatus(customerUI.isCustomerStatus());
        customer.setCreatedAt(customerUI.getCreatedAt());
        return customerRepository.save(customer).toString();
    }

    public String updateCustomer(CustomerUI customerUI) {
        Customer customer = customerRepository.getById(customerUI.getId());
        customer.setId(customerUI.getId());
        customer.setCustomerName(customerUI.getCustomerName());
        customer.setCustomerAddress(customerUI.getCustomerAddress());
        customer.setCustomerStatus(customerUI.isCustomerStatus());
        customer.setCreatedAt(customerUI.getCreatedAt());
        return customerRepository.save(customer).toString();
    }

}
>>>>>>> ab307ba78077f79ffc8c780056cbdcdcb1457184
