# π Java Study

## πΈ 2022-08-04 λͺ©μμΌ

## [ν΄λμ€μ κ°μ²΄]

### 1. static λ³μ, λ©μλ

- `static λ³μ` : μ¬λ¬ μΈμ€ν΄μ€κ° νλμ κ°μ κ³΅μ ν  νμκ° μμ

  - μ²μ νλ‘κ·Έλ¨μ΄ λ‘λλ  λ λ°μ΄ν° μμ­μ μμ±λ¨

  - μΈμ€ν΄μ€μ μμ±κ³Ό μκ΄μμ΄ μ¬μ©ν  μ μμΌλ―λ‘ ν΄λμ€ μ΄λ¦μΌλ‘ μ°Έμ‘°

  - `ν΄λμ€ λ³μ`, `μ μ  λ³μ`λΌκ³ λ ν¨

  - C μΈμ΄ κ°μ κ²½μ°, Global λ³μλ‘ μΈλΆμ λ³μλ₯Ό μ μΈν΄λμΌλ©΄ νλ‘κ·Έλ¨ μ μ²΄μμ μ¬μ©ν  μ μμ

  - JAVAλ ν΄λμ€ μΈλΆμλ μ΄λ ν λ³μλ₯Ό λ μ μκ³ , λͺ¨λ  λ³μ λλ λ©μλκ° ν΄λμ€ λ΄λΆμ μμ΄μΌ ν¨

  - static μΌλ‘ μ€μ λ λ³μλ μ¬λ¬ μΈμ€ν΄μ€κ° κ·Έ κ°μ κ³΅μ ν  μ μμ

  - μΌλ° λ³μλ€μ `new` ν€μλλ‘ μμ±νμ§λ§, static λ³μλ μ²μ μ΄ νλ‘κ·Έλ¨μ΄ λ‘λλ  λ λ°μ΄ν° μμ­μ μμ±

  ```
      Student.serialNum = 100;
  ```

<br>

```java
    Student studentHeo = new Student("Heo");
	System.out.println(studentHeo.serialNum);   // 1001

	Student studentKim = new Student("Kim");
	System.out.println(studentKim.serialNum);   // 1002
	System.out.println(studentHeo.serialNum);   // 1002
```

- μ΄κΈ°κ° StudentID = 1000 μΌλ‘ μ€μ 

- μμ±μ λ§λ€ μ serialNum++ μ²λ¦¬

- μ μΆλ ₯λ¬Έ 3κ° μ€ 2λ²κ³Ό 3λ²μ΄ λμΌν κ²μΌλ‘ λ³΄μ studentHeoμ studentKim λ κ°κ° κ°μ λ©λͺ¨λ¦¬λ₯Ό λ°λΌλ³΄κ³  μμ

- serialNum = 1000 (`λ°μ΄ν° μμ­`)

- studentHeo, studentKim (`μ€ν λ©λͺ¨λ¦¬`)

- studentHeo μΈμ€ν΄μ€, studentKim μΈμ€ν΄μ€ (`ν λ©λͺ¨λ¦¬`)

- μ€ν λ©λͺ¨λ¦¬μ λ λ³μκ° λμΌν λ©λͺ¨λ¦¬ serialNumμ λ°λΌλ³΄κ³  μμ

<br>

```java
    public static int getSerialNum() {
		int i = 0;
		studentName = "Heo";

		return serialNum;
	}
```

- `int i = 0` μ i μ§μ­λ³μλ ν¨μκ° μμλλ©΄, μ€ν λ©λͺ¨λ¦¬μ μμ±λμλ€κ° λλλ©΄ μμ΄μ§

- `return serialNum` μ static λ³μμ΄κΈ° λλ¬Έμ static λ©μλ μ¬μ©

- `studentName = "Heo"` μ²λΌ `static λ©μλ μ`μμ `μΈμ€ν΄μ€ λ³μλ₯Ό μ¬μ©ν  μ μμ` => static λ©μλλ μΈμ€ν΄μ€ μμ±κ³Όλ λ¬΄κ΄νκ² νΈμΆλλ λ©μλ

- λ€λ₯Έ μλμ κ°μ΄ μΌλ° λ©μλμμ static λ³μλ₯Ό μ¬μ©ν΄λ λ¬Έμ κ° λ°μνμ§ μμ μ΄μ  => static λ³μλ λ§¨ μ²μμ νλ‘κ·Έλ¨μ΄ λ‘λ©λ  λ μμ±λκΈ° λλ¬Έ, λ°λΌμ staticμ ν° λ©λͺ¨λ¦¬λ₯Ό μ¬μ©νλ©΄ μλ μ ν λ° λΆν λ°μ

<br>

```java
    public int getStudentID() {
        serialNum++;
        return studentID;
    }
```

- staticμ΄ μλ μΌλ° λ©μλμμ `serialNum++` μ ν΄λ λ¬Έμ κ° λ°μνμ§ μμ

<br>

- `static λ©μλ μ λ¦¬`

- static λ³μλ₯Ό μν κΈ°λ₯μ μ κ³΅νλ static λ©μλ

- static λ©μλμμλ μΈμ€ν΄μ€ λ³μλ₯Ό μ¬μ©ν  μ μμ

- ν΄λμ€ μ΄λ¦μΌλ‘ μ°Έμ‘°νμ¬ μ¬μ©νλ λ©μλ

- `Student.getSerialNum()`

- ν΄λμ€ λ©μλ, μ μ  λ©μλλΌκ³ λ ν¨

<br>

| λ³μ μ ν                  | μ μΈ μμΉ                                   | μ¬μ© λ³μ                                                                            | λ©λͺ¨λ¦¬      | μμ±κ³Ό μλ©Έ                                                                                             |
| :------------------------- | :------------------------------------------ | :----------------------------------------------------------------------------------- | :---------- | :------------------------------------------------------------------------------------------------------ |
| `μ§μ­ λ³μ(λ‘μ»¬ λ³μ)`     | ν¨μ λ΄λΆμ μ μΈ                            | ν¨μ λ΄λΆμμλ§ μ¬μ©                                                                 | μ€ν        | ν¨μκ° νΈμΆλ  λ μμ±λκ³  ν¨μκ° λλλ©΄ μλ©Έ                                                            |
| `λ©€λ² λ³μ(μΈμ€ν΄μ€ λ³μ)` | ν΄λμ€ λ©€λ² λ³μλ‘ μ μΈ                     | ν΄λμ€ λ΄λΆμμ μ¬μ©, privateμ΄ μλλ©΄ μ°Έμ‘° λ³μλ‘ λ€λ₯Έ ν΄λμ€μμ μ¬μ© κ°λ₯         | ν          | μΈμ€ν΄μ€κ° μμ±λ  λ νμ μμ±λκ³ , κ°λΉμ§ μ»¬λ ν°κ° λ©λͺ¨λ¦¬λ₯Ό μκ±°ν  λ μλ©Έ                             |
| `static λ³μ(ν΄λμ€ λ³μ)` | static μμ½μ΄λ₯Ό μ¬μ©νμ¬ ν΄λμ€ λ΄λΆμ μ μΈ | ν΄λμ€ λ΄λΆμμ μ¬μ©νκ³ , privateμ΄ μλλ©΄ ν΄λμ€ μ΄λ¦μΌλ‘ λ€λ₯Έ ν΄λμ€μμ μ¬μ© κ°λ₯ | λ°μ΄ν° μμ­ | νλ‘κ·Έλ¨μ΄ μ²μ μμν  λ μμμ ν¨κ» λ°μ΄ν° μμ­μ μμ±λκ³ , νλ‘κ·Έλ¨μ΄ λλκ³  λ©λͺ¨λ¦¬λ₯Ό ν΄μ ν  λ μλ©Έ |

<br>

### 2. Singleton Pattern(static μμ©)

- `singleton pattern` : λ¨ νλλ§ μ‘΄μ¬νλ μΈμ€ν΄μ€
  - μμ±μλ private
  - staticμΌλ‘ μ μΌν κ°μ²΄ μμ±
  - μΈλΆμμ μ μΌν κ°μ²΄λ₯Ό μ°Έμ‘°ν  μ μλ public static get() λ©μλ κ΅¬ν
  - μ) νμ¬, νκ΅ λ± νλλ§ μμ΄μΌ νλ μΈμ€ν΄μ€

<br>

- `μ±κΈν€ ν¨ν΄`μ `μ¬μ©νλ μ΄μ `
  1. μ΅μ΄ ν λ²μ new μ°μ°μλ₯Ό ν΅ν΄ κ³ μ λ λ©λͺ¨λ¦¬ μμ­μ μ¬μ©νκΈ° λλ¬Έμ λ©λͺ¨λ¦¬ λ­λΉ λ°©μ§
  2. λ€λ₯Έ ν΄λμ€κ° λ°μ΄ν° κ³΅μ κ° μ½λ€.
  3. λλ©μΈ κ΄μ μμ μΈμ€ν΄μ€κ° ν κ°λ§ μ‘΄μ¬νλ€λ κ²μ λ³΄μ¦νκ³  μΆμ κ²½μ°

<br>

- `μ±κΈν€ ν¨ν΄`μ `λ¬Έμ μ `

  1. μ±κΈν€ ν¨ν΄ κ΅¬ν μ½λ μμ²΄κ° λ§μ΄ νμ
  2. νμ€νΈνκΈ° μ΄λ €μ, νμ€νΈκ° κ²©λ¦¬λ νκ²½μμ μνλλ €λ©΄ λ§€λ² μΈμ€ν΄μ€μ μνλ₯Ό μ΄κΈ°νν΄μ€μΌ ν¨
  3. new ν€μλλ₯Ό μ§μ  μ¬μ©νμ¬ ν΄λμ€ μμμ κ°μ²΄λ₯Ό μμ±νκ³  μμΌλ―λ‘, SOLID μμΉ μ€ DIPμ μλ° νΉμ OCP μμΉ μλ°ν  κ°λ₯μ± λμ

<br>

- `SOLID` : νλ‘κ·Έλλ¨Έκ° μκ°μ΄ μ§λλ μ μ§ λ³΄μμ νμ₯μ΄ μ¬μ΄ μμ€νμ λ§λ€κ³ μ μ€κ³ν μμΉ
  - `DIP(μμ‘΄κ΄κ³ μ­μ  μμΉ)` : μμ‘΄κ΄κ³λ₯Ό λ§Ίμ λ, λ³ννκΈ° μ¬μ΄ κ² λ³΄λ¨ λ³ννκΈ° μ΄λ €μ΄ κ²μ μμ‘΄ν΄μΌ νλ€.
  - `OCP(κ°λ°©-νμ μμΉ)` : κΈ°μ‘΄μ μ½λλ₯Ό λ³κ²½νμ§ μκ³ , κΈ°λ₯μ μΆκ°νκ±°λ μμ ν  μ μλλ‘ μ€κ³ν΄μΌ νλ€.
  - `SRP(λ¨μΌ μ±μ μμΉ)` : μννΈμ¨μ΄μ μ€κ³ λΆν(ν΄λμ€, λ©μλ λ±)μ λ¨ νλμ μ±μλ§μ κ°μ ΈμΌ νλ€.
  - `LSP(λ¦¬μ€μ½ν μΉν μμΉ)` : μμ ν΄λμ€λ λΆλͺ¨ ν΄λμ€μμ κ°λ₯ν νμλ₯Ό μνν  μ μμ΄μΌ νλ€.
  - `ISP(μΈν°νμ΄μ€ λΆλ¦¬ μμΉ)` : ν ν΄λμ€λ μμ μ΄ μ¬μ©νμ§ μλ μΈν°νμ΄μ€λ κ΅¬ννμ§ μμμΌ νλ€.

<br>

## π Eclipse μ€μ΅

![day8](https://user-images.githubusercontent.com/79084294/182936917-633308e2-be79-459a-b1dc-4103ea76fada.png)

<br>

## π Eclipse μΆλ ₯ Console

![day8_console1](https://user-images.githubusercontent.com/79084294/182936938-ee9528d1-e9fe-45e5-b52f-10963eb2f61d.png)

![day8_console2](https://user-images.githubusercontent.com/79084294/182936954-e31f340a-e477-441a-8e5b-7c91b58225d6.png)
