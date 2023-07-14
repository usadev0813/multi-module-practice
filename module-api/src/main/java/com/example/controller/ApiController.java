package com.example.controller;

import com.example.entity.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/test")
    public String test() {
        Member member = new Member();
        member.setAge(10);
        member.setName("이름");
        return member.toString();
    }
}
