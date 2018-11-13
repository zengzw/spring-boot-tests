package com.phoenixt.learn.springbootgroup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication

@MapperScan("com.phoenixt.learn.springbootgroup.mapper")
@EnableCaching
public class SpringbootgroupApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootgroupApplication.class, args);
    }
}
