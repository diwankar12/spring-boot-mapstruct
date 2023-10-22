package com.springboot.mapstruct.springbootmapstruct.mapper;

import com.springboot.mapstruct.springbootmapstruct.dto.EmployeeDetailsDTO;
import com.springboot.mapstruct.springbootmapstruct.entity.Department;
import com.springboot.mapstruct.springbootmapstruct.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeDetailsMapper {

    @Mapping(source = "employee.id",target = "empId")
    @Mapping(source = "employee.name", target = "empName")
    @Mapping(source = "department.deptName", target = "deptName")
    @Mapping(source = "department.id", target = "deptId")
    EmployeeDetailsDTO toEmployeeDetailsDTO(Employee employee, Department department);
}
