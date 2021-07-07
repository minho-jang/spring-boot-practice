package com.minhojang.springbootpractice.controller;

import com.minhojang.springbootpractice.dto.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestLombokController {

    @GetMapping("/lombok")
    public String lombokTest() {
        Member m = Member.builder().
                name("test").
                password("test").
                build();
        log.info(m.toString());
        return "lombok test";
    }
}
