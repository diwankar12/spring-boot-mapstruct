package com.springboot.mapstruct.springbootmapstruct.dto;

import lombok.Data;

@Data
public class ContactDTO {
    private long id ;
    private String firstName ;
    private String lastName ;
    private String email ;
    private String phoneNumber ;
}
