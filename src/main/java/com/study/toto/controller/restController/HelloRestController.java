package com.study.toto.controller.restController;

import com.study.toto.model.entity.Person;
import com.study.toto.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    private final PersonService personService;

    @Autowired
    public HelloRestController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/hello")
    public String Hello() {
        return "Hello";
    }

    @GetMapping("/person/{id}")
    public Person findPerson(@PathVariable("id") Long id) {
        return personService.findPerson(id);
    }

    @PostMapping("/person")
    public void savePerson(@RequestParam String name, @RequestParam String sex) {
        personService.savePerson(name, sex);
    }

}
