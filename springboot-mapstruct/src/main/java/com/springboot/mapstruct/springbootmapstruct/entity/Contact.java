package com.springboot.mapstruct.springbootmapstruct.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Contact")
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id ;

    @Column(name = "first_name")
    private String firstName ;

    @Column(name="last_Name")
    private String lastName ;

    @Column(name = "email")
    private String email ;

    @Column(name = "phone_number")
    private String phoneNumber ;

}
