package com.minhojang.springbootpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String greeting(Model model) {
        model.addAttribute("username", "Minho");
        return "hello";
    }

    @GetMapping("/bye")
    public String bye(Model model) {
        model.addAttribute("nickname", "홍길동");
        return "bye";
    }
}
