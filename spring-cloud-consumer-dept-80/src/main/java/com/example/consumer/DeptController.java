package com.example.consumer;

import com.example.api.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class DeptController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 使用服务名，不能写死
     */
    private static final String URL_PREFIX = "http://SPRING-CLOUD-PROVIDER-DEPT";
    // private static final String URL_PREFIX = "http://localhost:8001";

    @GetMapping("dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(URL_PREFIX + "/dept/list", List.class);
    }

    @PostMapping("dept/add")
    public Boolean add(@RequestBody Dept dept) {
        return restTemplate.postForObject(URL_PREFIX + "/dept/add", dept, Boolean.class);
    }
}
