package com.dailyjava.store.api.service;


import java.util.List;

import com.dailyjava.store.api.model.Customer;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Customer validateAndGetCustomerById(Long id);
}
