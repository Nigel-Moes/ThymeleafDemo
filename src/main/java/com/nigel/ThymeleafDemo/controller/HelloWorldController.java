package com.nigel.ThymeleafDemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // controller method to show initial HTML form
    /*
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }
    */

    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // controller method to process the form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // controller method to read form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String showCaps(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Hello " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    /*
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName,
                                          Model model) {

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Hello again " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
    */

    @PostMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName,
                                          Model model) {

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Hello again " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

}
