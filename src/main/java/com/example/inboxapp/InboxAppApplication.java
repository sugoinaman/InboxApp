package com.example.inboxapp;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;


@RestController
@SpringBootApplication
@ConfigurationPropertiesScan
public class InboxAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(InboxAppApplication.class, args);
    }

//    @RequestMapping("/user")
//    public String user(@AuthenticationPrincipal OAuth2User principal) {
//        System.out.println(principal);
//        return principal.getAttribute("name");
//        /*
//        we are getting the name of the user by oauth and printing it out
//         */
//    }


    @Bean
    public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAstraProperties astraProperties) {
        Path bundle=astraProperties.getSecureConnectBundle().toPath();
        /*
        this is for the connection
        cql is cassandra query language
        getting the secure connect bundle and the path for it
        return a lambda with that bundle
         */
        return builder -> builder.withCloudSecureConnectBundle(bundle);

    }
}
