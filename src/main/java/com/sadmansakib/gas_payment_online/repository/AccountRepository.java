package com.sadmansakib.gas_payment_online.repository;

import com.sadmansakib.gas_payment_online.models.db.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}