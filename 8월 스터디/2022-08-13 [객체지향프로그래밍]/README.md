# ๐ Java Study

## ๐ธ 2022-08-13 ํ ์์ผ

## [์์๊ณผ ๋คํ์ฑ]

### 1. 1๋ฒ ๋ฌธ์ ํ๊ธฐ(์ง์  ์ฝ๋ฉ)

- ๋ฌธ์  : ์ผ๋ฐ ๊ณ ๊ฐ๊ณผ VIP ๊ณ ๊ฐ์ ์ค๊ฐ ๋ฑ๊ธ ๋ง๋ค๊ธฐ, ๊ณ ๊ฐ์ด ๋์ด VIP ๊ณ ๊ฐ๋งํผ ๋ฌผ๊ฑด์ ๋ง์ด ๊ตฌ์ํ์ง ์์ง๋ง, ๋จ๊ณจ์ธ ๋ถ๋ค์ GOLD ๋ฑ๊ธ์ผ๋ก ๊ด๋ฆฌํ๊ณ  ์ถ๋ค. ํํ์ ๋ค์๊ณผ ๊ฐ๋ค.

  - ์ ํ์ ์ด ๋๋ ํญ์ 10%๋ฅผ ํ ์ธ

  - ๋ณด๋์ค ํฌ์ธํธ๋ 2%๋ฅผ ์ ๋ฆฝ

  - ๋ด๋น ์ ๋ฌธ ์๋ด์์ ์์

- Customer ํด๋์ค์์ ์์์ ๋ฐ์ GoldCustomer๋ฅผ ๊ตฌํํด๋ณด๊ธฐ

<br>

- Customer ํด๋์ค

```java
  package witharraylist;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	public Customer() {
		initCustomer();
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;

		initCustomer();
	}

	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + " ๋์ ๋ฑ๊ธ์ " + customerGrade + "์ด๋ฉฐ, ๋ณด๋์ค ํฌ์ธํธ๋ " + bonusPoint + "์๋๋ค.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
```

- GoldCustomer ํด๋์ค

```java
  package witharraylist;

public class GoldCustomer extends Customer{

	double saleRatio;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;

	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
```

- VIPCustomer ํด๋์ค

```java
  package witharraylist;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ๋ด๋น ์๋ด์ ๋ฒํธ๋ " + agentID + "์๋๋ค.";
	}

	public int getAgentID() {
		return agentID;
	}
}
```

<br>

### 2. 2๋ฒ ๋ฌธ์ ํ๊ธฐ(์ง์  ์ฝ๋ฉ)

- ๋ฌธ์  : ๋ฐฐ์ด์ ํ์ฉํ์ฌ ๊ตฌํํ๊ธฐ, ๊ณ ๊ฐ์ ํ์ฌ 5๋ช, VIP 1๋ช, GOLD 2๋ช, SILVER 2๋ช์ผ ๋, ๊ฐ ๊ณ ๊ฐ์ด 10,000์ ์ง๋ฆฌ ์ ํ์ ๊ตฌ๋งคํ ๊ฒฝ์ฐ ์ง๋ถํ ๊ธ์ก๊ณผ ์ ๋ฆฝ๋ ๋ณด๋์ค ํฌ์ธํธ๋ฅผ ์ถ๋ ฅ

  - ArrayList ํ์ฉํ์ฌ ๊ตฌํ

<br>

- CustomerTest ํด๋์ค

```java
  package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customerYoo = new VIPCustomer(10010, "์ ์ฌ์", 12345);
		Customer customerPark = new GoldCustomer(10020, "๋ฐ๋ช์");
		Customer customerJeong = new GoldCustomer(10030, "์ ์คํ");
		Customer customerHa = new Customer(10040, "ํ๋ํ");
		Customer customerNo = new Customer(10050, "๋ธํ์ฒ ");

		customerList.add(customerYoo);
		customerList.add(customerPark);
		customerList.add(customerJeong);
		customerList.add(customerHa);
		customerList.add(customerNo);

		System.out.println("====== ๊ณ ๊ฐ์ ๋ณด ์ถ๋ ฅ ======");

		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}

		System.out.println("====== ํ ์ธ์จ๊ณผ ๋ณด๋์ค ํฌ์ธํธ ๊ณ์ฐ ======");

		int price = 10000;

		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);

			System.out.println(customer.getCustomerName() + " ๋์ด " + cost + " ์์ ์ง๋ถํ์จ์ต๋๋ค.");
			System.out.println(customer.getCustomerName() + " ๋์ ํ์ฌ ๋ณด๋์ค ํฌ์ธํธ๋  " + customer.bonusPoint + " ์ ์๋๋ค.");
		}
	}
}
```

<br>

## ๐ Eclipse ์ค์ต

![day18](https://user-images.githubusercontent.com/79084294/184533909-c4005f6a-f191-45a5-a9d0-1403d983bca7.png)

<br>

## ๐ Eclipse ์ถ๋ ฅ Console

![day18_console1](https://user-images.githubusercontent.com/79084294/184533911-a6d25dcc-f0ee-4dd1-818a-582a2b2a8d98.png)
