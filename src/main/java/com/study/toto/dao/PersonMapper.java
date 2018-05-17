package com.study.toto.dao;

import com.study.toto.model.entity.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonMapper {

    @Select("SELECT * FROM person WHERE id = #{id}")
    Person findById(long id);

    Person findById2(long id);

    @Insert("INSERT INTO person (name, sex) VALUES(#{name}, #{sex})")
    void savePerson(@Param("name")String name, @Param("sex")String sex);
}


