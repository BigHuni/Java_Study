# ๐ Java Study

## ๐ธ 2022-07-30 ํ ์์ผ

## [ํด๋์ค์ ๊ฐ์ฒด ์์ ]

### 1. ๋ค์ ๊ฐ์ฒด์ ๋ํ ์ค๋ช์ ๋ง๋ ํด๋์ค๋ฅผ ๋ง๋ค๊ณ  ๊ฐ์ ์ถ๋ ฅ

- ๋์ด๊ฐ 40์ด, ์ด๋ฆ์ด Davis ๋ผ๋ ๋จ์๊ฐ ์์ต๋๋ค. ์ด ๋จ์๋ ๊ฒฐํผ์ ํ๊ณ , ์์์ด ์ ์์ต๋๋ค.

<br>

- ์ถ๋ ฅ ๊ฒฐ๊ณผ

```
    ๋์ด : 40
    ์ด๋ฆ : Davis
    ๊ฒฐํผ์ฌ๋ถ : true
    ์๋ ์ : 3
```

<br>

## ๐ 1๋ฒ ์์  ์ฝ๋

<br>

- Person ํด๋์ค

```java
    package classpart;

    public class Person {
    	int age;
    	String name;
    	Boolean isMarried;
    	int numberOfChildren;

    }
```

<br>

- PersonTest ํด๋์ค(main ํจ์ ํฌํจ)

```java
    package classpart;

    public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person();
		person.age = 40;
		person.name = "Davis";
		person.isMarried = true;
		person.numberOfChildren = 3;

		System.out.println("๋์ด : " + person.age);
		System.out.println("์ด๋ฆ : " + person.name);
		System.out.println("๊ฒฐํผ์ฌ๋ถ : " + person.isMarried);
		System.out.println("์๋ ์ : " + person.numberOfChildren);
	}
}
```

<br>

- Eclipse Console ์ถ๋ ฅ

![1แแฅแซ แแงแฏแแช](https://user-images.githubusercontent.com/79084294/181904052-d85857a0-cb44-424c-a627-dac5ead5cd17.png)

<br>

### 2. ๋ค์ ๊ฐ์ฒด์ ๋ํ ์ค๋ช์ ๋ง๋ ํด๋์ค๋ฅผ ๋ง๋ค๊ณ  ๊ฐ์ ์ถ๋ ฅ

- ์ผํ๋ชฐ์ ์ฃผ๋ฌธ์ด ๋ค์ด์์ต๋๋ค. ์ฃผ๋ฌธ ๋ด์ฉ ๊ฒฐ๊ณผ๋ฅผ ์ถ๋ ฅํ์์ค.

<br>

- ์ถ๋ ฅ ๊ฒฐ๊ณผ

```
    ์ฃผ๋ฌธ๋ฒํธ : 2022073001
    ์ฃผ๋ฌธ์ ์์ด๋ : abc123
    ์ฃผ๋ฌธ ๋ ์ง : 2022๋ 7์ 30์ผ
    ์ฃผ๋ฌธ์ ์ด๋ฆ : ํ๋ํ
    ์ฃผ๋ฌธ ์ํ ๋ฒํธ : PD0327-12
    ๋ฐฐ์ก ์ฃผ์ : ๊ฒฝ๊ธฐ๋ ์ฉ์ธ์ ์ฒ์ธ๊ตฌ ํฌ๊ณก์ ์๋ฒ๋๋๋ก 199
```

<br>

## ๐ 2๋ฒ ์์  ์ฝ๋

<br>

- ShopOrder ํด๋์ค

```java
    package classpart;

    public class ShopOrder {
	int orderNumber;
	String orderId;
	String orderDate;
	String orderName;
	String orderGoodsNum;
	String orderAddress;

}
```

<br>

- ShopOrderTest ํด๋์ค(main ํจ์ ํฌํจ)

```java
    package classpart;

    public class ShopOrderTest {

	public static void main(String[] args) {

		ShopOrder shoporder = new ShopOrder();
		shoporder.orderNumber = 2022073001;
		shoporder.orderId = "abc123";
		shoporder.orderDate = "2022๋ 7์ 30์ผ";
		shoporder.orderName = "ํ๋ํ";
		shoporder.orderGoodsNum = "PD0327-12";
		shoporder.orderAddress = "๊ฒฝ๊ธฐ๋ ์ฉ์ธ์ ์ฒ์ธ๊ตฌ ํฌ๊ณก์ ์๋ฒ๋๋๋ก 199";

		System.out.println("์ฃผ๋ฌธ๋ฒํธ : " + shoporder.orderNumber);
		System.out.println("์ฃผ๋ฌธ์ ์์ด๋ : " + shoporder.orderId);
		System.out.println("์ฃผ๋ฌธ ๋ ์ง : " + shoporder.orderDate);
		System.out.println("์ฃผ๋ฌธ์ ์ด๋ฆ : " + shoporder.orderName);
		System.out.println("์ฃผ๋ฌธ ์ํ ๋ฒํธ : " + shoporder.orderGoodsNum);
		System.out.println("๋ฐฐ์ก ์ฃผ์ : " + shoporder.orderAddress);
	}

}
```

<br>

- Eclipse Console ์ถ๋ ฅ

![2แแฅแซ แแงแฏแแช](https://user-images.githubusercontent.com/79084294/181904065-2bc09f10-adde-4ab4-8543-b6ec99174b5a.png)
