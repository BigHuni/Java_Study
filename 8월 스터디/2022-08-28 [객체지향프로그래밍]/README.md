# ๐ Java Study

## ๐ธ 2022-08-28 ์ผ์์ผ

## [Object ํด๋์ค]

### 1. toString() ๋ฉ์๋์ ์ํ

```
    getClass( ).getName( ) + '@' + Integer.toHexString(hashCode( ))
```

- ๊ฐ์ฒด์ ์ ๋ณด๋ฅผ String์ผ๋ก ๋ฐ๊พธ์ด ์ฌ์ฉํ  ๋ ์ ์ฉํจ
- ์๋ฐ ํด๋์ค ์ค์๋ ์ด๋ฏธ ์ ์๋ ํด๋์ค๊ฐ ๋ง์(์ : String, Integer, Calendar ๋ฑ)
- ๋ง์ ํด๋์ค์์ ์ฌ์ ์ํ์ฌ ์ฌ์ฉ

<br>

### 2. equals() ๋ฉ์๋

- ๋ ๊ฐ์ฒด์ ๋์ผํจ์ ๋ผ๋ฆฌ์ ์ผ๋ก ์ฌ์ ์ ํ  ์ ์์
- ๋ฌผ๋ฆฌ์  ๋์ผํจ : ๊ฐ์ ์ฃผ์๋ฅผ ๊ฐ์ง๋ ๊ฐ์ฒด(๊ฐ์ ๋ฉ๋ชจ๋ฆฌ)
- ๋ผ๋ฆฌ์  ๋์ผํจ : ๊ฐ์ ํ๋ฒ์ ํ์, ๊ฐ์ ์ฃผ๋ฌธ ๋ฒํธ์ ์ฃผ๋ฌธ
- ๋ฌผ๋ฆฌ์ ์ผ๋ก ๋ค๋ฅธ ๋ฉ๋ชจ๋ฆฌ์ ์์ฐจํ ๊ฐ์ฒด๋ผ๋ ๋ผ๋ฆฌ์ ์ผ๋ก ๋์ผํจ์ ๊ตฌํํ๊ธฐ ์ํด ์ฌ์ฉํ๋ ๋ฉ์๋

<br>

```java
    public class EqualsTest {

    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);       // false
        System.out.println(str1.equals(str2));  // true
    }

}
```

- `str1 == str2`๋ ์๋ก ๋ค๋ฅธ ๋ฉ๋ชจ๋ฆฌ ์ฃผ์๋ฅผ ๊ฐ๊ธฐ ๋๋ฌธ์ `false`
- `str1.equals(str2)`๋ String์ ๊ฒฝ์ฐ ๋ฌธ์์ด์ด ๊ฐ์ผ๋ฉด ๊ฐ๋ค๊ณ  ์ฌ์ ์ํ์ฌ `true` ๋ฐํ

<br>

```java
    public class EqualsTest {

    public static void main(String[] args) {

        Student Lee = new Student(100, "์ด์์ ");
        Student Lee2 = Lee;
        Student Shin = new Student(100, "์ด์์ ");

        System.out.println(Lee == Shin);       // false
        System.out.println(Lee.equals(Shin));  // false
    }

}
```

- equals์ ๊ฒฐ๊ณผ๋ก `false`๋ฅผ `true`๋ก ๋ฐ๊พธ๊ณ  ์ถ๋ค๋ฉด ์ฌ์ ์
- ``` 
  @Override
  public boolean equals(Object obj) {} ```
- Lee์ Shin์ด equals์ Object ๋งค๊ฐ๋ณ์๋ก ๋์ด๊ฐ
- Object๋ก ๋์ด๊ฐ๋ฉด ์ ์บ์คํ(์๋ ํ ๋ณํ)
- ์ด๋ฅผ ๋ค์ ๋ค์ด ์บ์คํ ํด์ผํจ

<br>

### 3. hashCode() ๋ฉ์๋

- hashCode() ๋ฉ์๋์ ๋ฐํ ๊ฐ : ์ธ์คํด์ค๊ฐ ์ ์ฅ๋ ๊ฐ์๋จธ์ ์ ์ฃผ์๋ฅผ 10์ง์๋ก ๋ฐํ
- ๋ ๊ฐ์ ์๋ก ๋ค๋ฅธ ๋ฉ๋ชจ๋ฆฌ์ ์์นํ ์ธ์คํด์ค๊ฐ ๋์ผํ๋ค๋ ๊ฒ
    - ๋ผ๋ฆฌ์ ์ผ๋ก ๋์ผ : equals()์ ๋ฐํ๊ฐ์ด true
    - ๋์ผํ hashCode ๊ฐ์ ๊ฐ์ง : hashCode()์ ๋ฐํ ๊ฐ์ด ๋์ผ

<br>

## ๐ Eclipse ์ค์ต

![day29](https://user-images.githubusercontent.com/79084294/187220263-a4f3f44d-084d-4476-bfdb-ab51e698d5f4.png)

<br>

## ๐ Eclipse ์ถ๋ ฅ Console

![day29_console1](https://user-images.githubusercontent.com/79084294/187220272-d8c6f0c9-c917-4fc7-8fef-50a146114153.png)
