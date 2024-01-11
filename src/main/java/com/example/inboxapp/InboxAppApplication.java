package com.example.inboxapp;

import com.example.inboxapp.folders.Folder;
import com.example.inboxapp.folders.FolderRepository;
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


    FolderRepository folderRepository;

    public static void main(String[] args) {
        SpringApplication.run(InboxAppApplication.class, args);


    }


    @Bean
    public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAstraProperties astraProperties) throws Exception {
        Path bundle = astraProperties.getSecureConnectBundle().toPath();
        return builder -> builder.withCloudSecureConnectBundle(bundle);
        /*
        this is for the connection
        cql is cassandra query language
        getting the secure connect bundle and the path for it
        return a lambda with that bundle
         */
    }

    /* @RequestMapping("/user")
     public String user(@AuthenticationPrincipal OAuth2User principal) {
         System.out.println(principal);
         return principal.getAttribute("name");

         we are getting the name of the user by oauth and printing it out

     }
 */
    @PostConstruct
    public void init() {

    }

}
