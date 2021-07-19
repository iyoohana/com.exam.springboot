package com.test.springboot.study.web;

import org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.RestController;

/*
Step 6. HelloController
    Method : 405 Method Not Allowed
    GET : test.com/a.jsp?id=user&pass=1234 (256Byte) HTTP Header , 보안문제 취약
    POST : 입력창, HTTP Body, 보안 유리

    @RestController
        JSON 으로 반환하는 컨트롤러 making
        JavaScript Object Notation

    @GetMapping
        주소창에 오는 정보(get method)를 매핑해줘

 */

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
