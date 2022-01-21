package com.sadmansakib.gas_payment_online.service;

import com.sadmansakib.gas_payment_online.models.db.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer updateCustomer(long id, Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerByEmail(String email);
}
