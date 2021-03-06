package com.example.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 自动注册到 eureka 中，
 * 服务发现
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ConfigDept8001Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigDept8001Application.class, args);
    }
}
