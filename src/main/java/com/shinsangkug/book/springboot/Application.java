package com.shinsangkug.book.springboot;

/*
 배울 내용  -  단위테스트 코드 작성 하여 단위테스트 해보자. (JUnit4 사용)

 1.테스트 유형 2가지  TDD와 단위테스트에 관하여
	TDD는 Test-Driven Development의 약자로, 테스트 기반 개발이라는 의미를 가집니다. TDD는 개발자가 코드를 작성하기 전에 테스트 코드를 작성하고, 이를 통과하는 코드를 작성하는 개발 방법론입니	다. 이를 통해 개발자는 코드를 작성하기 전에 요구사항을 명확하게 이해하고, 코드를 수정할 때 발생할 수 있는 문제를 사전에 파악할 수 있습니다.

	단위테스트는 TDD에서 중요한 역할을 합니다. 단위테스트는 개발자가 작성한 코드의 작동 여부를 확인하는 테스트입니다. 각각의 함수나 모듈 등의 작은 단위에서 수행됩니다. 단위테스트는 코드의 품	질을 높이고, 버그를 찾아내기 쉽게 만들어줍니다. 또한 코드 변경 시 이전에 작성한 단위테스트를 수행하여 새로운 변경사항이 예상치 못한 문제를 일으키지 않도록 보장합니다.

2. 단위테스트 코드는 왜작성해야 할까요?
	단위테스트 코드를 작성하는 이유는 크게 세 가지입니다.

		첫째, 단위테스트 코드는 코드의 품질을 높입니다. 단위테스트 코드를 작성함으로써 개발자는 작성한 코드가 정상적으로 동작하는지를 검증할 수 있습니다. 이를 통해 코드의 버그를 미리 발견하		고, 이를 수정하여 코드의 품질을 향상시킬 수 있습니다.

		둘째, 단위테스트 코드는 코드 수정 시 발생하는 문제를 사전에 예방합니다. 코드가 수정될 때마다 단위테스트 코드를 실행하여 수정한 코드가 기존의 코드와 동일한 동작을 수행하는지 확인할 수 		있습니다. 이를 통해 수정된 코드가 예기치 않은 문제를 일으키지 않도록 보장할 수 있습니다.

		셋째, 단위테스트 코드는 코드 리팩토링을 용이하게 합니다. 리팩토링은 기능은 변경하지 않으면서 코드의 구조를 개선하는 작업입니다. 단위테스트 코드가 있으면 리팩토링 후에도 코드가 여전		히 동작하는지 확인할 수 있습니다. 이를 통해 리팩토링 과정에서 발생할 수 있는 문제를 예방할 수 있습니다.

결론 :
	이러한 이유로 단위테스트 코드는 코드의 품질을 높이고, 유지보수성을 향상시키는 데 매우 중요합니다.
	단위테스트 코드를 작성하면 개발자는 자신이 작성한 코드가 기능적으로 정확하게 동작하는지를 	확인할 수 있으며,
	이를 통해 코드의 품질을 향상시킬 수 있습니다.



 */


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

        설명
            @EnableAutoConfiguration 어노테이션을 사용하면 스프링 부트가 자동으로 클래스 패스와 의존성을 검색하여 적절한 설정을 자동으로 처리합니다.
            이를 통해 개발자는 별도로 설정 파일을 작성하거나, 의존성을 추가하거나, 어노테이션을 추가하지 않아도 됩니다.
            스프링 부트는 필요한 라이브러리와 설정 정보를 자동으로 감지하고 처리하여 개발자가 애플리케이션을 개발하는 데 불필요한 부담을 덜어줍니다.

        더 자세한 설명
             @EnableAutoConfiguration 어노테이션은 클래스 패스에 있는 의존성을 스캔하고, 해당 의존성에서 자동 구성을 위해 자동 구성 클래스를 찾아 실행합니다.
             이때, 클래스 패스에서 찾은 라이브러리의 자동 구성 클래스들은 모두 실행되며, 그 중에서 H2 데이터베이스를 사용하는 라이브러리에 해당하는 자동 구성 클래스가 있다면 그것도 실행됩니다.
             H2 데이터베이스를 사용하는 라이브러리는 보통 spring-boot-starter-data-jpa 라이브러리입니다.
             이 라이브러리에는 spring-data-jpa 라이브러리가 포함되어 있습니다. spring-data-jpa 라이브러리에는
             H2 데이터베이스를 사용하기 위한 자동 구성 클래스 H2DatabaseAutoConfiguration가 포함되어 있습니다.
                자동구성 내용의 예!!
                    예를 들어, H2 데이터베이스에 접속하기 위한 DataSource Bean과 JPA Entity를 저장하기 위한 EntityManagerFactory Bean,
                    그리고 JPA TransactionManager Bean 등을 자동으로 구성해줍니다.
                    이 자동 구성 클래스 H2DatabaseAutoConfiguration 는 @Configuration과 @ConditionalOnClass 어노테이션을 가지고 있습니다.
                    따라서 해당 spring-data-jpa 라이브러리가 클래스 패스에 존재할 때만 H2DatabaseAutoConfiguration 클래스가 자동으로  구성됩니다.

            또한, @EnableJpaRepositories 어노테이션을 사용하여 JpaRepository 인터페이스를 구현하는 Bean을 등록할 수 있습니다.


            따라서, 스프링 부트 애플리케이션에서 H2 데이터베이스를 사용하기 위해서는 다음과 같은 작업을 해야 하는데 이 3가지 모두를 자동으로 처리 해줍니다.
                1. 의존성 추가
                    <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-data-jpa</artifactId>
                    </dependency>

                2. application.properties에 데이터베이스 정보 추가
                    spring.datasource.url=jdbc:h2:mem:testdb
                    spring.datasource.username=sa
                    spring.datasource.password=
                    spring.datasource.driver-class-name=org.h2.Driver

                3. @EnableAutoConfiguration 어노테이션을 가지고 있는 클래스 생성
                    @SpringBootApplication
                    @EnableAutoConfiguration
                    public class MyApplication {

                        public static void main(String[] args) {
                            SpringApplication.run(MyApplication.class, args);
                        }
                    }

    3. @ComponentScan : 지정한 패키지 이하에서 @Component 어노테이션이 붙은 클래스를 스캔하여 Bean으로 등록합니다.



    */


// @SpringBootApplication 어노테이션은 세 가지 어노테이션의 조합이다.
    // @Configuration : 애플리케이션 컨텍스트를 설정하는 클래스임을 선언한다.
    // @EnableAutoConfiguration : 클래스패스(classpath)에 있는 설정 정보를 기반으로 빈을 추가한다.
    // @ComponentScan : 컴포넌트 클래스를 탐색하고 스프링 빈으로 등록한다.

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //SpringApplication.run() 메서드를 호출하여
        //내장 WAS(아파치 톰캣 서버)를 실행 합니다.
        SpringApplication.run(Application.class, args);
    }
}

// 이 코드는 스프링 부트 애플리케이션의 진입점인 main 메소드를 가진 클래스다.
// SpringApplication.run() 메서드를 호출하여 스프링 부트 애플리케이션을 실행합니다.
// run() 메서드는 스프링 컨테이너를 생성하고, 애플리케이션을 초기화하며, 필요한 빈(Bean)들을 등록합니다.
// 이 때, @SpringBootApplication 어노테이션을 사용함으로써 자동 설정과 컴포넌트 스캔을 수행하게 된다.