package com.springboot.mapstruct.springbootmapstruct.dto;

import lombok.Data;

@Data
public class OrderDTO {

    private Long id;

    private String orderAmount;

    private String description;

    private String orderDate;

    private String orderStatus;

    private int quantity;

    private float sum;

}
