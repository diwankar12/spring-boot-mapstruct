package com.springboot.mapstruct.springbootmapstruct.repository;

import com.springboot.mapstruct.springbootmapstruct.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{}

