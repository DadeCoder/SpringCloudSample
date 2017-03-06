package com.example;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Dade on 2017/3/6.
 */
@Document( collection = "user")
public class User{

    Integer age;
    String name;

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
