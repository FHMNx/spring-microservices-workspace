package com.example.department_service.service;

import com.example.department_service.model.Department;
import com.example.department_service.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepo departmentRepo;

    public List<Department> getAllDepartments() {
       return departmentRepo.findAll();
    }

    public Department getDepartmentById(Integer id) {
        return departmentRepo.findById(id).get();
    }

    public Department addDepartment(Department department) {
        return departmentRepo.save(department);
    }
}
