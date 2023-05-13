package com.example.hw20_docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Hello Docker App!";
    }

    @RequestMapping("/info")
    public String info() {
        return "This is the info page!";
    }
}
