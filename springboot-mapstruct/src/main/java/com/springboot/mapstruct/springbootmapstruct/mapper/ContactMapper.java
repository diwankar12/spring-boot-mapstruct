package com.springboot.mapstruct.springbootmapstruct.mapper;


import com.springboot.mapstruct.springbootmapstruct.dto.ContactDTO;
import com.springboot.mapstruct.springbootmapstruct.entity.Contact;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactMapper {
    Contact toEntity(ContactDTO contactDTO);

    ContactDTO toDTO(Contact contact);

    List<ContactDTO> toDTOList(List<Contact> contacts);
}
