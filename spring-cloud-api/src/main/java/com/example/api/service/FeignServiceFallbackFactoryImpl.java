package com.example.api.service;

import com.example.api.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeignServiceFallbackFactoryImpl implements FallbackFactory<FeignService> {
    @Override
    public FeignService create(Throwable throwable) {
        return new FeignService() {
            @Override
            public Dept queryById(Long id) {
                return Dept.Builder.aDept()
                        .deptno(id)
                        .dname("服务降级导致不可用")
                        .build();
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
