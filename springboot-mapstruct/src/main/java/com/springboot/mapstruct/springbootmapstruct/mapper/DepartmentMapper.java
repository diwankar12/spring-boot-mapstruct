package com.springboot.mapstruct.springbootmapstruct.mapper;

import com.springboot.mapstruct.springbootmapstruct.dto.DepartmentDTO;
import com.springboot.mapstruct.springbootmapstruct.entity.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    Department toEntity(DepartmentDTO departmentDTO);

    DepartmentDTO toDTO(Department department);


}
