package com.example.spring_db_test.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String main(Model model) {
        return "main";
    }
}
