package com.minhojang.springbootpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("username", "Minho");
        return "greeting";
    }
}
