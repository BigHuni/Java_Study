# ๐ Java Study

## ๐ธ 2022-08-30 ํ์์ผ

## [์คํ๋ง ๋ถํธ ํ๋ก์ ํธ]

### 1. Post

- ์ฃผ์ ์ฐฝ์ ํ๋ผ๋ฏธํฐ๊ฐ ๋ธ์ถ๋์ง ์์
- Get ๋ฐฉ์๊ณผ ๋ค๋ฅด๊ฒ ๋ณด์์ด ์กด์ฌ
- Post๋ HTML์์ `<Form>` ํ๊ทธ ์ฌ์ฉ, Ajax์์ ๋น๋๊ธฐ๋ก ๊ฒ์ํ  ๋ ์ฌ์ฉ
- ์ฆ,๊ฒ์ ํ๋ผ๋ฏธํฐ๊ฐ ๋ง๋ค๋ ๊ฒ์ ์๋ฏธ
- ์ด์  ํ์ต์์ `GetMethod`์ `SearchParam`์ ๊ฐ์ผ๋ก account, email, page๋ก ์ง์ ํ์์
- Post ๋ฉ์๋์๋ค๊ฐ `searchParam`์ผ๋ก ํ๋ผ๋ฏธํฐ๋ฅผ ๋ฐ์ผ๋ฉด ๋  ๊ฒ ๊ฐ์ง๋ง, ๊ทธ๋ ๊ฒ ํ๋ ๊ฒ์ด ์๋๋ผ `@RequestBody`๋ก ๋ฐ๊ฒ๋ ์ค์ 
- http ํต์ ์ ํ  ๋, post body์๋ค๊ฐ data๋ฅผ ์ง์ด๋ฃ์ด์ ๋ณด๋ด๊ฒ ๋ค๊ณ  ์ ์ธ
- ์ฆ, `@RequestBody`์ `SearchParam` ๊ฐ์ ๋งค์นญ์ํด
- ์ฌ๋ฌ ๊ฐ์ง ํ์(`json`, `xml`, `multipart-form / text-plain`)์ผ๋ก ์ฌ๋ฆด ์ ์์
- ํ์์ `@PostMapping(value = "/postMethod", produces = {application-Json})` ์ฒ๋ผ ์ง์ ํ  ์ ์์
- ๊ธฐ๋ณธ์ ์ผ๋ก json์ ์ฌ์ฉํ๊ธฐ ๋๋ฌธ์ `@PostMapping(value = "/postMethod")` ์ด๋ ๊ฒ ์ฌ์ฉ

<br>

- Rest Client Tool ํฌ๋กฌ ํ์ฅํ๋ก๊ทธ๋จ ์ค์น(Talend API Tester)
- ์ด๋ฏธ ๊ฐ๋ฐํ Get ๋ฐฉ์์ `http://localhost:8080/api/getMethod`์ ๊ธฐ์ํ๋ฉด, ์๋์ ๊ฐ์ด ์ ์ ํต์  Response ์ํ(200)์ ์์ธํ ํค๋ ๋ฑ์ ์ ๋ณด๋ฅผ ํ์ธํ  ์ ์์

![getMethod](https://user-images.githubusercontent.com/79084294/187621959-0b7cd127-13ac-466f-9411-a2635561e8ed.png)

<br>

- PostMethod

````
    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam) {
        return searchParam;
    }
````

- PostMethod์ `@RequestBody`๋ก ๋ค์ด์จ `searchParam`์ ๋ฐ์์ ๊ทธ๋๋ก ๋ฆฌํด
- Body์ ์์ฒญํ ๋ด์ฉ์ด ์ ์์ ์ผ๋ก ๋ฆฌํด๋๋ ๊ฒ์ ํ์ธํ  ์ ์์

![postMethod](https://user-images.githubusercontent.com/79084294/187622844-5b9c687b-b690-469f-97cf-b84b447aa600.png)

- ํ๋ํ๋ ๋ถ์ํด๋ณด๋ฉด, Tool์ Post Method๋ ์ฝ๋์ `@PostMapping`
- ์ฃผ์๋ `/api`์ `/postMethod`
- Header๋ ๋ฐ์ดํฐ๋ฅผ ๋ณด๋ผ ๋, Content-Type์ `application/json`
- `@RequestBody`์๋ Body์ json์ผ๋ก ๊ธฐ์ํ ๋ด์ฉ์ด ์ ๋ฌ
- ์์ฒญ์ด ๋ค์ด์์ ๋, ์คํ๋ง์์๋ ํค๋ ๊ฐ์ ๋ณด๊ณ  `application/json`์ ํ์ธํ๊ณ ,
- `@RequestBody`์ json ๊ฐ๋ค์ SearchParam์ ๊ฐ์ฒด(account, email, page)์ ๊ฐ์
- {"account" : "", "email" : "", "page" : 50} ์ด๋ฌํ ์์์ผ๋ก ๊ฐ์ด ๋ค์ด์ฌํ๋ฐ
- ๊ฐ ๊ฐ์ฒด(account, email, page)์ ๋งตํ์์ผ์ค
- ํด๋น ๋งตํ๋ ๊ฐ์ฒด(searchParam)๋ฅผ ๋ฆฌํดํ  ๋๋ SearchParam ๊ฐ์ฒด์ ๊ฐ์ json ํํ๋ก ๋ฐ๊ฟ์ค ๋ค์์ ๋ฆฌํด

<br>

- ๊ทธ ์ด์ธ์ PUT / PATCH Method ์กด์ฌ
- POST์ ๋ง์ฐฌ๊ฐ์ง๋ก Body์ ๋ฐ์ดํฐ๊ฐ ๋ค์ด ์์ผ๋ฉฐ, ์ฃผ๋ก ์๋ฐ์ดํธ์ ์ฌ์ฉํจ
- `์๋ฐ์ดํธ` => DB์ ํน์  ์์์ ์๋ฐ์ดํธ ์ํฌ ๋, POST Body์ ํด๋น ๋ฐ์ดํฐ ๋ด์ฉ์ ๋ฃ์ด์ ์๋ฐ์ดํธ ์์ฒญ
- DELETE Method๋ Get ๊ณผ ๋ง์ฐฌ๊ฐ์ง๋ก ์ฃผ์์ ํ๋ผ๋ฏธํฐ๊ฐ ๋ค์ด๊ฐ๋ฉฐ, ๋ฐ์ดํฐ๋ฅผ ์ญ์ ํ  ๋ ์ฌ์ฉ

<br>

### 2. REST

- HTTP ํ๋กํ ์ฝ์ ์๋ Method๋ฅผ ํ์ฉํ ์ํคํ์ฒ ์คํ์ผ
- HTTP Method๋ฅผ ํตํด์ Resource๋ฅผ ์ฒ๋ฆฌ
- CRUD๋ฅผ ํตํ Resource ์กฐ์ํ  ๋ ์ฌ์ฉ

| HTTP Method   | ๋์  | URL ํํ |   
|:--------------|:--------------------|:----------------------------------------------------| 
| `GET`         | ์กฐํ(SELECT * READ)   | /user/{id} |
| `POST`        | ์์ฑ(CREATE)          | /user |
| `PUT / PATCH` | ์์ (UPDATE) * CREATE | /user |
| `DELETE`      | ์ญ์ (DELETE)          | /user/{1} |
