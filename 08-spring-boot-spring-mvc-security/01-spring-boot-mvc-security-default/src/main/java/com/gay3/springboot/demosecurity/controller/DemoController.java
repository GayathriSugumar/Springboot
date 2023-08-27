package com.gay3.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    //add request
    @GetMapping("/leaders")
    public String showLeaders() {

        return "leaders";
    }

   /* @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {

        // return "plain-login";
        return "fancy-login";
    }*/


}
