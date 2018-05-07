package com.study.toto.dao;

import com.study.toto.model.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonMapper {

    @Select("SELECT * FROM person WHERE id = #{id}")
    Person findById(long id);

    Person findById2(long id);
}

