package com.spring.services;

import com.spring.services.interfaces.ServiceTwo;

public class ServiceOneImp2 implements ServiceTwo {
    @Override
    public void serviceTwoGreets() {
        System.out.println("Greetings from service two!");
    }
}
