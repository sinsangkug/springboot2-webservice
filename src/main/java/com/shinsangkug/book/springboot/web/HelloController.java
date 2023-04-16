package com.shinsangkug.book.springboot.web;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestParam;
/*
Spring Framework에서 RESTful 웹 서비스를 개발한다는 것은?

    HTTP 프로토콜을 사용하여 클라이언트와 서버 간의 통신을 위한 API를 개발하는 것입니다.

    이 API는 다양한 HTTP 메서드(GET, POST, PUT, DELETE 등)를 사용하여 리소스를 생성, 조회, 수정, 삭제할 수 있는 기능을 제공합니다.

    Spring Framework에서 RESTful 웹 서비스를 개발할 때는 일반적으로 Spring MVC와 함께 사용되는 @RestController 어노테이션을 사용합니다.

    이 어노테이션은 @Controller 어노테이션과 @ResponseBody 어노테이션을 합쳐놓은 것으로, 컨트롤러 클래스의 모든 메서드가 HTTP 응답 바디에 직접 데이터를 작성하도록 합니다.

    Spring Framework에서 RESTful 웹 서비스를 개발할 때는 또한 데이터 전송 형식으로 JSON 또는 XML 형식을 주로 사용합니다.

    이를 위해 Jackson, Gson, XML Binding 등과 같은 라이브러리를 사용하여 자바 객체를 JSON 또는 XML 형식으로 변환할 수 있습니다.

    또한 Spring Framework에서는 RESTful 웹 서비스를 보다 쉽게 개발할 수 있도록 Spring Data REST라는 프로젝트를 제공합니다.

    이 프로젝트는 Spring Data와 함께 사용되어, JpaRepository 인터페이스를 구현한 클래스를 RESTful 웹 서비스로 자동으로 노출시켜주는 기능을 제공합니다.

 */

/*

@RestController 는???

    Spring Framework에서 RESTful 웹 서비스를 개발할 때 사용되는 어노테이션 중 하나입니다.

    이 어노테이션이 적용된 클래스는 HTTP 요청에 대한 응답으로 JSON, XML 등과 같은 데이터를 반환할 수 있는 RESTful 웹 서비스를 제공합니다.

    @RestController는 기본적으로 @Controller와 @ResponseBody 어노테이션이 합쳐진 것으로 볼 수 있습니다.

    따라서, @RestController를 사용하면 각 메서드의 반환값이 HTTP 응답의 본문으로 자동으로 변환되어 전송됩니다.

    @RestController에서는 HTTP 요청에 따라 호출되는 메서드에 @RequestMapping, @GetMapping, @PostMapping, @PutMapping, @DeleteMapping과 같은 어노테이션을 사용하여

    엔드포인트(클라이언트가 요청한 주소 URL)를 정의할 수 있습니다.

    @RestController를 사용하여 개발자는 보다 쉽게 RESTful 웹 서비스를 개발할 수 있으며,

     Spring Framework에서 제공하는 다양한 기능들을 활용하여 보안, 로깅, 트랜잭션 처리 등의 요구사항들을 처리할 수 있습니다.

    참고 자료:

    https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-controller
    https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-restcontroller
 */
@RestController
public class HelloController {

    //@GetMapping 어노테이션을 사용하여 GET 요청을 처리하는 메소드임을 명시하고,
    //"/hello" 요청 경로에 대해 "hello" 문자열을 반환하는 메소드를 정의합니다.
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

/*
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }

    위 코드는 GET 요청을 받아 /hello/dto 라우트로 들어온 요청에 대해 HelloResponseDto 객체를 반환하는 메서드입니다.
    @GetMapping 어노테이션은 HTTP GET 요청에 대한 핸들러 메서드임을 나타냅니다.
    /hello/dto 경로에 대해 GET 요청이 들어오면 해당 메서드가 실행되어 응답을 반환하게 됩니다.

    @RequestParam 어노테이션은 HTTP 요청의 파라미터를 매핑하기 위해 사용됩니다.
    위 코드에서는 name과 amount 라는 파라미터를 받아와서 HelloResponseDto 객체를 생성하여 반환합니다.
    반환되는 객체는 name과 amount 값을 각각의 필드로 갖게 됩니다.

    예를 들어, http://localhost:8080/hello/dto?name=John&amount=100 로 GET 요청을 보내면 HelloResponseDto 객체가 생성되어
     { "name": "John", "amount": 100 } 형태의 JSON 형태로 반환됩니다.
    HelloResponseDto 객체는 DTO(Data Transfer Object)로서, 데이터 전송을 위한 객체입니다.
    데이터 전송시에 객체 형태로 데이터를 주고 받을 수 있도록 구성된 객체입니다.
*/

}

/*

자세한 내용은 아래 링크에서 확인하실 수 있습니다.

@GetMapping 어노테이션: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/GetMapping.html
@RequestParam 어노테이션: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestParam.html
@RestController 어노테이션: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestController.html

*/
