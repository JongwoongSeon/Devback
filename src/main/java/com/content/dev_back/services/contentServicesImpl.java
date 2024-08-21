package com.content.dev_back.services;

import com.content.dev_back.repository.contentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class contentServicesImpl implements contentServices {

    private final contentRepo contentRepo;

    @Override
    public String join (String Id, String Name, String phoneNumber){
        return null;
    }


}
