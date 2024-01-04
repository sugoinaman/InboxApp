package com.example.inboxapp.folders;


import com.datastax.driver.mapping.annotations.Table;
import org.springframework.

@Table(name = "folders_by_user")
public class Folder {


    @PrimaryKeyColumn()
    private String userId;
    private String label;
    private String color;



}
