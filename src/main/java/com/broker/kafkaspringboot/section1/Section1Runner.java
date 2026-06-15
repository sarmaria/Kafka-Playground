package com.broker.kafkaspringboot.section1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Section1Runner {

    public static void main(String[] args) {
        SpringApplication.run(Section1Runner.class,
                "--section=section1",
                "--config=02-from-beginning");
    }

}

