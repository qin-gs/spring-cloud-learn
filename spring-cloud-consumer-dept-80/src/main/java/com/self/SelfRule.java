package com.self;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这个类不应该被扫描到
 */
@Configuration
public class SelfRule {

    /**
     * 自定义负载均衡算法
     */
    @Bean
    public IRule iRule() {
        return new RandomRule();
    }
}
