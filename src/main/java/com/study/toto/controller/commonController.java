package com.study.toto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class commonController {

    @GetMapping("/")
    public String index() {
       return "main";
    }

}
