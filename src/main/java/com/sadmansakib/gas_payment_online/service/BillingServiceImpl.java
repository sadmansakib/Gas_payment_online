package com.sadmansakib.gas_payment_online.service;

import com.sadmansakib.gas_payment_online.exception.ResourceNotFoundException;
import com.sadmansakib.gas_payment_online.models.db.Billing;
import com.sadmansakib.gas_payment_online.models.db.Customer;
import com.sadmansakib.gas_payment_online.repository.BillingRepository;
import com.sadmansakib.gas_payment_online.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BillingServiceImpl implements BillingService{

    @Autowired
    private BillingRepository billingRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Billing submitBill(Billing billing) {
        return null;
    }

    @Override
    public List<Billing> getBillsByCustomerID(long id) {
        Optional<Customer> customerDb = customerRepository.findById(id);
        if(customerDb.isPresent()){
            Customer customer = customerDb.get();
            return billingRepository.findAllByCustomer(customer);
        }else{
            throw new ResourceNotFoundException("Customer not found");
        }
    }
}
