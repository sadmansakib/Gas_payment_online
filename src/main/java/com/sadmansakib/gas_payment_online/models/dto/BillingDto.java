package com.sadmansakib.gas_payment_online.models.dto;

import com.sadmansakib.gas_payment_online.models.db.custom.BillType;
import com.sadmansakib.gas_payment_online.models.db.custom.PaymentMethod;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BillingDto implements Serializable {
    private final CustomerDto customer;
    private final String mobile;
    private final BillType billType;
    private final int equipmentCount;
    private final float amount;
    private final AccountDto account;
    private final PaymentMethod paymentMethod;
    private final Date submitDate;
}
