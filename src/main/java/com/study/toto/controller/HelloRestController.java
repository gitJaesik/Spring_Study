package com.study.toto.controller;

import com.study.toto.Application;
import com.study.toto.model.mapper.PersonMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    final public PersonMapper personMapper;

    public HelloRestController () {
        this.personMapper = null;
    }

    // TODO 2 "/"로 요청이 들어오면 "Hello"을 리턴하는 RestController 작성
    @GetMapping("/")
    public String Hello () {
        return "Hello";
    }



    @GetMapping("/person")
    public String HelloMyBatisAndH2 () {
        return this.personMapper.findName("jaesik").toString();
    }

}
