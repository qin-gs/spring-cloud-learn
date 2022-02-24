package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 微服务启动后，加载自定义的 Ribbon，configuration 的类不应该被扫描到
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.example"})
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
