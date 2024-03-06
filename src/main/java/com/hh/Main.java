package com.hh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 黄昊
 * @version 1.0
 **/
//@ServletComponentScan(basePackages = "com.hh.springboot.servlet")
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplication().run(Main.class, args);
        System.out.println("hello1");

    }
}