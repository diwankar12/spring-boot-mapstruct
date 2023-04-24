package com.springboot.mapstruct.springbootmapstruct.service;

import com.springboot.mapstruct.springbootmapstruct.dto.OrderDTO;
import com.springboot.mapstruct.springbootmapstruct.entity.Order;
import com.springboot.mapstruct.springbootmapstruct.mapper.OrderMapper;
import com.springboot.mapstruct.springbootmapstruct.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderMapper orderMapper;

    public Order saveOrder(OrderDTO orderDTO) {
        return orderRepository.save(orderMapper.toEntity(orderDTO));
    }

    public OrderDTO getOrderById(Long id) {
        return orderRepository.findById(id)
                .map(orderMapper::toDTO)
                .orElse(new OrderDTO());
    }

}
