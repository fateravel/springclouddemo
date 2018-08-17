package com.pengsong.servicehi.controller;

import com.pengsong.servicehi.model.User;
import com.pengsong.servicehi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengsong
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User createUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        return userService.create(username, password);
    }
}
