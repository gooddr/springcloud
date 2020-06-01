package com.dr.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurekaSeverMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSeverMain.class, args);
    }
}
