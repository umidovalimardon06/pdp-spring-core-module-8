package com.spring.services;

import com.spring.services.interfaces.ServiceOne;
import org.springframework.stereotype.Component;

@Component
public class ServiceOneImp1 implements ServiceOne {
    @Override
    public void serviceOneGreets() {
        System.out.println("Greetings from service one!");
    }
}
