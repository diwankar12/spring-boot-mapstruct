package com.springboot.mapstruct.springbootmapstruct.repository;

import com.springboot.mapstruct.springbootmapstruct.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository  extends JpaRepository<Contact,Long> {
}
