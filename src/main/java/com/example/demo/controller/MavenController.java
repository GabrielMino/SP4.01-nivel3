package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class MavenController {
    
    
    //Fase 2
    @GetMapping("/")
    public String helloMaven() {
        return "HELLO MAVEN!";
    }
}