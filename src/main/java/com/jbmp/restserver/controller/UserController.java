package com.jbmp.restserver.controller;

import com.jbmp.restserver.data.User;
import com.jbmp.restserver.data.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    Logger logger = LoggerFactory.getLogger(getClass());

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

    @PostMapping("/user")
    public User user(@RequestBody User user) {
        logger.info("Saving " + user);
        return user;
    }

}
