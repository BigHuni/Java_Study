# π Java Study

## πΈ 2022-08-01 μμμΌ

## [ν΄λμ€μ κ°μ²΄]

### 1. μμ±μ(Constructor)

- κ°μ²΄λ₯Ό μμ±ν  λ `new` ν€μλμ ν¨κ» νΈμΆ(κ°μ²΄ μμ± μΈμλ νΈμΆν  μ μμ)

- μΈμ€ν΄μ€λ₯Ό μ΄κΈ°ν νλ μ½λκ° κ΅¬νλ¨(μ£Όλ‘ λ©€λ² λ³μ μ΄κΈ°ν)

- λ°ν κ°μ΄ μμ, μμλμ§ μμ

- μμ±μλ ν΄λμ€ μ΄λ¦κ³Ό λμΌ

<br>

- κΈ°λ³Έ μμ±μ : νλμ ν΄λμ€μλ λ°λμ νλ μ΄μμ μμ±μκ° μ‘΄μ¬ν΄μΌ ν¨

- νλ‘κ·Έλλ¨Έκ° μμ±μλ₯Ό κ΅¬ννμ§ μμΌλ©΄ μ»΄νμΌλ¬κ° μμ±μ μ½λ λ£μ΄μ€

- λ§€κ° λ³μκ° μκ³  κ΅¬νλΆκ° μμ

- λ§μ½, ν΄λμ€κ° λ€λ₯Έ μμ±μκ° μλ κ²½μ° λν΄νΈ μμ±μλ μ κ³΅λμ§ μμ(λν΄νΈ μμ±μ => λ§€κ° λ³μ, κ΅¬νλΆκ° μλ μμ±μ)

<br>

- μμ±μ κ΅¬ν μμ (`public` μλ¦¬μ λ€λ₯Έ κ²μ΄ μ€κ±°λ μμ μ μμ)

```java
    public Student(int id, String name) {
        studentID = id;
        studentName = name;
    }
```

- λ κ°μ λ§€κ° λ³μλ₯Ό λ°λλ°, μ²«λ²μ§Έ λ§€κ° λ³μλ `studentID`μ μ΄κΈ°ν

- λλ²μ§Έ λ§€κ° λ³μλ `studentName`μ μ΄κΈ°ν

- μ΄λ κ² μμ±νλ©΄ Test μ¦, main ν¨μκ° μλ κ³³μ μμ±μ ν¨μκ° μκΈ° λλ¬Έμ μ€λ₯ λ°μ

- μ΄λ₯Ό ν΄κ²°νλ λ°©λ²μ 2κ°μ§, 1.λν΄νΈ μμ±μλ₯Ό μ§μ  μμ±

- μ μμ±μ μλ μ½λ μλ¦¬ μμ λν΄νΈ μμ±μ μμ± `public Student() {}`

- 2.Test ν΄λμ€ μͺ½μ `Student studentHeo = new student();`

<br>

- μ€λ² λ‘λ© : λ©μλ(μμ±μ λ±)λ₯Ό μ¬λ¬ κ° μ½μν  μ μλ€.

- κ°μ μ΄λ¦μ λ©μλμ λ€λ₯Έ λ§€κ° λ³μ

- μμ±μ μ€λ²λ‘λ© : μμ±μλ₯Ό λ κ° μ΄μ κ΅¬ννλ κ²½μ°

- μ¬μ©νλ μ½λμμ μ¬λ¬ μμ±μ μ€ μ ννμ¬ μ¬μ©ν  μ μμ

- private λ³μλ μμ±μλ₯Ό μ΄μ©νμ¬ μ΄κΈ°ν ν  μ μμ

- private : ν΄λΉ ν΄λμ€ λ΄λΆμμλ§ μ¬μ©ν  μ μλ λ³μ, μΈλΆ ν΄λμ€ μ°Έμ‘° λΆκ°λ₯

<br>

### 2. μ°Έμ‘° μλ£ν

- λ³μμ μλ£ν
  - κΈ°λ³Έ μλ£ν : int, long, float, double λ±
  - μ°Έμ‘° μλ£ν : String, Date, Student λ±

<br>

- ν΄λμ€νμΌλ‘ λ³μλ₯Ό μ μΈν¨

```
    String name;
```

<br>

- κΈ°λ³Έ μλ£νμ μ¬μ©νλ λ©λͺ¨λ¦¬κ° μ ν΄μ Έ μμ§λ§, μ°Έμ‘° μλ£νμ ν΄λμ€μ λ°λΌ λ€λ¦

- μ°Έμ‘° μλ£ν μ§μ  λ§λ€μ΄μ μ¬μ©νκΈ°
  - νμ ν΄λμ€(Student)μ μλ κ³Όλͺ© μ΄λ¦, κ³Όλͺ© μ±μ  μμ±μ κ³Όλͺ© ν΄λμ€(Subject)λ‘ λΆλ¦¬
  - Subject μ°Έμ‘° μλ£ν λ©€λ² λ³μλ₯Ό Studentμ μ μνμ¬ μ¬μ©ν¨

<br>

```java
    public Student() {
		korea = new Subject();
		math = new Subject();
	}
```

- μ°Έμ‘° μλ£ν νμμΌλ‘ λ³μ μ μΈ νμ μμ±μμμ μ΄κΈ°ν νλ©΄, κ·Έ μμ koreaμ mathκ° μμ±

<br>

### 3. ν΄λΉ Eclipse μ€μ΅μ λ¦¬

<br>

- μλ Studentμ μ¬λ¬ μμ±μ΄ μμλλ°, κ·Έ μμ±λ€μ κ°λ³μ μΈ κ°μ²΄κ° λ  μ μλ€.

- κ·Έ κ°λ³μ μΈ κ°μ²΄λ₯Ό λ½μμ ν΄λμ€λ‘ μμ±νλ€.(Subject ν΄λμ€)

- λ€μ Student ν΄λμ€μλ€κ°λ μ°Έμ‘° μλ£ν μ μΈνκΈ°
  (`Student korea;`, `Student math;`)

- μμ±μ ν¨μ μμ±

```java
    public Student(int id, String name) {

		studentID = id;
		studentName = name;

		korea = new Subject();
		math = new Subject();
	}
```

- μμ±μ ν¨μλ₯Ό μμ±νμ§ μκ³  κ°μ λ£μ§ μκ² λλ©΄, Null κ°μ΄ λ€μ΄κ° μ€λ₯ λ°μ

<br>

## π Eclipse μ€μ΅

![day6](https://user-images.githubusercontent.com/79084294/182210167-f521a736-512c-41dd-abda-18717581ccd3.png)

<br>

## π Eclipse μΆλ ₯ Console

![day6_console](https://user-images.githubusercontent.com/79084294/182210424-1576b224-e3ba-4abc-bd71-48603381f7c9.png)
