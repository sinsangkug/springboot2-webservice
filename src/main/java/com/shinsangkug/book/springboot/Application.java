package com.shinsangkug.book.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Application 클래스는 앞으로 만들 프로젝트의 메인 클래스가 됩니다.

//@SpringBootApplication으로 인해 스프링 부트의 자동설정, 스프링 Bean 읽기와 생성을
//모두 자동으로 설정 됩니다. 특히나 @SpringBootApplication이 있는 위치부터 설정을 읽어가기 때문에
//이 클래스는 항상 프로젝트의 최상단에 위치해야만 합니다.


/*
@SpringBootApplicaion 어노테이션은
@Configuration, @EnableAutoConfiguration, @ComponentScan 3가지 어노테이션 기능들을 '모두 포함하고 있습니다.

1. @Configuration 어노테이션 기능

    자바코드 예시 그림.

        @Configuration
        public class AppConfig {

            @Bean
            public MyService myService() {
                return new MyServiceImpl();
            }
        }

        설명
            위 코드에서 AppConfig 클래스는 @Configuration 어노테이션이 적용되어 있고,
            myService() 메서드는 @Bean 어노테이션이 적용되어 있습니다.
            이 메서드에서는 MyServiceImpl 클래스의 인스턴스를 생성하여 반환합니다.
            이렇게 생성된 MyServiceImpl 인스턴스는 스프링 컨테이너에서 Bean으로 관리되며,
            이후에 다른 Bean에서 이 객체를 의존성 주입(Dependency Injection)을 통해 사용할 수 있습니다.

        더 쉽게 설명
            @Configuration 어노테이션은 스프링 애플리케이션에서 필요한 객체를 만들어내는 공장 역할을 하는 클래스를 만들 때 사용하는 어노테이션입니다.
            이 클래스 안에는 @Bean 어노테이션이 적용된 메서드를 만들 수 있는데,
            이 메서드가 만든 객체는 스프링에서 관리되는 Bean으로 사용할 수 있습니다.
            이를 통해 스프링 애플리케이션에서 필요한 객체들을 생성하고 조합하는데 유용하게 사용할 수 있습니다.

2. @EnableAutoConfiguration 어노테이션 기능

        자바코드 예시 그림.



 */
@SpringootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}