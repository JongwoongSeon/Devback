package com.content.dev_back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class contentControl {

    @GetMapping("/test")
    public String getHello(){
        return "first";
    }

    @PostMapping("/join")
    public String join(){
        return "string";
    }
}


