package com.springboot.mapstruct.springbootmapstruct.service;

import com.springboot.mapstruct.springbootmapstruct.dto.EmployeeDTO;
import com.springboot.mapstruct.springbootmapstruct.dto.EmployeeDetailsDTO;
import com.springboot.mapstruct.springbootmapstruct.entity.Employee;
import com.springboot.mapstruct.springbootmapstruct.mapper.EmployeeDetailsMapper;
import com.springboot.mapstruct.springbootmapstruct.mapper.EmployeeMapper;
import com.springboot.mapstruct.springbootmapstruct.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository ;

    @Autowired
    EmployeeMapper employeeMapper ;

    @Autowired
    EmployeeDetailsMapper employeeDetailsMapper ;


    public Employee saveEmployee(EmployeeDTO employeeDTO) {
          return employeeRepository.save(employeeMapper.toEntity(employeeDTO));
    }

    public EmployeeDTO getEmployeeById(Long id) {
        return employeeRepository.findById(id)
         .map(employeeMapper::toDTO)
         .orElse(new EmployeeDTO());
    }

    public EmployeeDetailsDTO getEmployeeDetailsById(Long id) {
        return employeeRepository.findById(id).
                map(emp-> employeeDetailsMapper.toEmployeeDetailsDTO(emp, emp.getDepartment())).orElse(new EmployeeDetailsDTO());

    }
}
