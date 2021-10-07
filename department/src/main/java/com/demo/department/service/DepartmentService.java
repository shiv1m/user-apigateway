package com.demo.department.service;

import com.demo.department.entity.Department;

import java.util.List;

public interface DepartmentService {
Department saveDepartmentDetails(Department department);
List<Department> getDepartmentDetails(Long userId);
}
