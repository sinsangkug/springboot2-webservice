package com.shinsangkug.book.springboot.web;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*

이 코드는 Spring MVC 프레임워크에서 제공하는 MockMvc 객체를 사용하여 HelloController의 hello() 메소드가 예상한대로 동작하는지 테스트합니다.

    @RunWith(SpringRunner.class) 어노테이션은 JUnit 테스트 클래스가 Spring 의존성 주입 및 설정을 사용할 수 있도록 합니다.

    @WebMvcTest(controllers = HelloController.class) 어노테이션은 HelloController 클래스만 로드하므로 애플리케이션 전체를 테스트하는 것보다 더 빠르고 효율적입니다.

    @Autowired 어노테이션은 MockMvc 객체를 주입합니다. MockMvc 객체는 Spring MVC 응용 프로그램을 테스트하는 데 사용됩니다.

    @Test 어노테이션은 JUnit 프레임워크에서 테스트 메소드임을 나타냅니다.

    mvc.perform(get("/hello")) 코드는 HTTP GET 요청을 생성하고 /hello 경로로 요청을 보냅니다.

    .andExpect(status().isOk()) 코드는 HTTP 응답의 상태 코드가 200 OK인지 검증합니다.

    .andExpect(content().string(hello)) 코드는 HTTP 응답의 본문이 "hello" 문자열인지 검증합니다.

    이렇게 작성한 테스트 코드는 HelloController의 hello() 메소드가 /hello 요청에 대해 "hello" 문자열을 반환하는지 확인합니다. 이를 통해 HelloController가 예상대로 작동하는지 확인할 수 있습니다.

*/
//@RunWith(SpringRunner.class) 어노테이션은 JUnit 테스트 클래스가 Spring 의존성 주입 및 설정을 사용할 수 있도록 합니다.
@RunWith(SpringRunner.class)
//@WebMvcTest(controllers = HelloController.class) 어노테이션은 HelloController 클래스만 로드하므로 애플리케이션 전체를 테스트하는 것보다 더 빠르고 효율적입니다.
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    //@Autowired 어노테이션은 MockMvc 객체를 주입합니다.
    //MockMvc 객체는 Spring MVC 응용 프로그램을 테스트하는 데 사용됩니다.
    @Autowired
    private MockMvc mvc;

    // @Test 어노테이션은 JUnit 프레임워크에서 테스트 메소드임을 나타냅니다.
    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";


        mvc.perform(get("/hello"))  // mvc.perform(get("/hello")) 코드는 HTTP GET 요청을 생성하고 /hello 경로로 요청을 보냅니다.
                .andExpect(status().isOk()) //.andExpect(status().isOk()) 코드는 HTTP 응답의 상태 코드가 200 OK인지 검증합니다.
                .andExpect(content().string(hello));  //.andExpect(content().string(hello)) 코드는 HTTP 응답의 본문이 "hello" 문자열인지 검증합니다.
/*
        위 코드는 스프링부트에서 테스트를 작성하는 방법 중 하나인 MockMvc를 이용한 테스트 코드입니다.

        MockMvc는 스프링 애플리케이션의 컨트롤러를 테스트하는 데 사용되며, perform 메서드를 사용하여 HTTP 요청을 만들고 전송합니다.

        get("/hello")는 /hello 경로로 GET 요청을 보내는 것을 나타내며, .andExpect(status().isOk())는 응답의 HTTP 상태 코드가 200인지 검증합니다.

        200은 요청이 성공적으로 처리되었다는 것을 나타내며, HTTP 상태 코드 200 이외의 값은 요청이 실패했음을 의미합니다.

        .andExpect(content().string(hello))는 응답의 본문이 "hello" 문자열과 일치하는지를 검증합니다. 만약 일치하지 않는다면 테스트는 실패하게 됩니다.

        따라서 이 코드는 /hello 경로로 GET 요청을 보내고, 응답으로 받은 HTTP 상태 코드가 200 OK이며, 응답 본문이 "hello" 문자열인지를 검증하는 테스트 코드입니다.*/
    }
}





