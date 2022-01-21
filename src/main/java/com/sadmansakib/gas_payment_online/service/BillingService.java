package com.sadmansakib.gas_payment_online.service;

import com.sadmansakib.gas_payment_online.models.db.Billing;

import java.util.List;

public interface BillingService {
    Billing submitBill(Billing billing);
    List<Billing> getBillsByCustomerID(long id);
}
