package com.content.dev_back.repository.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Builder
@Getter

public class content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long index;

    private String id;

    private String name;

    private String phoneNumber;

}