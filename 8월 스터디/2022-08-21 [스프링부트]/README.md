# ๐ Java Study

## ๐ธ 2022-08-21 ์ผ์์ผ

## [์คํ๋ง ๋ถํธ ํ๋ก์ ํธ]

### 1. Spring ์ด๊ธฐ

- ์ฌ์ฉ์๋ก๋ถํฐ ์ ์์ ๋ฐ์๋ด๊ธฐ ์ํด ์ฃผ์๋ฅผ ์ค์ 
- ์ฃผ์์ ๋ฌถ์์ธ Cotroller package ์์ฑ
- ํจํค์ง ํ์๋ก GetController ์์ฑ
- ์คํ๋ง์๊ฒ ์ด๊ณณ์ Cotroller๋ก ํ์ฉํ๋ค๋ ๊ฒ์ ์ธ์ง์ํค๊ธฐ ์ํด ์ง์์ Annotation(@) `RestController` ์์ฑ
- ์ด๊ณณ์ผ๋ก ๋ค์ด์ฌ api ์ฃผ์๋ฅผ ๋งตํํ๊ธฐ ์ํด `RequestMapping` ์์ฑ
- `@RequestMapping("/api")`
- api๋ก ์ง์ ํ๊ฒ ๋๋ฉด localhost:8080 ํฌํธ์ api๊น์ง ์ฃผ์๊ฐ ๋งค์นญ

<br>

- ์ฌ์ฉ์์ ์์ฒญ์ ํ ๊ฐ์ง ๋ฉ์๋๋ก ๋ฐ์๋ค์ผ ์ ์์
- `public String getRequest() { }`
- `@RequestMapping(method = RequestMethod.GET, path = "/getMethod")`์ ํตํด GET ํ์์ผ๋ก ๋ฐ์๋ค์ด๊ณ , getMethod ์ฃผ์๋ก ๋ฐ์๋ค์ด๊ฒ ๋ค๊ณ  ์ ์ธ
- `localhost:8080/api/getMethod` ๋ผ๋ ์ฃผ์๋ก ํธ์ถํ๊ฒ ๋๋ฉด ์ฌ์ฉ์์ ์์ฒญ์ด getRequest() ๋ฉ์๋๋ก ๋ค์ด์ค๊ฒ ๋จ
- ์ ์์ฒญ์ด ๋ค์ด์ค๋ฉด, `Hi getMethod` ๋ผ๋ ๋ฌธ์๋ฅผ ์ถ๋ ฅํ๋๋ก ํจ
- ๊ฐ๋ฐํ ์ฝ๋์ ๋ํด ๊ฒ์ฆํ  ์ ์๋ ๋ฐฉ๋ฒ์ ์ฌ๋ฌ๊ฐ์ง ์กด์ฌ(JUnit ํ์คํธ, ์น ๋ธ๋ผ์ฐ์  ๋ฐฉ์, REST Client Tool ๋ฑ)
- ์น ๋ธ๋ผ์ฐ์  ๋ฐฉ์์ผ๋ก ์ง์  ํธ์ถํด์ ์๋ต์ด ์ค๋์ง ํ์ธํจ

<br>

````java
    package com.example.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")   // Localhost:8080/api ๊น์ง ์ฃผ์ ๋งค์นญ
public class GetController {
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")  // Localhost:8080/api/getMethod
    public String getRequest() {

        return "Hi getMethod";
    }
}
````

<br>

### ๐ localhost:8080 ํธ์ถ

![hi_getMethod](https://user-images.githubusercontent.com/79084294/185871973-2682c533-b1d0-4f2a-bf61-475ad141ed4c.png)

<br>

### ๐ ๋น๋๊ณผ์  ์ค๋ฅ ๋ฐ์ & ํด๊ฒฐ

![แแฉแแฒ](https://user-images.githubusercontent.com/79084294/185873489-ebea7dea-081c-4c2c-baac-a22277c00a18.png)

- Intellij์์ "o.s.b.d.LoggingFailureAnalysisReporter" ์๋ฌ ๋ฐ์
- ํด๊ฒฐ ๋ฐฉ๋ฒ : `main - resources - application.properties`์ ์๋ ์ฝ๋ ์ถ๊ฐ

```
    spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
```
