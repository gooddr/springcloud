package com.dr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProvideServerMain {
    public static void main(String[] args) {
        SpringApplication.run(ProvideServerMain.class, args);
    }
}
