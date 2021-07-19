package com.test.springboot.study.web;

import com.test.springboot.study.web.HelloController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*
Step 7
    HelloControllerTest 처럼 맨 뒤에 Test 붙이는 것이 관례

    @ExtendWith : JUnit4 에사 @RunWith
    스프링 부트 테스트와 JUnit 연결을 수행

    @WebMvcTest
    @Controller, @ControllerAdvice 등을 사용가능
    Service, Repository 등에서는 사용 불가

    STATUS
        cf. Google : HTTP RFC
 */



@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void helloReturned() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}