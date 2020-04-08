package com.muntanji.services.ldapservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping
    public String welcomeMessage() {
        return "Welcome To ldap service";
    }
}
