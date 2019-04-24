package com.example.myspringboot.auth;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="account_name")
    private String account_name;
    @Column(name="password")
    private String password;
    @Column(name="enabled1")
    private String enabled1;
    @Column(name="enabled2")
    private String enabled2;
    @Column(name="enabled3")
    private String enabled3;
    @Column(name="enabled4")
    private String enabled4;

    public Account(String account_name, String password, String enabled1, String enabled2, String enabled3, String enabled4) {
        this.account_name = account_name;
        this.password = password;
        this.enabled1 = enabled1;
        this.enabled2 = enabled2;
        this.enabled3 = enabled3;
        this.enabled4 = enabled4;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account_name='" + account_name + '\'' +
                ", password='" + password + '\'' +
                ", enabled1='" + enabled1 + '\'' +
                ", enabled2='" + enabled2 + '\'' +
                ", enabled3='" + enabled3 + '\'' +
                ", enabled4='" + enabled4 + '\'' +
                '}';
    }
}
