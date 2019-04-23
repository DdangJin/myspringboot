package com.example.myspringboot.filter;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Data;

@Data
@JsonFilter("MyBeanFilter")
public class MyBean {
    private String name;
    private String age;
    private String address;

    public MyBean(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
