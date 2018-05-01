package com.study.toto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    // TODO 2 "/"로 요청이 들어오면 "Hello"을 리턴하는 RestController 작성
    @GetMapping("/")
    public String Hello () {
        return "Hello";
    }
}
