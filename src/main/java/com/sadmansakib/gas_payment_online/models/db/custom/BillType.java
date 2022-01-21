package com.sadmansakib.gas_payment_online.models.db.custom;

public enum BillType {
    PREPAID("prepaid"), POSTPAID("postpaid");

    private final String type;

    BillType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
