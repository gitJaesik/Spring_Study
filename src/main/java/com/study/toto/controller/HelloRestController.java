package com.study.toto.controller;

import com.study.toto.model.entity.Person;
import com.study.toto.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
