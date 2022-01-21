package com.sadmansakib.gas_payment_online.models.db.custom;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class BillTypeConverter implements AttributeConverter<BillType, String> {
    @Override
    public String convertToDatabaseColumn(BillType billType) {
        return billType == null ? null : billType.getType();
    }

    @Override
    public BillType convertToEntityAttribute(String s) {
        if (s == null) {
            return null;
        }

        return Stream.of(BillType.values())
                .filter(billType -> billType.getType().equals(s))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
