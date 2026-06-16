package com.broker.kafkaspringboot.section2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class Section2Runner {

    @SpringBootApplication(scanBasePackages = "com.broker.kafkaspringboot.section2.consumer")
    static class Consumer {

        public static void main(String[] args) {
            SpringApplication.run(Consumer.class,
                    "--section=section2",
                    "--config=01-consumer");
        }
    }

    @SpringBootApplication(scanBasePackages = "com.broker.kafkaspringboot.section2.producer")
    static class Producer {

        public static void main(String[] args) {
            SpringApplication.run(Producer.class,
                    "--section=section2",
                    "--config=01-producer");
        }
    }

}

