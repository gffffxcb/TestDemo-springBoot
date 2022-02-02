package com.mgh.testdemospringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.mgh.testdemospringboot")
@MapperScan("com.mgh.testdemospringboot.mapper")
public class TestDemoSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDemoSpringBootApplication.class, args);
    }

}
