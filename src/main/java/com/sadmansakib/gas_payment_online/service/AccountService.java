package com.sadmansakib.gas_payment_online.service;

import com.sadmansakib.gas_payment_online.models.db.Account;

import java.math.BigDecimal;

public interface AccountService {
    Account createAccount(Account account);
    Account updateAccountBalance(long id, BigDecimal balance);
}
