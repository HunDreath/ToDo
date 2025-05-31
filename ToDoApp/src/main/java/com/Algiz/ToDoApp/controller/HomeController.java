package com.Algiz.ToDoApp.controller;

import org.springframework.ui.Model;
import com.Algiz.ToDoApp.Service.UserService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("nbUsers", this.nbUsers());
        return "FrontEnd/main/homePage";
    }

    private Integer nbUsers() {
        return userService.nbUser();
    }


}