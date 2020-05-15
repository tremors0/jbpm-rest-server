package com.jbmp.restserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpamController {

    @GetMapping("/spamControl")
    public boolean spamControl() {
        double rand = Math.floor(Math.random() * 10);
        return rand >= 2;
    }

}
