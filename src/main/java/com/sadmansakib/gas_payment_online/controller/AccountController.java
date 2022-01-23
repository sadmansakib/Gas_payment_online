package com.sadmansakib.gas_payment_online.controller;

import com.sadmansakib.gas_payment_online.models.db.Account;
import com.sadmansakib.gas_payment_online.models.dto.AccountDto;
import com.sadmansakib.gas_payment_online.service.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private ModelMapper modelMapper;


    private AccountDto convertToAccountDto (Account account){
        return modelMapper.map(account, AccountDto.class);
    }

    private Account convertToAccountEntity(AccountDto accountDto){
        return modelMapper.map(accountDto, Account.class);
    }

    @PostMapping("/account")
    public ResponseEntity<AccountDto> CreateAccount(@RequestBody AccountDto accountDto){
        Account account = convertToAccountEntity(accountDto);
        Account createdAccount = accountService.createAccount(account);
        return ResponseEntity.ok(convertToAccountDto(createdAccount));
    }

    @PutMapping("/account")
    public ResponseEntity<Account> updateAccount(@RequestParam (name = "id") long id, @RequestParam(name = "amount") BigDecimal amount){
        Account updatedAccount = accountService.updateAccountBalance(id, amount);
        return ResponseEntity.ok(updatedAccount);
    }
}
