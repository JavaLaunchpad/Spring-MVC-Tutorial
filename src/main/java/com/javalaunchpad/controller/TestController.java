package com.javalaunchpad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/test")
public class TestController {

    // @EnableWebMvc

    // DispatcherServlet

    @GetMapping()
    @ResponseBody
    public String test() {
        return "test";
    }
}
