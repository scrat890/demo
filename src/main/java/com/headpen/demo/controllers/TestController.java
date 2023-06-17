package com.headpen.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String testApi(){
        return "HII , WelCome TO Demo Application for Setting up aws code pipeline";
    }

}
