# π Java Study

## πΈ 2022-08-24 μμμΌ

## [μΈν°νμ΄μ€ μμ©]

### 1. μΈν°νμ΄μ€ μμ©

```
    default void description() {
        System.out.println("μ μ κ³μ°κΈ°λ₯Ό κ΅¬νν©λλ€.");
        }
```

```
    @Override
	public void description() {
		System.out.println("μ¬μ μ ν description");
	}
```

- ν ν΄λμ€μ description() λ©μλλ₯Ό κ΅¬ννκ³ , λ€λ₯Έ ν΄λμ€μμ μ€λ²λΌμ΄λ ν μ¦, μ¬μ μ ν description() λ©μλ κ΅¬ν
- `calc.description();` μ°μ΄λ³΄λ©΄, `μ¬μ μ ν description`μ΄ μΆλ ₯

<br>

- μΈμ€ν΄μ€ μμ±κ³Ό μκ΄μμ΄ staticμΌλ‘ int totalμ μ μΈν΄λμΌλ©΄, μΈν°νμ΄μ€ νμμΌλ‘ λ°λ‘ κ°μ Έλ€ μ¬μ©κ°λ₯
- `int[] arr = {1, 2, 3, 4, 5};`
- `int sum = Calc.total(arr);`

<br>

- `private static void mystaticMethod() {}`λΌκ³  μ μΈνλ©΄, static λ©μλμμ νΈμΆν  μ μμ
- static λ©μλμμ μΌλ° λ©μλλ₯Ό νΈμΆν  μ μμ(λΆκ°λ₯)
- κ·Έλ₯ μΌλ° λ©μλ(private void ~)λ μΈμ€ν΄μ€ μμ±μ νμ§ μκ³ , νΈμΆνλ λ©μλμ΄κΈ° λλ¬Έ
- private λ©μλ λΆλΆμ μλ° 9 λ²μ  μ΄μλΆν° μ§μ

<br>

```java
    package interfaceex;

public class Customer implements Buy, Sell {

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }

    public void sayHello() {
        System.out.println("hello");
    }
}
```

- Customer ν΄λμ€μμ sell(), buy() λ©μλ κ΅¬ν
- κ° Buy, Sell ν΄λμ€μ order()κ° duplicate(μ€λ³΅)νκ³  μμΌλ Customer ν΄λμ€μμ order() μ¬μ μ

<br>

```java
    package interfaceex;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.sayHello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();
    }
}
```

- `Buy buyer = customer;` ν λ³νλλ©΄, buyerκ° νΈμΆν  μ μλ κ²μ buy()λ§ κ°λ₯
- `Sell seller = customer` ν λ³νλλ©΄, sellerκ° νΈμΆν  μ μλ κ²μ sell()λ§ κ°λ₯
- κ° buyerμ sellerλ κ° order()λ₯Ό νΈμΆν  μ μλλ°, `λ€νμ±`μΌλ‘ μΈν΄ μ¬κΈ°μ νΈμΆλλ order()λ μλ¨μ `customer customer = new Customer();` μΈμ€ν΄μ€μ
  order μ΄λ€.
- `λ€μ΄ μΊμ€ν`λ κ°λ₯

```
    if(seller instanceof Customer) {}
```

- μ μ‘°κ±΄λ¬Έμ΄ trueμ΄λ©΄, λ€μ Customerλ‘ ν λ³ν κ°λ₯

<br>

## π Eclipse μ€μ΅

![day25](https://user-images.githubusercontent.com/79084294/186693423-ef9e01b9-43d3-4d30-9f33-b9d8d3f044a2.png)

<br>

## π Eclipse μΆλ ₯ Console

![day25_console1](https://user-images.githubusercontent.com/79084294/186693434-0cbd941c-eab7-400a-9603-a04d50f02739.png)

![day25_console2](https://user-images.githubusercontent.com/79084294/186693439-93a3e6d6-1140-435e-aec8-318a59ebdf6d.png)
