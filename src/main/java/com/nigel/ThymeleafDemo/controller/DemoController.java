package com.nigel.ThymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {


    @GetMapping("/hello")
    public String getHello(Model theModel) {

        // create a mapping for "/hello"
        theModel.addAttribute("theDate", new java.util.Date());

        return "helloworld";
    }

}
