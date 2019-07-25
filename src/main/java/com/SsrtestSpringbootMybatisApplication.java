package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.ssrtest03.mapper"})

public class SsrtestSpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsrtestSpringbootMybatisApplication.class, args);
    }

}
