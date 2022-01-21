package com.sadmansakib.gas_payment_online.models.db.custom;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class PaymentMethodConverter implements AttributeConverter<PaymentMethod, String> {
    @Override
    public String convertToDatabaseColumn(PaymentMethod paymentMethod) {
        return paymentMethod == null ? null : paymentMethod.getMethod();
    }

    @Override
    public PaymentMethod convertToEntityAttribute(String s) {
        if (s == null) {
            return null;
        }

        return Stream.of(PaymentMethod.values())
                .filter(paymentMethod -> paymentMethod.getMethod().equals(s))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
