package com.content.dev_back.services;

import com.content.dev_back.repository.contentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.content.dev_back.repository.Entity.content;
import com.content.dev_back.controller.dto.JoinRequest;

@Service
@RequiredArgsConstructor
public class contentServicesImpl implements contentServices {

    private final contentRepo contentRepo;

    @Override
    public String join (JoinRequest joinRequest){
        content Content = content.builder()
                .id(joinRequest.getId())
                .name(joinRequest.getName())
                .phoneNumber(joinRequest.getPhoneNumber())
                .build();
        contentRepo.save(Content);
        return "success";
    }


}
