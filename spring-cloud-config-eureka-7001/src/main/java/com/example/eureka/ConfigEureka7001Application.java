package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 开启 eureka 服务端，接受别人注册
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEureka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEureka7001Application.class, args);
    }
}
