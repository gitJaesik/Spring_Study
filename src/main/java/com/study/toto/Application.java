package com.study.toto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.study.toto.model.mapper.PersonMapper;

@SpringBootApplication
public class Application {
    // TODO 3 Spring Application 시작점 만들기

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
