# ๐ Java Study

## ๐ธ 2022-08-03 ์์์ผ

## [ํด๋์ค์ ๊ฐ์ฒด]

### 1. this

- ์์ ์ ๋ฉ๋ชจ๋ฆฌ๋ฅผ ๊ฐ๋ฆฌํด

- ์์ฑ์์์ ๋ค๋ฅธ ์์ฑ์๋ฅผ ํธ์ถ

- ์ธ์คํด์ค ์์ ์ ์ฃผ์๋ฅผ ๋ฐํ

<br>

- ์์ฑ์์์ ๋ค๋ฅธ ์์ฑ์๋ฅผ ํธ์ถ

```java
    public Person() {
        this("์ด๋ฆ ์์", 1);
    }

    public Person(String naem, int age) {
        this.name = name;
        this.age = age;
    }
```

<br>

- ์์ฑ์์ ์ญํ  => ์ธ์คํด์ค์ ๊ฐ์ ์ด๊ธฐํ

- ์ธ์คํด์ค๊ฐ ๋ชจ๋ ์์ฑ๋์ง ์์๋๋ฐ, ๋ฌด์จ ์ผ์ ํ๋ ค๋ฉด ๋ฌธ์  ๋ฐ์ ๊ฐ๋ฅ

- this ๋ก ๋ค๋ฅธ ๊ฐ์ฒด๋ฅผ ์์ฑํ  ๋, ํญ์ first statement ์ด์ด์ผ ํจ.

```java
    public Person() {
        age = 100;    // ๋ค๋ฅธ statement ์ค๋ฉด ์ค๋ฅ ๋ฐ์
        this("์ด๋ฆ ์์", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
```

<br>

```java
    public static void main(String[] args) {

		Person personNoname = new Person();
		personNoname.showInfo();

		Person personHeo = new Person("Heo", 20);
		personHeo.showInfo();
		System.out.println(personHeo);     // exthis.Person@1a1d6a08

		Person p = personHeo.getSelf();
		System.out.println(p);    // exthis.Person@1a1d6a08
	}
```

```java
    public Person getSelf() {
		return this;
	}
```

- ์ฐธ์กฐ ๋ณ์ `personHeo`์ ์ฐธ์กฐ ๋ณ์๊ฐ ๊ฐ์ ธ์จ `getSelf()` ๋ฉ์๋๋ฅผ ์ฐพ์๊ฐ๋ณด๋ฉด this ๊ฐ ๋ฆฌํด

- ๋ฐ๋ผ์ ๋์ด ๊ฐ๋ฆฌํค๋ ๋ฉ๋ชจ๋ฆฌ ๊ฐ์ `exthis.Person@1a1d6a08` ์ผ๋ก ๋์ผ

<br>

### 2. ๊ฐ์ฒด ๊ฐ ํ๋ ฅ

- ๊ฐ์ฒด์งํฅ ํ๋ก๊ทธ๋จ์ ๊ฐ์ฒด๋ฅผ ์ ์ํ๊ณ  ๊ฐ์ฒด ๊ฐ์ ํ๋ ฅ์ ๊ตฌํํ ํ๋ก๊ทธ๋จ

- ์ ๋ณด ์๋ ์์  ์ง์  ์ฝ๋ฉํด๋ณด๊ธฐ(ExMyDate)
  - day, month, year ๋ณ์๋ private์ผ๋ก ์ ์ธ
  - ๊ฐ ๋ณ์์ getter, setter๋ฅผ public ์ผ๋ก ๊ตฌํ
  - ExMyDate(int day, int month, int year) ์์ฑ์ ๋ง๋ค๊ธฐ
  - public boolean isValid() ๋ฉ์๋๋ฅผ ๋ง๋ค์ด ๋ ์ง๊ฐ ์ ํจํ์ง ํ์ธ
  - ExMyDateTest ํด๋์ค์์ ์์ฑํ ExMyDate ๋ ์ง๊ฐ ์ ํจํ์ง ํ์ธ

<br>

- ๋ชจ๋  ๋ฉค๋ฒ ๋ณ์๋ฅผ private๋ก ์ค์ (boolean ๊น์ง)

- ์ด ๋, `isValid = true` ์ค์ 

- setYear, ์ฐ๋ ์ค์  ์ ์ ์ ์ฐ๋์ธ์ง ๊ตฌ๋ถํ๊ธฐ ์ํด `Calendar` import ํ getInstance() ๋ฉ์๋ ์ฌ์ฉ

- setMonth, 1 ~ 12๊ฐ์ ์ ์ ๋ฒ์๋ฅผ ๋ฒ์ด๋ ๊ฐ์ ๋ํ์ฌ `isValid = false`์ค์ 

- setDay, switch ๋ฌธ์ผ๋ก 30์ผ, 31์ผ ์๋ ๋ฌ์ ๊ตฌ๋ถํ๊ณ , ์ค๋์ ๊ตฌ๋ถํ๊ธฐ ์ํด ์กฐ๊ฑด๋ฌธ ์ค์ 

- showDate ๋ฉ์๋๋ก `isValid = true`์ `isValid = false`๋ก ๊ฐ ํค๋นํ๋ ๊ตฌ๋ฌธ ์ถ๋ ฅ ๊ฐ๋ฅํ ๋ก ๊ตฌํ

- Menu ํด๋์ค์ `public static final int STARLATTE = 4500;`์์ `static fianal`์ ์ถ๊ฐํ๋ ์ค๋ฅ๊ฐ ์ ์ ๋จ

- `static final` => ํด๋์ค ๋ด๋ถ ๋๋ ์ธ๋ถ์์ ์ฐธ์กฐ์ ์ฉ๋๋ก๋ง ์ ์ธ๋ ๋ณ์๋ ์ด ๊ฐ์ด ์ ์ธ

<br>

- static, final, static final ์ ๋ฆฌ

- `static` => ๊ฐ์ฒด ์์ฑ ์์ด ์ฌ์ฉํ  ์ ์๋ ํ๋์ ๋ฉ์๋๋ฅผ ์์ฑํ๊ณ ์ ํ  ๋ ํ์ฉ

- `final`=> ํด๋น ๋ณ์๋ ๊ฐ์ด ์ ์ฅ๋๋ฉด ์ต์ข ๊ฐ์ด ๋๋ฏ๋ก, ์์ ์ด ๋ถ๊ฐ๋ฅํ๋ค๋ ์๋ฏธ

- `static final`=> ๋ชจ๋  ์์ญ์์ ๊ณ ์ ๋ ๊ฐ์ผ๋ก ์ฌ์ฉ๋๋ ์์

<br>

## ๐ Eclipse ์ค์ต

![day8](https://user-images.githubusercontent.com/79084294/182657244-9c971bf4-1265-418a-b2e7-92ccddb85eaf.png)

<br>

## ๐ Eclipse ์ถ๋ ฅ Console

![day8_console1](https://user-images.githubusercontent.com/79084294/182657334-8b3cfeee-24c1-42a0-822c-41d3e369a861.png)

![day8_console2](https://user-images.githubusercontent.com/79084294/182657351-cfa818f1-7ce0-48e1-9a8b-8582b7f31155.png)

![day8_console3](https://user-images.githubusercontent.com/79084294/182657734-f39f5a4b-ecf9-4f93-9084-28c0ea509337.png)

![day8_console4](https://user-images.githubusercontent.com/79084294/182657380-bd88b53a-189e-45f3-9d2e-dc51c6d2718a.png)
