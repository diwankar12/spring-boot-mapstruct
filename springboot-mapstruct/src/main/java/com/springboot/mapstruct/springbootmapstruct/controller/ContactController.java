package com.springboot.mapstruct.springbootmapstruct.controller;

import com.springboot.mapstruct.springbootmapstruct.dto.ContactDTO;
import com.springboot.mapstruct.springbootmapstruct.entity.Contact;
import com.springboot.mapstruct.springbootmapstruct.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;



/*
* https://github.com/daisy-world/springboot-with-mapstruct-demo/blob/development/src/main/java/com/app/easy2excel/mapper/OrderMapper.java
* */
@Controller
public class ContactController {

    @Autowired
    ContactService contactService ;

    @PostMapping("/contact")
    public ResponseEntity<Contact> saveContact(@RequestBody ContactDTO contactDTO){
         return ResponseEntity.ok(contactService.saveContact(contactDTO));
    }

    @GetMapping("/contact/{id}")
    public ResponseEntity<ContactDTO> getContactById(@PathVariable Long id){
        return ResponseEntity.ok(contactService.getContactById(id));
    }

    @GetMapping("/contacts")
    public ResponseEntity<List<ContactDTO>> getContactList(){
        return ResponseEntity.ok(contactService.getContactList());
    }



}
