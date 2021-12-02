package com.justin.cruddemo.service;

import com.justin.cruddemo.model.Customer;

import com.justin.cruddemo.repository.CustomerRepository;
import com.justin.cruddemo.utils.dto.CustomerUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        }
        return customerUIList;
    }

    public Optional<CustomerUI> fetchCustomerById(String id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        Optional<CustomerUI> customerUI = Optional.empty();
        customerUI.get().setId(customerOptional.get().getId());
        customerUI.get().setCustomerName(customerOptional.get().getCustomerName());
        customerUI.get().setCustomerAddress(customerOptional.get().getCustomerAddress());
        customerUI.get().setCustomerStatus(customerOptional.get().isCustomerStatus());
        customerUI.get().setCustomerName(customerOptional.get().getCustomerName());
        customerUI.get().setCreatedAt(customerOptional.get().getCreatedAt());
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
