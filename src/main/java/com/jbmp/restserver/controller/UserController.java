package com.jbmp.restserver.controller;

import com.jbmp.restserver.data.User;
import com.jbmp.restserver.data.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping("/{id}")
    public User user(@PathVariable("id") Long id) {
        return new User(1L, "Josef Novák", 28);
    }

    @GetMapping
    public Users users() {
        List<User> users = Arrays.asList(
                new User(1L, "Josef Novák", 28),
                new User(2L, "Karel Hruška", 60)
        );
        return new Users(users);
    }

}
