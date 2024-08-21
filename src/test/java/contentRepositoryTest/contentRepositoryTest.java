package com.content.dev_back.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.content.dev_back.repository.Entity.content;
import com.content.dev_back.repository.contentRepo;


@SpringBootTest
public class contentRepositoryTest {

    @Autowired
    private contentRepo contentRepo;

    @Test
    public void crudTest() {
        content Content = content.builder()
                .id("12321")
                .name("선종웅")
                .phoneNumber("010")
                .build();
        // create test

        contentRepo.save(Content);

        content foundcontent = contentRepo.findById(1l).get();
    }
}
