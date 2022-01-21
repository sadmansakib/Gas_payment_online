package com.sadmansakib.gas_payment_online.service;

import com.sadmansakib.gas_payment_online.exception.ResourceNotFoundException;
import com.sadmansakib.gas_payment_online.models.db.Account;
import com.sadmansakib.gas_payment_online.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Optional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccountBalance(long id, BigDecimal balance) {
        Optional<Account> accountDb = accountRepository.findById(id);
        if (accountDb.isPresent()){
            Account account = accountDb.get();
            account.setMoney(account.getMoney().add(balance));
            return account;
        }else{
            throw new ResourceNotFoundException("account not found");
        }
    }
}
