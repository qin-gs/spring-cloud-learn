package com.example.provider.service;

import com.example.api.pojo.Dept;
import com.example.provider.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    private DeptDao dao;

    public boolean addDept(Dept dept) {
        return dao.addDept(dept);
    }

    public Dept queryById(Long id) {
        return dao.queryById(id);
    }

    public List<Dept> queryAll() {
        return dao.queryAll();
    }
}
