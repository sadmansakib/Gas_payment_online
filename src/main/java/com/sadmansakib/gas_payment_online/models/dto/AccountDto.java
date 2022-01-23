package com.sadmansakib.gas_payment_online.models.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AccountDto implements Serializable {
    private final BigDecimal money;
}
