package com.example;

import com.self.SelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 微服务启动后，加载自定义的 Ribbon，configuration 的类不应该被扫描到
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "SPRING-CLOUD-PROVIDER-DEPT", configuration = SelfRule.class)
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
