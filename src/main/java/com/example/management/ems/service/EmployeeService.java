package com.example.management.ems.service;

import com.example.management.ems.entity.Employee;
import com.example.management.ems.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public Employee addEmployee(Employee e) {
        return employeeRepo.save(e);
    }

    public String deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
        return "Employee deleted";
    }

    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    public Employee getEmployee(Long id) {
        return employeeRepo.findById(id).get();
    }
}
