package com.dr;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

@EnableEurekaClient
@SpringBootApplication
public class ProviderServerMain {
    public static void main(String[] args) {
        System.out.println("请输入服务启动端口：");
        Scanner scanner = new Scanner(System.in);
        int port = scanner.nextInt();
        // 服务端需重复启动，不依赖application.yml里的server.port了，而是依赖输入的port
        SpringApplicationBuilder main = new SpringApplicationBuilder(ProviderServerMain.class).properties("server.port=" + port);
        main.run(args);

    }
}
