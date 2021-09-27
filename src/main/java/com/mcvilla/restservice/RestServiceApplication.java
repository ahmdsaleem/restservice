package com.mcvilla.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext context= SpringApplication.run(RestServiceApplication.class, args);

    }

}
