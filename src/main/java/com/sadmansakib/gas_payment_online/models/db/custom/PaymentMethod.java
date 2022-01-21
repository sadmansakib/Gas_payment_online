package com.sadmansakib.gas_payment_online.models.db.custom;

public enum PaymentMethod {
    BKASH("bkash"), NAGAD("nagad"), PORTWALLET("portwallet");

    private final String method;

    PaymentMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
