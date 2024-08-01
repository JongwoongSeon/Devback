package com.content.dev_back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contentControl {

    @GetMapping("/hello")
    public String getHello(){
        return "first";
    }

    @PostMapping("/post")
    public String join(){
        return "string";
    }
}
