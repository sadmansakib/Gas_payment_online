package com.sadmansakib.gas_payment_online.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@ConfigurationProperties(prefix = "gas.payment")
public class ConfigProperties {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
