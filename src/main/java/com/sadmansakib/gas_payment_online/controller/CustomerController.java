package com.sadmansakib.gas_payment_online.controller;

import com.sadmansakib.gas_payment_online.models.db.Customer;
import com.sadmansakib.gas_payment_online.models.dto.CustomerDto;
import com.sadmansakib.gas_payment_online.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ModelMapper modelMapper;


    private CustomerDto convertToCustomerDto(Customer customer){
        return modelMapper.map(customer, CustomerDto.class);
    }

    private Customer convertToCustomerEntity(CustomerDto customerDto){
        return modelMapper.map(customerDto, Customer.class);
    }

    public ResponseEntity<CustomerDto> createAccount(@RequestBody CustomerDto customerDto){
        Customer customer = convertToCustomerEntity(customerDto);
        Customer createdCustomer = customerService.createCustomer(customer);
        return ResponseEntity.ok(convertToCustomerDto(createdCustomer));
    }
}
