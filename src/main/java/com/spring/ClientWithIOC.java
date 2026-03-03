package com.spring;

import com.spring.services.ServiceOneImp1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientWithIOC {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-container.xml");

        isSingletonTestLoop(context);

    }

    private static void isSingletonTestLoop(ApplicationContext context) {
        for (int i = 1; i <= 10; i++) {
            ServiceOneImp1 serviceOneBeanFromContainer = context.getBean(ServiceOneImp1.class);
            System.out.println(serviceOneBeanFromContainer.hashCode());
        }
    }

}
