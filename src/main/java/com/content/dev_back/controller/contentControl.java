package com.content.dev_back.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.content.dev_back.services.contentServices;
import com.content.dev_back.controller.dto.joinRequest;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class contentControl {

    private final contentServices contentServices;

    @GetMapping("/test")
    public String getHello(){
        return "first";
    }

    @PostMapping("/join")
    public String join(@RequestBody joinRequest joinRequest){

        String id = joinRequest.getId();
        String name = joinRequest.getName();
        String phoneNumber = joinRequest.getPhoneNumber();

        String result = contentServices.join(id, name, phoneNumber);
        if (result.equalsIgnoreCase("success")){
            return "success";
        }else{
            return "fail";
        }
    }
}


