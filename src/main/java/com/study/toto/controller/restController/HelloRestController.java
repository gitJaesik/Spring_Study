package com.study.toto.controller.restController;

import com.study.toto.model.entity.Person;
import com.study.toto.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/persons")
    public List<Person> findAllPerson() {
        return personService.findAllPerson();
    }

    @GetMapping("/persons/{id}")
    public Person findPerson(@PathVariable("id") Long id) {
        return personService.findPerson(id);
    }

    @PostMapping("/persons")
    public void savePerson(@RequestParam String name, @RequestParam String sex) {
        personService.savePerson(name, sex);
    }

    @PutMapping("/persons")
    public void changePersonInfo(@RequestParam Long id, @RequestParam String name) {
        personService.changePersonName(id, name);
    }
}
