package com.study.toto.controller;

import com.study.toto.model.entity.Person;
import com.study.toto.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloRestController {

    @Autowired
    PersonService personService;

    @GetMapping("/")
    public String Hello () {
        return "Hello";
    }

    @GetMapping("/person/{id}")
    public Person findPerson(@PathVariable("id") Long id) {
        return personService.findPerson(id);
    }

    @PostMapping("/person")
    public void savePerson(HttpServletRequest request, HttpServletResponse response ) {
        String name;
        name = request.getParameter("name");
        String sex;
        sex = request.getParameter("sex");

        personService.savePerson(name, sex);
    }

}
