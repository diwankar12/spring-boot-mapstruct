package com.springboot.mapstruct.springbootmapstruct.controller;

import com.springboot.mapstruct.springbootmapstruct.dto.OrderDTO;
import com.springboot.mapstruct.springbootmapstruct.entity.Order;
import com.springboot.mapstruct.springbootmapstruct.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<Order> saveOrder(@RequestBody OrderDTO orderDTO) {
        return ResponseEntity.ok(orderService.saveOrder(orderDTO));
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<OrderDTO> getOrderById(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

}
