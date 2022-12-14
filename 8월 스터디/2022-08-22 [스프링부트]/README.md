# π Java Study

## πΈ 2022-08-22 μμμΌ

## [μ€νλ§ λΆνΈ νλ‘μ νΈ]

### 1. Spring μ΄κΈ°

- μ΄μ  `http://localhost:8080/api/getMethod`μ ν΅ν΄ λμ¨ ν¬λ‘¬ νμ΄μ§μμ κ²μ¬
- network - Disable cache - μλ‘ κ³ μΉ¨

<br>

### π http://localhost:8080/api/getMethod κ²μ¬ network

![network1](https://user-images.githubusercontent.com/79084294/185967690-4d261e03-34f9-44aa-a5af-a5af560d8b93.png)

![network2](https://user-images.githubusercontent.com/79084294/185967708-9fe97e49-03db-4e1b-9b14-c92a2a4b20e0.png)

- Request Method λ°©μμΌλ‘ GET λ°©μ
- Status Code κ°μΌλ‘ `μ μ ν΅μ `μ μλ―Ένλ μ½λ 200
- Response ν­μμ μ μμ μΌλ‘ `Hi getMethod` μΆλ ₯μ νμΈν  μ μμ

<br>

- μ¬μ©μκ° μλ²μ Http ν΅μ μ ν΅ν΄ λ°μ΄ν°λ₯Ό μμ²­νμκ³ , μλ²λ `Hi getMethod`λΌλ νμ€νΈλ₯Ό Httpλ₯Ό ν΅ν΄ Return
- μ μΌλ ¨μ κ³Όμ μ΄ ν΅μ 
- μμΌλ‘ admin νλ‘μ νΈμμ μ¬μ©μ λλ μλ²κ° Http ν΅μ μ ν΅ν΄μ νΉμ ν λ°μ΄ν°λ₯Ό μμ²­νλ©΄, μλ²μμ DB νΉμ κ°μ§κ³  μλ μμμ ν΅ν΄μ λ°μ΄ν°λ₯Ό κ°κ³΅ν νμ μ¬μ©μκ° μμ²­ν JSON, XML,
  HTML, CSS λ±μ μ¬λ¬ μλ£ ννλ‘ Response νλ κ²μ΄ κ°λ° λͺ©ν

<br>

- Http - GET Methodμ λν΄μ λμ± κ΅¬μ²΄ν
- μμ²­ν μ£Όμ λ€μ νλΌλ―Έν°κ° λΆμ΄μμ(http://localhost:8080/api/getMethod)
- νμ¬ κ°λ°ν μ½λμμλ νλΌλ―Έν°λ₯Ό μ ν μ½μ΄μ¬ μ μμ
- μ¦, μ¬μ©μ μμ²­μ λν΄μ μ΄λ ν κ°μ΄ λ€μ΄μλμ§ νμΈ λΆκ°λ₯
- getParameter() λ©μλλ₯Ό μμ± ν Annotation(@) `GetMapping` μμ±
- `GetMapping`μ λ©μλλ₯Ό μ§μ νμ§ μμλ λκ³ , μ£Όμλ§ μ€μ ν΄λ λ¨
- μ€νλ§μμ μ΄ κ°μ λ°μλ΄κΈ° μν΄ `@RequestParam` μ¬μ©
- `public String getParameter(@RequestParam String id, @RequestParam String password)`

<br>

### π GetParameter μ½λ

```java
  package com.example.study.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")   // Localhost:8080/api κΉμ§ μ£Όμ λ§€μΉ­
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")  // Localhost:8080/api/getMethod
    public String getRequest() {

        return "Hi getMethod";
    }

    @GetMapping("/getParameter")  // Localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam String password) {

        System.out.println("id : " + id);
        System.out.println("password : " + password);

        return id + password;
    }
}
```

<br>

### π GetParameter μΆλ ₯ νμΈ

![getParameter](https://user-images.githubusercontent.com/79084294/185971643-b1efc262-4a80-472d-b71c-e0b3135b4d0c.png)

<br>

- μμνλ€λ³΄λ©΄, μ§μ­ λ΄ password μ¬μ© κ°λ₯(μ : `String password="aaaa";`)
- νμ§λ§, μ€νλ§μμ RequestParamμΌλ‘ λ€μ΄μ¬ μ μλ κ°μ λν΄μλ λ‘μ»¬ λ³μλ₯Ό μ¬μ©νμ§ μλ κ²μ κΆμ₯
- μ΄μ© μ μλ€λ©΄, νλΌλ―Έν° κ°μΌλ‘ @RequestParam String passwordλ₯Ό pwdλ‘ λ³κ²½νμ¬ μ¬μ©ν΄μΌ λ¨
- μ΄λ κ² λλ©΄, μ€νλ§μμ μΉμμ νΈμΆν passwordμ νλΌλ―Έν° κ°μΌλ‘ λ€μ΄κ° pwd κ° λ³μλͺμ΄ κ°μ§ μμ ν΄λΉ κ°μ λ§΅ν ν  μ μμ
- `@RequestParam(name = "password") String pwd` κ°λ₯
- @RequestParamμ password λΌλ μ΄λ¦μΌλ‘ λ€μ΄μ¬ κ²μ΄λ€λΌκ³  μλ €μ€ μ μμ
- λ°λΌμ password κ°μ pwdμ λ£μ΄μ€ μ μμ
- μ κ²°κ³Ό κ°κ³Ό λμΌνλ°, pwdλ‘ λ°μμ§λ§, nameμ `password`λΌκ³  μλ €μ£ΌμκΈ° λλ¬Έμ μ£Όμ μ°½μ μλ passwordμ @RequestParamμ passwordκ° λ§€μΉ­μ΄ λμ΄ ν΄λΉ κ°μ΄ μΈν
