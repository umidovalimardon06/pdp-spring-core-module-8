package spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import spring.jdbc.config.AppConfig;
import javax.sql.DataSource;

@Component
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        DataSource dataSource = context.getBean(DataSource.class);

        DriverManagerDataSource ds = (DriverManagerDataSource) dataSource;
        System.out.println("URL: " + ds.getUrl());
        System.out.println("Username: " + ds.getUsername());
        System.out.println("Password: " + ds.getPassword());
    }
}
