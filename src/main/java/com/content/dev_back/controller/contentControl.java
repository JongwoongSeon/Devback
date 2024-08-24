package com.content.dev_back.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.content.dev_back.services.contentServices;
import com.content.dev_back.controller.dto.JoinRequest;
import com.content.dev_back.controller.dao.LoginDao;

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

        String result = contentServices.join(joinRequest);

        if("success".equalsIgnoreCase(result)){
            System.out.println("인풋 = " + result);
            return "success";
        }else{
            return "fail";
        }
    }
}

//    @GetMapping("/login/test")
//    public String join(@RequestBody LoginDao loginDao){
//
//    }
