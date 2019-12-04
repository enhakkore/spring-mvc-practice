# Spring MVC practice  
> [스프링5 레시피](https://book.naver.com/bookdb/book_detail.nhn?bid=13911953)  

### 정리  
* 컨트롤러에서 매개변수와 본문, 반환값이 없는 경우
    ```java
    @Controller
    @RequestMapping("/abc")
    public class exampleController {

        ...

        @GetMapping
        public void setUp() {}
    }
    ```  
    사용자가 브라우저에서 ~/abc을 요청하면 기본 HTTP GET 핸들러 메서드인 setUp()가 요청을 처리합니다. setUp() 메서드는 매개변수와 본문, 반환값이 없습니다. 이 메서드에서 어떤 데이터도 추가되지 않기 때문에 JSP와 같은 템플릿에서 하드코딩된 데이터를 뷰에서 보여줍니다. 반환값이 없기때문에 요청 URL에 따라 뷰 이름이 결정되는데, 여기서는 /abc이기에 abc라는 이름의 뷰가 반환됩니다. 


### 이슈  
* Jetty, Tomcat, Undertow에 대해서 생각해보기  
* 외장 Tomcat과 내장 Tomcat에 대해 생각해보기
