package com.springboot.mapstruct.springbootmapstruct.service;

import com.springboot.mapstruct.springbootmapstruct.dto.UserDTO;
import com.springboot.mapstruct.springbootmapstruct.entity.User;
import com.springboot.mapstruct.springbootmapstruct.mapper.UserMapper;
import com.springboot.mapstruct.springbootmapstruct.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository ;

    @Autowired
    UserMapper userMapper ;


    public User saveUser(UserDTO userDTO) {
         return userRepository.save(userMapper.toEntity(userDTO));
    }


    public UserDTO getUserById(Long id) {
        return userRepository.findById(id)
                .map(userMapper::toDto)
                .orElse(new UserDTO());
    }


    public List<UserDTO> getUserList() {
         List<User> users = userRepository.findAll();
         return userMapper.toDTOList(users);
    }
}

