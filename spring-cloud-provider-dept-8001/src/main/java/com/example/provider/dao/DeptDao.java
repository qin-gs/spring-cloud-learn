package com.example.provider.dao;

import com.example.api.pojo.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptDao {

    @Insert("insert into dept(dname, db_source) values #{dname}, database()")
    boolean addDept(Dept dept);

    @Select("select * from dept where deptno = #{id}")
    Dept queryById(Long id);

    @Select("select * from dept")
    List<Dept> queryAll();
}
