package com.vgalloy.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Vincent Galloy on 01/12/15.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class MainServer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainServer.class, args);
    }
}
