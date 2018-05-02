package com.study.toto.model.domain;

import java.io.Serializable;


public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String sex;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String name) {
        this.sex = name;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getSex();
    }
}
