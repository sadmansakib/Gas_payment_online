package com.sadmansakib.gas_payment_online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.sadmansakib.gas_payment_online.configuration")
public class GasPaymentOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(GasPaymentOnlineApplication.class, args);
    }
}
