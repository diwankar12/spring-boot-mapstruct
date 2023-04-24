package com.springboot.mapstruct.springbootmapstruct.mapper;

import com.springboot.mapstruct.springbootmapstruct.dto.EmployeeDTO;
import com.springboot.mapstruct.springbootmapstruct.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {DepartmentMapper.class})
public interface EmployeeMapper {

    @Mapping(source="empName",target="name")
    @Mapping(source="empId",target="id")
    //@Mapping(source = "departmentName",target = "department.deptName")
    @Mapping(source = "departmentDTO",target = "department")
    Employee toEntity(EmployeeDTO employeeDTO) ;

    @Mapping(source="name",target="empName")
    @Mapping(source="id",target="empId")
    //@Mapping(source="department.deptName",target="departmentName")
    @Mapping(source="department",target="departmentDTO")
    EmployeeDTO toDTO(Employee employee);

}
