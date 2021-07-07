package com.minhojang.springbootpractice.controller;

import com.minhojang.springbootpractice.dto.Member;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test/api")
public class TestRestController {
    
    @GetMapping("/get")
    public String getTest(Member member) {
        return "get 요청: " + member.getUuid() + " " + member.getName() + " " + member.getPassword();
    }
    
    @PostMapping("/post/form")
    public String postFormTest(Member member) {
        return "post 요청: " + member.getUuid() + " " + member.getName() + " " + member.getPassword();
    }

    @PostMapping("/post/text")
    public String postTextTest(@RequestBody String text) {
        return "post 요청: " + text;
    }

    @PostMapping("/post/json")
    public String postJsonTest(@RequestBody Member member) {
        return "post 요청: " + member.getUuid() + " " + member.getName() + " " + member.getPassword();
    }
    
    @PutMapping("/put")
    public String putTest(@RequestBody Member member) {
        return "put 요청: " + member.getUuid() + " " + member.getName() + " " + member.getPassword();
    }
    
    @DeleteMapping("/delete")
    public String deleteTest(@RequestBody Member member) {
        return "delete 요청: " + member.getUuid() + " " + member.getName() + " " + member.getPassword();
    }
}
