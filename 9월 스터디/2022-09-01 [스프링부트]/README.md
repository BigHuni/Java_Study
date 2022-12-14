# π Java Study

## πΈ 2022-09-01 λͺ©μμΌ

## [μ€νλ§ λΆνΈ νλ‘μ νΈ]

### 1. JPA

- MySQL Workbench DB μμ±
- μ€ν€λ§ μμ± ν νμ΄λΈ μμ±
- νμ΄λΈ μ»¬λΌ μ€μ 

![MySQL_study](https://user-images.githubusercontent.com/79084294/188127095-f2305b80-23f4-4ad3-8dcb-67a63ecd7856.png)

- User νμ΄λΈ
- id(BIGINT(20)) - PK ν€, NOT NULL, AI
- account(VARCHAR(45)) - NN
- email(VARCHAR(45)) => `μ΄λ©μΌμ μλ ₯νμ§ μμ μ μμΌλ NULL νμ©`
- phone_number(VARCHAR(45)) => `μ νλ²νΈλ₯Ό μλ ₯νμ§ μμ μ μμΌλ NULL νμ©`
- created_at(DATETIME) - NN => `DBμ λ°μ΄ν°κ° μμ΄λ©΄, μμ±μΌμ, μμ μΌμλ₯Ό λ¨κΈ°λ κ²μ΄ νμμμ νμ`
- created_by(VARCHAR(45)) - NN
- updated_at(DATETIME)
- updated_by(VARCHAR(45))

<br>

- μ²μ μμ± μ μμ μ μμΌλ NULL νμ©μ΄ λ§μ§λ§
- `created_at`μ `created_by`λ μμ±μ΄ λλ©΄ λ°λμ μμ±ν μ¬λκ³Ό μκ°μ΄ μ‘΄μ¬νκΈ° λλ¬Έμ NOT NULL

<br>

### 2. MySQL Workbench νμ΄λΈ μΈν μ μ΄ νλκ·Έ μλ―Έ

- `PK(Primary Key)` - νμ΄λΈμμ νΉμ  row νλλ₯Ό μλ³νλ μ­ν , νΉμ  rowλ₯Ό κ³ μ νκ² λνλΌ μ μλ κ°
- `NN(NOT NULL)` - NULLμ΄ μλ, PKμ ν¨κ» λ°λμ νλμ κ°μ κ°μ§κ³  μμ΄μΌ νκ³ , λΉ κ°μ κ°μ§λ©΄ μλ¨
- `BIN(μ΄μ§)` - λ°μ΄ν°λ₯Ό μ΄μ§ λ¬Έμμ΄λ‘ μ μ₯. λ¬Έμ μ§ν©μ΄ μμΌλ―λ‘ μ λ ¬ λ° λΉκ΅λ κ°μ μλ λ°μ΄νΈμ μ«μ κ°μ κΈ°λ°μΌλ‘ ν¨
- `UN(λΆνΈ μμ)` - μμκ° μλ μ«μ λ§ ν΄λΉ. λ²μκ° -500 ~ 500 μΈ κ²½μ° λμ , 0 ~ 1000 μΈ κ²½μ° λ²μλ λμΌνμ§λ§ 0μμ μμ
- `UQ` - κ³ μ  ν€ μμ± / μ κ±°
- `ZF` - 0μΌλ‘ μ±μμ§. κΈΈμ΄κ° INT(5)μ κ°μ΄ 5μΈ κ²½μ°, λͺ¨λ  νλλ 5λ²μ§Έ μλ¦¬κΉμ§ 0μΌλ‘ μ±μμ§. (12 = 00012, 400 = 00400 λ±)
- `AI(Auto Increment)` - ν΄λΉ μ»¬λΌμ λν΄μ DBMSκ° `μλμΌλ‘ μ¦κ°`νλ κ°μ λ£μ΄μ€
- PKκ° Surrogate KeyμΈ κ²½μ°μλ λ³΄ν΅ μ΄λ° μμΌλ‘ Auto Increment μμ±μ΄ μ€μ λμ΄ μμ λκ° λ§μ
- `G` - μμ± λ μ΄. μ¦, λ€λ₯Έ μ΄μ κΈ°λ°μΌλ‘νλ μμμ μν΄ μμ± λ κ°

<br>

### 3. MySQL Workbench μΈν ν IntelliJ μ€μ 

- build gradleμ dependency μΆκ°
- `implementation 'org.springframework.boot:spring-boot-starter-data-jpa'`
- `implementation 'org.springframework.boot:spring-boot-starter-web'`
- `testImplementation 'org.springframework.boot:spring-boot-starter-test'`
- `runtimeOnly 'mysql:mysql-connector-java'`
- resources - application.propertiesμ μ€νλ§ νλ‘μ νΈμ μΆκ°λ λΌμ΄λΈλ¬λ¦¬ μ€μ  κ΄λ¦¬

<br>

### π Springμ application.properties μ€μ 

```
# db source url
spring.datasource.url=jdbc:mysql://localhost:3306/study?useSSL=false&useUnicode=true&serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true

# db response name
spring.datasource.username=root

# db response password
spring.datasource.password=********

spring.jpa.show-sql=true

spring.jackson.property-naming-strategy=SNAKE_CASE
```

- `spring.datasource.url` => DBμ μ΄λ ν μ£Όμλ‘ μ°κ²°ν  κ²μΈμ§ μ€μ 
- λ‘μ»¬λ‘ DB-MySQLμ μ€μΉνκΈ° λλ¬Έμ localhostμ΄κ³ , κΈ°λ³Έ MySQL ν¬νΈ 3306 μ¬μ©
- κ·Έ λ€ `study`λ μ€ν€λ§λ₯Ό μλ―Έ
- mysql usernameμ `root`
- mysql passwordλ mysql 8λ²μ  μ΄μλΆν° passwordμ λ κ°λ ₯ν κ·μΉμ΄ μ μ©λλ©΄μ LOWλ‘ μ€μ νλλΌλ 8μ μ΄μ password μ€μ ν΄μΌ ν¨

<br>

### π DB MySQL - Spring κ° μ»€λ₯μ μ μ νμΈ

![DB-Spring αα₯αΌαα‘αΌ αα₯αα¦α¨αα§α«](https://user-images.githubusercontent.com/79084294/188153528-262b532b-6dca-49ef-bc66-139c10590dc9.png)
