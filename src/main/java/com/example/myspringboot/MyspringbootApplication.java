package com.example.myspringboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class MyspringbootApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MyspringbootApplication.class, args);
        SpringApplication app = new SpringApplication(
                                        MyspringbootApplication.class);
        app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                out.print("\n\nTest My Banner!\n\n".toUpperCase());
            }
        });

        app.run(args);
    }

}
