package com.spring.config;

import com.spring.services.ServiceOneImp1;
import com.spring.services.interfaces.ServiceOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring")
public class AppConfig {

    @Bean("serviceOneImplementation")
    public ServiceOne serviceOneImplementation() {
        return new ServiceOneImp1();
    }

}
