package com.example.inboxapp;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;


@RestController
@SpringBootApplication

public class InboxAppApplication {




    public static void main(String[] args) {
        SpringApplication.run(InboxAppApplication.class, args);


    }

}
