package com.example.provider.controller;

import com.example.api.pojo.Dept;
import com.example.provider.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService service;

    /**
     * 加上熔断机制
     */
    @GetMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "error")
    public Dept queryById(@PathVariable("id") Long id) {
        Dept dept = service.queryById(id);
        if (dept == null) {
            throw new RuntimeException("找不到");
        }
        return dept;
    }

    public Dept error(Long id) {
        return Dept.Builder.aDept()
                .deptno(id)
                .dname("不存在")
                .build();
    }

}
