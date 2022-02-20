package com.example.provider.controller;

import com.example.api.pojo.Dept;
import com.example.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService service;

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
}
