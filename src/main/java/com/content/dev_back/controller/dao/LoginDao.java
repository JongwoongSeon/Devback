package com.content.dev_back.controller.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.content.dev_back.repository.contentRepo;

import javax.sql.DataSource;


@Repository
public class LoginDao {
    private JdbcTemplate jdbcTemplate;

//    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public long checkUser(String email, String passwd){
        String checksql = "SELECT email,passwd FROM login;";

        System.out.println(checksql);
        return 0;
    }
}
