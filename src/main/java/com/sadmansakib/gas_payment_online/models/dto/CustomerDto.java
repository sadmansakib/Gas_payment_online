package com.sadmansakib.gas_payment_online.models.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerDto implements Serializable {
    private final String firstName;
    private final String lastName;
    private final String mobile;
    private final String email;
    private final String password;
}
