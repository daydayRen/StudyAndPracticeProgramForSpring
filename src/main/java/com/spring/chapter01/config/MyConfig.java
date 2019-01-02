package com.spring.chapter01.config;

import com.spring.chapter01.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Person person(){
        return new Person("lisi",16);
    }
}
