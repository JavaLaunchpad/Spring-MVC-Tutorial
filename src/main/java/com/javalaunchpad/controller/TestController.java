package com.javalaunchpad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class TestController {

   // DispatcherServlet

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello World!";
    }
}
