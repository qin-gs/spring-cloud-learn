package com.example.provider;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * 自动注册到 eureka 中，
 * 服务发现，断路器
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class DeptHystrix8001Application {
    public static void main(String[] args) {
        SpringApplication.run(DeptHystrix8001Application.class, args);
    }

    /**
     * 添加监控
     */
    @Bean
    public ServletRegistrationBean<HystrixMetricsStreamServlet> hystrixMetricsStreamServlet() {
        ServletRegistrationBean<HystrixMetricsStreamServlet> bean = new ServletRegistrationBean<>(new HystrixMetricsStreamServlet());
        bean.addUrlMappings("/actuator/hystrix.stream");
        return bean;
    }
}
