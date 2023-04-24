package com.springboot.mapstruct.springbootmapstruct.controller;

import com.springboot.mapstruct.springbootmapstruct.dto.EmployeeDTO;
import com.springboot.mapstruct.springbootmapstruct.dto.EmployeeDetailsDTO;
import com.springboot.mapstruct.springbootmapstruct.entity.Employee;
import com.springboot.mapstruct.springbootmapstruct.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(EmployeeDTO employeeDTO){

        return ResponseEntity.ok(employeeService.saveEmployee(employeeDTO));
    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }
    @GetMapping("/employee-details/{id}")
    public ResponseEntity<EmployeeDetailsDTO> getEmployeeDetailsById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeDetailsById(id));
    }


}
