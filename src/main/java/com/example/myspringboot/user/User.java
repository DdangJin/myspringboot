package com.example.myspringboot.user;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int id;
    private String name;
    private Date birthDate;

    public User(int id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
