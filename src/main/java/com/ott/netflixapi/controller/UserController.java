package com.ott.netflixapi.controller;

import com.ott.netflixapi.entity.User;
import com.ott.netflixapi.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/users")
    public User createUser(@RequestBody User response){
        User last = userRepository.findTopByOrderByIdDesc();
        long lastNum = last.getId();
        response.setId(lastNum+1);
        return userRepository.save(response);
    }

    @GetMapping("/users")
    public List getUsers(){
        List list = userRepository.findAll();
        return list;
    }
}
