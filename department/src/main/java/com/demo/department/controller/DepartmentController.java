package com.demo.department.controller;

import com.demo.department.entity.Department;
import com.demo.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/savedepartment")
    public Department saveDepartmentDetails(@RequestBody Department department){
        return departmentService.saveDepartmentDetails(department);
    }

    @GetMapping("/getdepartment/{userId}")
    public List<Department> getDepartmentDetails(@PathVariable("userId") Long userId){
        return departmentService.getDepartmentDetails(userId);
    }

}
