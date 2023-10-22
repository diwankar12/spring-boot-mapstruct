package com.springboot.mapstruct.springbootmapstruct.repository;
import com.springboot.mapstruct.springbootmapstruct.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
