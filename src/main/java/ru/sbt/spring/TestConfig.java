package ru.sbt.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class TestConfig {
    /*@Bean
    public ComponentTest componentTest() {
        return new ComponentTest("http", "1abc332");
    }*/

    @Bean
    public String url() {
        return "http";
    }

    @Bean
    public String token() {
        return "12abc32";
    }
}