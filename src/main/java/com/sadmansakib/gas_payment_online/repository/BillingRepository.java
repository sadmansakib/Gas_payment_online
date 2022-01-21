package com.sadmansakib.gas_payment_online.repository;

import com.sadmansakib.gas_payment_online.models.db.Billing;
import com.sadmansakib.gas_payment_online.models.db.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillingRepository extends JpaRepository<Billing, Long> {
    List<Billing> findAllByCustomer(Customer customer);
}