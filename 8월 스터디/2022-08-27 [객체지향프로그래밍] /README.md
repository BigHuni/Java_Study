# π Java Study

## πΈ 2022-08-27 ν μμΌ

## [Object ν΄λμ€]

### 1. Object ν΄λμ€

- λͺ¨λ  ν΄λμ€μ μ΅μμ ν΄λμ€
- java.lang.Object ν΄λμ€
- λͺ¨λ  ν΄λμ€λ Object ν΄λμ€μμ μμ λ°μ
- λͺ¨λ  ν΄λμ€λ Object ν΄λμ€μ λ©μλλ₯Ό μ¬μ©ν  μ μμ
- λͺ¨λ  ν΄λμ€λ Object ν΄λμ€μ μΌλΆ λ©μλλ₯Ό μ¬μ νμ¬ μ¬μ©ν  μ μμ
    - `final`λ‘ μ μλ λ©μλ κ°μ κ²½μ°, νμ ν΄λμ€μμ μ¬μ μν  μ μκΈ° λλ¬Έ μ΄μΈ λ€λ₯Έ λ©μλ κ°μ κ²½μ°μ μ¬μ μνμ¬ μ¬μ©ν  μ μμ

<br>

- μλ°κ° μ€μΉλ ν΄λλ‘ λ€μ΄κ° jdkλ₯Ό λ³΄λ©΄, lib(λΌμ΄λΈλ¬λ¦¬) ν΄λμ src.zipμ΄ μμ
- μ΄ μμΆνμΌμ νλ©΄ μλ°κ΄λ ¨ μμ€ λ±μ λ³Ό μ μμ
- java.base - java - lang ν¨ν€μ§ μμ κΈ°λ³Έμ μΌλ‘ λ§μ΄ μ¬μ©νλ μλ°νμΌ λ±μ΄ μμ
- java.langμ import νμ§ μμλ μλ° μ»΄νμΌλ¬κ° μλμΌλ‘ import ν΄μ£ΌκΈ° λλ¬Έ

<br>

- ToStringTest ν΄λμ€

```java
    package object;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class ToStringTest {

    public static void main(String[] args) {

        Book book = new Book("ν μ§", "λ°κ²½λ¦¬");
        System.out.println(book);

        String str = new String("ν μ§");
        System.out.println(str);  // System.out.println(str.toString());
    }

}
```

<br>

- μΆλ ₯

```
    object.Book@fad74ee
    ν μ§
```

- `Book book = new Book("ν μ§", "λ°κ²½λ¦¬");`μ μΆλ ₯μ λ©λͺ¨λ¦¬ μ£Όμ
- `String str = new String("ν μ§");`μ μΆλ ₯μ ν μ§κ° μΆλ ₯λ¨
- μ΄μ λ String ν΄λμ€λ jdk ν΄λμ€μ΄λ―λ‘ μ΄ ν΄λμ€ μμ `toString`μ΄λΌλ λ©μλκ° μ΄λ―Έ μ μλμ΄ μμ
- toString() λ©μλλ μ΄λ€ κ°μ²΄μ μ λ³΄λ₯Ό string ννλ‘ μ λ³΄λ₯Ό νννλ €κ³  ν  λ, νΈμΆλλ λ©μλ
- toString() λ©μλλ Objectμ λ©μλλ‘ Object λ©μλλ₯Ό μ¬μ μν΄μ String ν΄λμ€ μμ κ°μ§κ³  μλ characterμ λ°°μ΄μ μΆλ ₯
- λ§μ½, Bookμ λ©λͺ¨λ¦¬ μ£Όμκ° μλ μμ μ μλ titleκ³Ό authorλ‘ νννκ³  μΆλ€λ©΄ toStringμ μ¬μ μ νλ©΄ λ¨
    - Source - override - toString μ²΄ν¬
- μ λ¦¬ : Object ν΄λμ€κ° λͺ¨λ  ν΄λμ€μ μ΅μμ ν΄λμ€(Super Class)

## π Eclipse μ€μ΅

![day28_console1](https://user-images.githubusercontent.com/79084294/187075802-225953b5-56c0-44f1-ab62-747bcec700c6.png)

<br>

## π Eclipse μΆλ ₯ Console

![day28](https://user-images.githubusercontent.com/79084294/187075803-8a839ead-827e-4541-a9a9-d203fcf34206.png)
