# π Java Study

## πΈ 2022-08-29 μμμΌ

## [μ€νλ§ λΆνΈ νλ‘μ νΈ]

### 1. Get Method

- κ²μν  λ μ¬λ¬κ°μ§ νλΌλ―Έν°λ₯Ό λ°μ μ μμ
- μλ₯Ό λ€λ©΄, κ³μ , μ΄λ©μΌ, ν€μλ, λ± κ²μ νλΌλ―Έν° μ‘΄μ¬
- `@RequestParam`μΌλ‘ account, email λ±μ κ³μν΄μ λ°μμ¬ μλ μμ
- ν¨ν€μ§λ₯Ό μλ‘ μμ± ν μλ° ν΄λμ€λ₯Ό λ§λ  λ€, account, email λ± λ°μ μ μλ κ°μ²΄λ€μ λ°λ‘ λ§λ¬
- Eclipse κΈ°λ₯ μ²λΌ `μΈνλ¦¬μ μ΄ - μ½λ - μμ± - getter&setter`λ‘ μλ μμ± κΈ°λ₯ μ¬μ©

<br>

- SearchParam ν΄λμ€

```java
    package com.example.study.model;

public class SearchParam {

    private String account;
    private String email;
    private int page;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
```

<br>

### π getMultiParameter μ½λ

- μ»¨νΈλ‘€λ¬μ ν΄λΉ κ° λ§΅ν

```
    // Localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10
    @GetMapping("/getMultiParameter")
    public String getMultiParameter(SearchParam searchParam) {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return "OK";
    }
```

<br>

### π getMultiParameter μΆλ ₯ νμΈ

![getMultiParameter](https://user-images.githubusercontent.com/79084294/187440485-76d3deb6-2759-4797-9f4e-a67fbcd2615d.png)

![getMultiParameter1](https://user-images.githubusercontent.com/79084294/187440967-36be36aa-7c81-492b-8f33-330704e1c50e.png)

<br>

- μ΄μ²λΌ 3κ° μ΄μ λ€μμ RequestParameterκ° μλ€λ©΄, λ°λ‘ ν΄λμ€λ₯Ό νμ μ§μ  λ°λ λ°©λ²λ μμ
- `GetParameter`λ₯Ό μ΄μ©νμ¬ λ¬Έμμ΄μ λ°μμ€λ κ²μ μ§νν¨
- λ€νΈμν¬ ν΅μ μ ν  λ, JSON ννλ‘ νλ κ²μΌλ‘ μκ³  μμ
- `{"account" : "", "email" : "", "page" : 0}`

<br>

### π JSON ννλ‘ κ° λ°μμ¬ μ μλλ‘ μμ 

```
    // Localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam) {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        //  {"account" : "", "email" : "", "page" : 0}
        return searchParam;
    }
```

<br>

### π JSON ννλ‘ κ° λΈλΌμ°μ  νμΈ

![JSONResult](https://user-images.githubusercontent.com/79084294/187443022-d9b039d1-c9f5-4401-8a05-51c30109e550.png)

- κΈ°μ‘΄μ Servlet λλ μ€νλ§μμ κ°λ°ν  λ, JSON λΌμ΄λΈλ¬λ¦¬λ₯Ό μ§μ  Maven gradleμ ν΅ν΄μ κ°μ Έμ¨ λ€ λ³ν
- κ°μ²΄λ₯Ό μ§μ  JSON λΌμ΄λΈλ¬λ¦¬λ₯Ό ν΅ν΄ JSON ννλ‘ λ³κ²½ν λ¦¬ν΄
- μμ¦ http ν΅μ  κ·κ²©μμ JSONμ νμ€μ²λΌ μ¬μ©νκΈ° λλ¬Έμ μ€νλ§λΆνΈμμ κΈ°λ³Έμ μΌλ‘ JSON λΌμ΄λΈλ¬λ¦¬κ° λ΄μ₯λμ΄ μμ
- Get λ©μλλ₯Ό λ§€μΉ­(Mapping) μμΌμ£Όκ³ , Requestμ λν Parameterλ₯Ό λ°μμ€κ³ , λ°μ΄ν°λ₯Ό μ²λ¦¬ν λ€ JSON ννλ‘ λ΄λ¦¬λ κ²μ΄ ν΅μ¬
- Get λ©μλμ μΏΌλ¦¬ νλΌλ―Έν°(κ²μ νλΌλ―Έν°)μ λν΄ μ΄λ»κ² μ²λ¦¬ν  κ²μΈμ§ νμ΅
- μ΄ν getμ λν΄ νμ΅ν  κ²μ μ£Όμμ°½μ νλΌλ―Έν° λΈμΆλλ€λ κ²
- λΈλΌμ°μ μμ μ£Όμμ λν μΊμκ° μ΄λ£¨μ΄μ§λ―λ‘ λ€μμ λκ°μ μμ²­μ ν  λ, λΉ λ₯΄κ² μΊμλ κ°μ κ°μ Έμ¬ μ μμ
