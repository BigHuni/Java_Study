# ๐ Java Study

## ๐ธ 2022-09-02 ๊ธ์์ผ

## [์คํ๋ง ๋ถํธ ํ๋ก์ ํธ]

### 1. Entity ์์ฑ

- Entity

- `Camel Case` : ๋จ์ด๋ฅผ ํ๊ธฐํ  ๋, ์ฒซ ๋ฌธ์๋ ์๋ฌธ์๋ก ์์ํ๋ฉฐ ๋์ด์ฐ๊ธฐ ๋์  ๋๋ฌธ์๋ก ๋จ์ด๋ฅผ ๊ตฌ๋ถ
    - Java์ ๋ณ์๋ฅผ ์ ์ธํ  ๋, Camel Case๋ก ์ ์ธ
    - ex) phoneNumber, createdAt, updatedAt

- `Snake Case` : ๋จ์ด๋ฅผ ํ๊ธฐํ  ๋, ๋ชจ๋ ์๋ฌธ์๋ก ํ๊ธฐํ๋ฉฐ ๋์ด์ฐ๊ธฐ ๋์  `(_)`๋ก ํ๊ธฐ
    - DB ์ปฌ๋ผ์ ์ฌ์ฉ
    - ex) phone_number, created_at, updated_at

- API๋ฅผ ์ ์ํ๊ธฐ์ ๋ฐ๋ผ ๋ค๋ฅด์ง๋ง, ์ฃผ๋ก API ํต์  ๊ท๊ฒฉ์๋ ๊ตฌ๊ฐ์์๋ Snake Case๋ฅผ ๋ง์ด ์ฌ์ฉ

<br>

- `Entity` : JPA์์๋ ํ์ด๋ธ์ ์๋์ผ๋ก ์์ฑํด์ฃผ๋ ๊ธฐ๋ฅ ์กด์ฌ
- DB Table == JPA Entity

| Annotation       | ์ฉ๋                     | 
|:-----------------|:-----------------------|
| `Entity`         | ํด๋น Class๊ฐ Entity์์ ๋ช์  | 
| `Table`          | ์ค์  DB ํ์ด๋ธ์ ์ด๋ฆ์ ๋ช์ | 
| `Id`             | Index Primary Key๋ฅผ ๋ช์  | 
| `Column`         | ์ค์  DB Column์ ์ด๋ฆ์ ๋ช์   | 
| `GeneratedValue` | Primary Key ์๋ณํค์ ์ ๋ต ์ค์  | 

<br>

- DB => ์ค๋ค์ดํฌ ์ผ์ด์ค
- Java => ์นด๋ฉ ์ผ์ด์ค

<br>

- main - model ํ์์ entity ํด๋๋ฅผ ์์ฑ ํ User ํด๋์ค ์์ฑ
- User ํด๋์ค๋ DB์ ํ์ด๋ธ ์ด๋ฆ๊ณผ ๋์ผ

```
 package com.example.study.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

}
```

- `@Table(name = "user")`๋ ํด๋์ค์ ์ด๋ฆ๊ณผ DB Table์ ์ด๋ฆ์ด ๋์ผํ๋ค๋ฉด, @Table์ ์ ์ธํ์ง ์์๋ ์๋ ๋งตํ

<br>

- User ํ์ด๋ธ
- id(BIGINT(20)) - PK ํค, NOT NULL, AI
- account(VARCHAR(45)) - NN
- email(VARCHAR(45)) => `์ด๋ฉ์ผ์ ์๋ ฅํ์ง ์์ ์ ์์ผ๋ NULL ํ์ฉ`
- phone_number(VARCHAR(45)) => `์ ํ๋ฒํธ๋ฅผ ์๋ ฅํ์ง ์์ ์ ์์ผ๋ NULL ํ์ฉ`
- created_at(DATETIME) - NN => `DB์ ๋ฐ์ดํฐ๊ฐ ์์ด๋ฉด, ์์ฑ์ผ์, ์์ ์ผ์๋ฅผ ๋จ๊ธฐ๋ ๊ฒ์ด ํ์์์ ํ์`
- created_by(VARCHAR(45)) - NN
- updated_at(DATETIME)
- updated_by(VARCHAR(45))

<br>

```java

@Entity
public class User {
    private Long id;

    private String account;

    private String email;

    private String phoneNumber;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;
}
```

- `id`๋ BIGINT์ด๊ธฐ ๋๋ฌธ์ Long ํ์
- `account, email` String ํ์
- `phoneNumber`๋ `์๋ฐ`์์๋ `์นด๋ฉ ์ผ์ด์ค`๋ก ์ฌ์ฉํ์ง๋ง, ์ค์  `๋ฐ์ดํฐ๋ฒ ์ด์ค`์์๋ `์ค๋ค์ดํฌ ์ผ์ด์ค`
- ์ด๋ฐ ์ ์ JPA์์ ์๋์ผ๋ก ๋งค์นญํด์ฃผ๊ธฐ ๋๋ฌธ์ ๋ฐ๋ก ๋ณ์๋ฅผ ์ ์ธํ์ง ์์๋ ๋จ (phone_Number ์ฒ๋ผ)
- `createdAt, updatedAt`์ DateTime์ด๋ฏ๋ก LocalDateTime ํ์
- `createdBy, updatedBy`๋ String ํ์

<br>

- `@column(name = "account")`์ด๋ผ๋ annotation์ account๋ผ๋ ์ด๋ฆ์ด DB ์ปฌ๋ผ์ ์๋ฏธํ๋๋ฐ, ๋ง์ฝ ๋ณ์๋ช๊ณผ ๋์ผํ๋ค๋ฉด ๊ธฐ์ํ์ง ์์๋ ๋จ
- ์๋ณ์์ ๋ํด์ `@Id` ๋ถ์ด๊ธฐ
- `@generatedValue`๋ก ์ด๋ค ์์ผ๋ก ๊ด๋ฆฌํ  ๊ฒ์ธ์ง ์ ๋ต ์ค์ 
- `@GeneratedValue(strategy)` ์ ๋ต์ผ๋ก ์ด 4๊ฐ์ง ์ ๋ ์๋๋ฐ, MySQL์ ์ฌ์ฉํ๊ธฐ ๋๋ฌธ์ `GenerationType.IDENTITY` ์ฌ์ฉ
- `@Data` ์ ์ธํ์ฌ ๊ธฐ๋ณธ ์์ฑ์์ ๋ณ์์ ๋ํ์ฌ get / set ๋ฉ์๋ ์์ฑ
- `@AllArgsConstructor` ์ ์ธํ์ฌ ๋ชจ๋  ๋งค๊ฐ๋ณ์๋ฅผ ๊ฐ๋ ์์ฑ์ ์์ฑ
- ์ด ๊ณผ์ ๊น์ง ๊ธฐ๋ณธ์ ์ผ๋ก Entity ์ค์ ํ๊ณ , Table ์ฐ๊ฒฐ ์๋ฃ

```java
package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String account;

    private String email;

    private String phoneNumber;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;
}
```

- `DB Table`์ ๋ง์ถฐ์ ํด๋์ค๋ฅผ ์ ์ธํ๊ณ , `Entity` ์ด๋ฆ ์ค์ , `DB ์ปฌ๋ผ์ ๋ง์ถฐ ๊ฐ ๋ณ์`๋ฅผ `Camel Case` ๋ฐฉ์์ผ๋ก ์ ์ธ
- ๊ทธ๋ ๊ฒ ๋๋ฉด, `JPA Entity`๋ ์๋์ผ๋ก Camel Case๋ฅผ `DB์ Snake Case`๋ก ๋งค์นญ

<br>

### 2. Repository

- ๋ฐ๋ก ์ฟผ๋ฆฌ๋ฌธ์ ์์ฑํ์ง ์์๋ ๊ธฐ๋ณธ์ ์ธ ์ธํฐํ์ด์ค๋ฅผ ํตํด `CRUD`๋ฅผ ์ฌ์ฉ
    - `CREATE` : ์์ฑ
    - `READ` : ์ฝ๊ธฐ(SELECT)
    - `UPDATE` : ์๋ฐ์ดํธ(๊ฐฑ์ )
    - `DELETE` : ์ญ์ 

<br>

- `@Repository`๋ฅผ ์ถ๊ฐํ๊ณ , ์ด๋ฏธ ๊ฐ๋ฐ๋์ด ์๋ JpaRepository๋ฅผ ์์ ๋ฐ์์ฃผ๋ฉด ๋จ
- ์ธํฐํ์ด์ค ๋ค์ด๋ฐํ  ๋, ๋ณดํต `ํด๋์ค Entity๋ช` + `Repository` = UserRepository
- public interface UserRepository extends JpaRepository<T, ID>
- JpaRepository์ `T` => ์ด๋ ํ ํ์์ object๊ฐ ๋ค์ด๊ฐ ๊ฒ์ธ์ง, `ID` => PK ๊ธฐ๋ณธํค์ ๋ํด ์ด๋ค ํ์์ด ๋ค์ด๊ฐ ๊ฒ์ธ์ง
- `public interface UserRepository extends JpaRepository<User, Long>`
- `Long`์ User๋ผ๋ Entity์ id ๊ฐ์ผ๋ก Long์ ํ๊ธฐ ๋๋ฌธ์ UserRepository์ `User` ์ํฐํฐ์ ๊ธฐ๋ณธํค Id ์ธ๋ฑ์ค ๊ฐ์ผ๋ก `Long`์ด๋ผ๊ณ  ์ ์ธํ๋ ๊ฒ
- DB Table์ Entity ์์ฑ๊ณผ Repository ์ ์ธ์ ํตํด ๊ธฐ๋ณธ์ ์ธ CRUD๋ฅผ ์คํํ  ์ ์์
