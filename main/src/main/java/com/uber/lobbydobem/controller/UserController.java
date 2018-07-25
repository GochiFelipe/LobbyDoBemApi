package com.uber.lobbydobem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uber.lobbydobem.model.User;
import com.uber.lobbydobem.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/user")
    public List<?> listUser(){
        return userService.findAll();
    }
    
    @GetMapping("/{email}")
    public User findUserByEmail(@PathVariable(value = "email") String email) {
    	return userService.findByEmail(email);
    }

    @PostMapping("/user")
    public User create(@RequestBody User user){
    	user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userService.save(user);
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable(value = "id") Long id){
        userService.delete(id);
        return "success";
    }

}