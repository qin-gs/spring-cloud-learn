package com.example.provider.controller;

import com.example.api.pojo.Dept;
import com.example.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService service;
    @Autowired
    private DiscoveryClient client;

    @PostMapping("/add")
    boolean addDept(Dept dept) {
        return service.addDept(dept);
    }

    @GetMapping("/get/{id}")
    public Dept queryById(@PathVariable("id") Long id) {
        return service.queryById(id);
    }

    @GetMapping("/list")
    public List<Dept> queryAll() {
        return service.queryAll();
    }

    /**
     * 获取当前服务的信息
     */
    @GetMapping("discovery")
    public Object discovery() {
        List<String> services = client.getServices();
        System.out.println(services);

        List<ServiceInstance> instances = client.getInstances("SPRING-CLOUD-PROVIDER-DEPT-8001");
        instances.forEach(instance -> {
            System.out.println(instance.getHost());
            System.out.println(instance.getInstanceId());
            System.out.println(instance.getPort());
            System.out.println(instance.getUri());
        });
        return client;
    }
}
