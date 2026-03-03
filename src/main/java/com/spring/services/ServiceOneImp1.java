package com.spring.services;

import com.spring.services.interfaces.ServiceOne;

public class ServiceOneImp1 implements ServiceOne {
    @Override
    public void serviceOneGreets() {
        System.out.println("Greetings from service one!");
    }
}
