package com.hcl.javajunit5.nested.samples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hcl.javajunit5.customer.service.CustomerService;

public class CustomerServiceUpdateTest {

    CustomerService customerService;

    @BeforeEach
    void createNewObjectForAll() {
        System.out.println("New CustomerService()");
        //customerService = new CustomerServiceJDBC();
    }

    @Test
    void update_with_new() {
        //customerService.update(new Customer());
    }

    @Test
    void update_with_existing() {
        //customerService.update(new Customer());
    }

}