package com.sadmansakib.gas_payment_online.service;

import com.sadmansakib.gas_payment_online.exception.ResourceNotFoundException;
import com.sadmansakib.gas_payment_online.models.db.Customer;
import com.sadmansakib.gas_payment_online.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(long id, Customer customer) {
        Optional<Customer> customerDb = customerRepository.findById(id);

        if (customerDb.isPresent()){
            Customer customerInstance = customerDb.get();
            customerInstance.setFirstName(customer.getFirstName());
            customerInstance.setLastName(customer.getLastName());
            customerInstance.setEmail(customer.getEmail());
            customerInstance.setMobile(customer.getMobile());
            return customerInstance;
        }else{
            throw new ResourceNotFoundException("Customer not found");
        }
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerByEmail(String email) {
        return customerRepository.findByEmail(email);
    }
}
