package com.sadmansakib.gas_payment_online.repository;

import com.sadmansakib.gas_payment_online.models.db.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
}