package com.example.myspringboot.helloworld;

import lombok.Data;

@Data
public class HelloWorldBean {
    private String name;

    public HelloWorldBean(String name) {
        this.name = name;
    }
}
