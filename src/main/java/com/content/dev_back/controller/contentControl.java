package com.content.dev_back.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.content.dev_back.services.contentServices;
import com.content.dev_back.controller.dto.JoinRequest;

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
    public String join(@RequestBody JoinRequest joinRequest){

//        String id = joinRequest.getId();
//        String name = joinRequest.getName();
//        String phoneNumber = joinRequest.getPhoneNumber();

        String result = contentServices.join(joinRequest);
//        if (result == null) {
//            return "Check Data";
//        }else
        if("success".equalsIgnoreCase(result)){
            System.out.println("인풋 = " + result);
            return "success";
        }else{
            return "fail";
        }
    }
}


