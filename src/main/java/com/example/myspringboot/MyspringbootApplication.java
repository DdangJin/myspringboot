package com.example.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyspringbootApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MyspringbootApplication.class, args);
        SpringApplication app = new SpringApplication(
                                        MyspringbootApplication.class);

        app.run(args);
    }

}
