package com.example.consumer;

import com.example.api.pojo.Dept;
import com.example.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class DeptController {

    /**
     * 使用服务名，不能写死
     */
    @Autowired
    private FeignService service;

    @GetMapping("dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.queryById(id);
    }

    @GetMapping("dept/list")
    public List<Dept> list() {
        return service.queryAll();
    }

    @PostMapping("dept/add")
    public Boolean add(@RequestBody Dept dept) {
        return service.addDept(dept);
    }
}
