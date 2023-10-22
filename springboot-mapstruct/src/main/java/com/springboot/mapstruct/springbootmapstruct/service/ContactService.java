package com.springboot.mapstruct.springbootmapstruct.service;


import com.springboot.mapstruct.springbootmapstruct.dto.ContactDTO;
import com.springboot.mapstruct.springbootmapstruct.entity.Contact;
import com.springboot.mapstruct.springbootmapstruct.mapper.ContactMapper;
import com.springboot.mapstruct.springbootmapstruct.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository ;

    @Autowired
    ContactMapper contactMapper ;

    public Contact saveContact(ContactDTO contactDTO) {

//           Contact contact = new Contact();
////		  contact.setFirstName(contactDTO.getFirstName());
////		  contact.setLastName(contactDTO.getLastName());
////		  contact.setEmail(contactDTO.getEmail());
////		  contact.setPhoneNumber(contactDTO.getPhoneNo()); ;
////		  return contactRepository.save(contact);

        return contactRepository.save(contactMapper.toEntity(contactDTO)) ;

    }

    public ContactDTO getContactById(Long id) {

		Optional<Contact> contact = contactRepository.findById(id);
	    ContactDTO  contactDTO = new ContactDTO();
		if(contact.isPresent()) {

			contactDTO.setId(id);
			contactDTO.setFirstName(contact.get().getFirstName());
			contactDTO.setLastName(contact.get().getLastName());
			contactDTO.setEmail(contact.get().getEmail());
			contactDTO.setPhoneNumber(contact.get().getPhoneNumber());
		}

		return contactDTO;

//        return contactRepository.findById(id)
//                .map(contactMapper::toDTO)
//                .orElse(new ContactDTO());


    }

    public List<ContactDTO> getContactList() {

		return contactRepository.findAll().stream().map(contact ->{

			ContactDTO  contactDTO = new ContactDTO();
			contactDTO.setId(contact.getId());
			contactDTO.setFirstName(contact.getFirstName());
			contactDTO.setLastName(contact.getLastName());
			contactDTO.setEmail(contact.getEmail());
			contactDTO.setPhoneNumber(contact.getPhoneNumber());
			return contactDTO ;
		}).collect(Collectors.toList());

//        List<Contact> contacts = 	contactRepository.findAll();
//        return  contactMapper.toDTOList(contacts);

    }





}
