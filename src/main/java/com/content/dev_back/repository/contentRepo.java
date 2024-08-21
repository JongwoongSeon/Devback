package com.content.dev_back.repository;

import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import com.content.dev_back.repository.Entity.content;

public interface contentRepo extends JpaRepository<content, Long> {

}
