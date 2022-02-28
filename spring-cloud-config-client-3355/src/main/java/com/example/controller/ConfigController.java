package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    /**
     * 从 git 上读取配置
     */
    @Value("${eureka.client.serviceUrl.defaultZone}")
    private String defaultZone;

    @Value("${server.port}")
    private int port;

    @GetMapping("config")
    public String getConfig() {
        return defaultZone + "---" + port;
    }

}
