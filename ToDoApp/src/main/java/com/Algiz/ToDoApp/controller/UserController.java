package com.Algiz.ToDoApp.controller;

import com.Algiz.ToDoApp.Service.UserService;
import com.Algiz.ToDoApp.dataBase.User;
import com.Algiz.ToDoApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/connect")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/create")
    public String hello() {
        String name = "root";
        String mdp = "test";


        if (userService.findByUserNameAndMdp(name, mdp)) {
            return "User already exists";
        }else {
            return "User dont exists";
        }

    }
}
