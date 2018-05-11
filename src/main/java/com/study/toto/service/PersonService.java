package com.study.toto.service;

import com.study.toto.model.entity.Person;
import com.study.toto.dao.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonMapper personMapper;

    public Person findPerson(long id) {
        return personMapper.findById(id);
    }

    public void savePerson(String name, String sex) {
        personMapper.savePerson(name, sex);
    }
}
