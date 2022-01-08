package com.cos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //view를 return
public class IndexController {

    @GetMapping({ "", "/" })
    public String index() {
        //머스테치 기본 폴더 src/main/resources/
        //뷰리졸버 설정: templates (prefix), .mustache(suffix) 생략가능
        return "index";
    }

    @GetMapping("/user")
    public @ResponseBody String user() {
        return "user";
    }

    @GetMapping("/admin")
    public @ResponseBody String admin() {
        return "admin";
    }

    @GetMapping("/manager")
    public @ResponseBody String manager() {
        return "manager";

    }

    @GetMapping("/login")
    public String login() {
        return "loginForm";
    }


    @GetMapping("/join")
    public @ResponseBody String join() {
        return "join";
    }

    @GetMapping("/joinProc")
    public @ResponseBody String joinProc() {
        return "회원가입 완료됨";
    }
}
