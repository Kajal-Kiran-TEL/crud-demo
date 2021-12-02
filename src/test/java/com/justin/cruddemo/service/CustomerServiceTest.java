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