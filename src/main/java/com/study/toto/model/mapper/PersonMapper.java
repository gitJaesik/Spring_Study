package com.study.toto.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.study.toto.model.domain.Person;

@Mapper
public interface PersonMapper {

    @Select("SELECT TOP 1 * FROM person WHERE name=#{name}")
    Person findName(@Param("name") String name);
}

