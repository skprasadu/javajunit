package com.hcl.javajunit5.customer.repository;

import java.util.List;

import com.hcl.javajunit5.customer.model.Customer;

public interface CustomerRespository {

    List<Customer> findAll();

    Customer findOne(Long id);

    boolean isDataFromMemory();
}