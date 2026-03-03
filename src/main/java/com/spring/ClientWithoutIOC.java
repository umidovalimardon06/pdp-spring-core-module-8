package com.spring;

import com.spring.services.ServiceOneImp1;

public class ClientWithoutIOC {
    public static void main(String[] args) {

        for(int i=1; i <= 10; i++) {
            ServiceOneImp1 serviceOneInstance = new ServiceOneImp1();
            System.out.println(serviceOneInstance.hashCode());
        }

    }

}

