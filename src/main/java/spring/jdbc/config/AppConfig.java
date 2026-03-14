package spring.jdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("spring.jdbc")
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        String database_url = System.getenv("DB_URL");
        String database_username = System.getenv("DB_USER");
        String database_password = System.getenv("DB_PASSWORD");


        dataSource.setDriverClassName("org.postgresql.Driver");

        dataSource.setUrl(database_url);
        dataSource.setUsername(database_username);
        dataSource.setPassword(database_password);

        return dataSource;
    }
}
