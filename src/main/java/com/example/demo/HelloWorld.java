package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/operation1")
    public String operation1(){
        return "Hello World 1!";
    }

    @GetMapping("/operation2")
    public String operation2(){
        return "Hello World 2!";
    }

    @GetMapping("/operation3")
    public String operation3(){
        return "Hello World 3!";
    }
}
