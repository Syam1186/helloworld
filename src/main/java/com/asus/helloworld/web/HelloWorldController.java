package com.asus.helloworld.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{

    @GetMapping("/hello")
    public String greet(){
        return "Have a Nice day";
    }

}
