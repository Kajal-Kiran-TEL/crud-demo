<<<<<<< HEAD
package com.justin.cruddemo.service;

import com.justin.cruddemo.model.Customer;
import com.justin.cruddemo.repository.CustomerRepository;
import com.justin.cruddemo.utils.dto.CustomerUI;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import java.util.ArrayList;
import java.util.List;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@RunWith(PowerMockRunner.class)
@PrepareForTest(CustomerService.class)
class CustomerServiceTest {

    private CustomerUI customerUI;
    private List<CustomerUI> customerUIList;
    private Customer customer;
    private List<Customer> customerList;

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    @Before
    void setUp() {

        MockitoAnnotations.initMocks(this);
        PowerMockito.mockStatic(CustomerService.class);

        customerUIList = new ArrayList<>();
        customerUI = new CustomerUI();
        customerUI.setId("1");
        customerUI.setCustomerName("Test");
        customerUI.setCustomerAddress("India");
        customerUI.setCustomerStatus(false);
        customerUI.setCreatedAt("2433223");
        customerUIList.add(customerUI);

        customerList = new ArrayList<>();
        customer = new Customer();
        customer.setId("1");
        customer.setCustomerName("Test");
        customer.setCustomerAddress("India");
        customer.setCustomerStatus(true);
        customerList.add(customer);
    }

    @Test
    void fetchAllCustomer() {

        when(customerRepository.findAll()).thenReturn(customerList);
       customerService.fetchAllCustomer();
    }

    @Test
    void fetchCustomerById() throws Exception {
        when(customerRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(customer));
        customerService.fetchCustomerById("1");
    }

    @Test
    void deleteAll() {
        Mockito.doNothing().when(customerRepository).deleteAll();
        customerService.deleteAll();
    }

    @Test
    void deleteById() {
        Mockito.doNothing().when(customerRepository).deleteById(any());
        customerService.deleteById("1");
    }

    @Test
    void createCustomer() {
        when(customerRepository.save(any())).thenReturn(customerUIList);
        customerService.createCustomer(customerUI);
    }

    @Test
    void updateCustomer() {
        when(customerRepository.getById(any())).thenReturn(customer);
        when(customerRepository.save(any())).thenReturn(customerUIList);
        customerService.createCustomer(customerUI);
    }
}
=======
//package com.justin.cruddemo.service;
//import com.justin.cruddemo.repository.CustomerRepository;
//import com.justin.cruddemo.utils.dto.CustomerUI;
//import org.junit.Assert;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.ArgumentMatchers;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//@RunWith(SpringRunner.class)
//class CustomerServiceTest {
//
//    private CustomerUI customerUI;
//    private List<CustomerUI> customerUIList;
//
//
//    @Mock
//    private CustomerService customerService;
//
//    @Mock
//    private CustomerRepository customerRepository;
//
//    @BeforeEach
//    void setUp() {
//
//        MockitoAnnotations.initMocks(this);
//        Mockito.mock(CustomerService.class);
//
//        customerUIList = new ArrayList<>();
//        customerUI = new CustomerUI();
//        customerUI.setId("1");
//        customerUI.setCustomerName("Test");
//        customerUI.setCustomerAddress("India");
//        customerUI.setCustomerStatus(false);
//        customerUI.setCreatedAt("2433223");
//        customerUIList.add(customerUI);
//    }
//
//    @Test
//    void fetchAllCustomer() {
//        Mockito.when(ArgumentMatchers.any()).thenReturn(customerUIList);
//       customerService.fetchAllCustomer();
//    }
//
//    @Test
//    void fetchCustomerById() {
//    }
//
//    @Test
//    void deleteAll() {
//    }
//
//    @Test
//    void deleteById() {
//    }
//
//    @Test
//    void createCustomer() {
//    }
//
//    @Test
//    void updateCustomer() {
//    }
//}
>>>>>>> ab307ba78077f79ffc8c780056cbdcdcb1457184
