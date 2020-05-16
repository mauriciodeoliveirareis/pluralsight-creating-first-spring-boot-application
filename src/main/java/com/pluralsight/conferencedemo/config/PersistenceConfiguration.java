package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        System.out.println("My custom data source is being built");
//        builder.url("jdbc:postgresql://localhost:5432/conference_app");
//        builder.username("postgres");
//        builder.password("Welcome");
//        return builder.build();
//    }

}
