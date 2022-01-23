package com.sadmansakib.gas_payment_online.controller;

import com.sadmansakib.gas_payment_online.models.db.Billing;
import com.sadmansakib.gas_payment_online.models.dto.BillingDto;
import com.sadmansakib.gas_payment_online.service.BillingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BillingService billingService;


    private BillingDto convertToBillingDto (Billing billing){
        return modelMapper.map(billing, BillingDto.class);
    }

    private Billing convertToBillingEntity(BillingDto customerDto){
        return modelMapper.map(customerDto, Billing.class);
    }

    @PostMapping
    public ResponseEntity<BillingDto> submitBill(@RequestBody BillingDto billingDto){
        Billing billing = convertToBillingEntity(billingDto);
        Billing submittedBill = billingService.submitBill(billing);
        return ResponseEntity.ok(convertToBillingDto(submittedBill));
    }
}
