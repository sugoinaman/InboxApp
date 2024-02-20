package com.example.inboxapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InboxController {





    /*@GetMapping("/")
    public String homePage(@AuthenticationPrincipal OAuth2User principal,
    Model model
    ) {
        if (principal == null || !StringUtils.hasText(principal.getAttribute("name"))) {
            return "index";
        }
        String userId = principal.getAttribute("name");
        List<Folder> userFolders= folderRepository.findAllById("name");
        model.addAttribute("userFolders",userFolders);


        return "index-page";
    }*/
    @GetMapping("/")
    public String Welcome() {
        return "welcome";
    }
}
