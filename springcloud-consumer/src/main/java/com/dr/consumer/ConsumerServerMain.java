package com.dr.consumer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerServerMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerServerMain.class, args);
    }
}
