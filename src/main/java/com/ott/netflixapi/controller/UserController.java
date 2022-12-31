package com.ott.netflixapi.controller;

import com.ott.netflixapi.entity.User;
import com.ott.netflixapi.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/users")
    public User createUser(@RequestBody User request){
        User last = userRepository.findTopByOrderByIdDesc();
        long lastNum = last!=null?last.getId():0;
        request.setId(lastNum+1);
        return userRepository.save(request);
    }

    @GetMapping("/users")
    public List getUsers(){
        List list = userRepository.findAll();
        return list;
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id){
        User user = userRepository. findById(id).orElseThrow();
        return user;
    }

    @PutMapping("/users/{id}")
    public User updateUser(@RequestBody User request,@PathVariable Long id){
       User user =  userRepository.findById(id).orElseThrow();
       user.setUsername(request.getUsername());
       return userRepository.save(user);
    }
}
