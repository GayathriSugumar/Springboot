package com.gay3.springboot.demo.mycoolapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping ("/")
    public  String sayHello(){
        return "Hi this is Techie G3";
    }

    @GetMapping ("/workout")
    public  String getDailyWorkout(){
        return "Update Status!...";
    }

    @GetMapping ("/Future")
    public  String getFutureWork(){
        return "Get in touch with futuristic work!...";
    }
}
