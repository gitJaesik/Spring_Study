package com.study.toto.dao;

import com.study.toto.model.entity.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonMapper {

    @Select("SELECT * FROM person")
    List<Person> findAllPerson();

    @Select("SELECT * FROM person WHERE id = #{id}")
    Person findById(long id);

    Person findById2(long id);

    @Insert("INSERT INTO person (name, sex) VALUES(#{name}, #{sex})")
    void savePerson(@Param("name")String name, @Param("sex")String sex);


    @Update("UPDATE person SET name = #{name} WHERE id = #{id}")
    void changePersonInfo(@Param("id")Long id, @Param("name")String name);
}


