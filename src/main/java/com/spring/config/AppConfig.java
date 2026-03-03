package com.spring.config;

import com.spring.services.ServiceOneImp1;
import com.spring.services.interfaces.ServiceOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring")
public class AppConfig {
    @Bean
    public ServiceOne serviceOne() {
        return new ServiceOneImp1();
    }
}
