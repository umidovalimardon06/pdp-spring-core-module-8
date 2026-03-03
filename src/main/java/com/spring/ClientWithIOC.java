package com.spring;

import com.spring.config.AppConfig;
import com.spring.services.interfaces.ServiceOne;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientWithIOC {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        isSameHashCode(context);
    }

    private static void isSameHashCode(ApplicationContext context) {
        for (int i = 1; i < 10; i++) {
            ServiceOne instance = context.getBean("serviceOneImplementation", ServiceOne.class);
            System.out.println(instance.hashCode());
        }
    }
}
