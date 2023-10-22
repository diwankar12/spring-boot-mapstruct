package com.springboot.mapstruct.springbootmapstruct.repository;

import com.springboot.mapstruct.springbootmapstruct.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
