# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.1/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.1/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.1/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### 잡다한 것

1. RestController 만들고
2. 기본적인 요청과 응답을 배울 것
3. validation 체크
4. 로그를 남겨볼 예정
5. 문서로 만들기
6. CORS 개념!!
7. RSA 

다른 사람이 사용할 수 있도록 REST API 만들기
CORS : http에서 정해놓은 정책, 내 서버 외부에서 자바스크립트로 http 요청할 때 다 막는 정책

1. Controller 동작원리 = request, response/
2. 필터 거는 법
3. response 공통적인 Object 받아서 

템플릿 엔진(jsp)을 설정하는 이유는 내가 지금 응답하는 파일(.jsp)을 해석해서 브라우저에게 응답해주라는 의미 

요청 시에 dispatcherServelet이 동작.
@Configuration 은 하나가 뜨는 건 맞는데 사용자마다 하나가 뜬다.

스프링은 사용자의 request(요청) 시 component scan을 한다. 
이때, @Configuration @Component @Repository (@restController @controller) 
@Service  등등을 찾아냄

패키지는 도메인 주소를 거꾸로

만약 jsp를 안 쓴다면, 밑의 src/main 영역은 안 쓰는 거? ok
component는 디스패처에서? 
어느 어노테이션이 어느 필터에서 스캔하는지 문서?

 스프링 레거시는 web-inf /webapp

