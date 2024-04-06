package com.javalaunchpad.controller;

import com.javalaunchpad.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {



    /*

    // scenario 1. Using @RequestParam without @ModelAttribute

    @GetMapping("/form")
    public String showForm() {
        return "registration";
    }

    @PostMapping("/register")
    public String register(@RequestParam String firstName,
                           @RequestParam String lastName,
                           @RequestParam String email,
                           Model model) {
        // Save the user info in the database
        // .....
        // Map the information to the success page
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        return "success";
    }
 */

/*
    // scenario 2. Using User DTO & without @ModelAttribute

    @GetMapping("/form")
    public String showForm() {
        return "registration";
    }

    @PostMapping("/register")
    public String register(User user, Model model) {
        // Save the user info in the database
        // .....
        // Map the information to the success page
        model.addAttribute("firstName", user.getFirstName());
        model.addAttribute("lastName", user.getLastName());
        model.addAttribute("email", user.getEmail());
        return "success";
    }

*/


 /*
     // scenario 3.  2-way data binding without @ModelAttribute

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

  */





    @GetMapping("/form")
    public String showForm(@ModelAttribute("user") User user) {
        return "registration";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user ) {
        return "success";
    }

}
