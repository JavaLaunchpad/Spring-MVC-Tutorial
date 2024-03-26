package com.javalaunchpad.controller;

import com.javalaunchpad.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {


    @GetMapping("/form")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }



    @PostMapping("/register")
    public String register(User user , Model model) {
        model.addAttribute("user", user);
        return "success";
    }


//    @GetMapping("/form")
//    public String showForm(@ModelAttribute("user") User user) {
//        return "registration";
//    }
//
//    @PostMapping("/register")
//    public String register(@ModelAttribute User user ) {
//        return "success";
//    }

}
