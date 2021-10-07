package com.demo.department.service;

import com.demo.department.dao.DepartmentDao;
import com.demo.department.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public Department saveDepartmentDetails(Department department) {
        return departmentDao.save(department);
    }

    @Override
    public List<Department> getDepartmentDetails(Long userId) {
        List<Department> departmentList = departmentDao.findAll();
        return departmentList.stream().filter(department -> department.getUserId().equals(userId)).collect(Collectors.toList());

    }
}
