# ๐ Java Study

## ๐ธ 2022-08-05 ๊ธ์์ผ

## [ํด๋์ค์ ๊ฐ์ฒด]

### 1. static & singleton ์ฝ๋ฉ ์์ 

<br>

- `static`๊ณผ `singleton pattern`

- ๋ฌธ์  : ์นด๋ ํ์ฌ๊ฐ ์๋ค. ์นด๋ ํ์ฌ๋ ์ ์ผํ ๊ฐ์ฒด์ด๊ณ , ์ด ํ์ฌ์์๋ ์นด๋๋ฅผ ๋ฐ๊ธํ๋ฉด ํญ์ ๊ณ ์ ๋ฒํธ๊ฐ ์๋์ผ๋ก ์์ฑ๋๋ค. 10001๋ถํฐ ์์ํ์ฌ ์นด๋๊ฐ ์์ฑ๋  ๋๋ง๋ค 10002, 10003 ์์ผ๋ก ์ฆ๊ฐ๋๋ค. ๋ค์ ์ฝ๋๊ฐ ์ํ ๋๋๋ก Card ํด๋์ค์ CardCompany ํด๋์ค๋ฅผ ๊ตฌํํ๋ผ.

```java
  public class CardCompanyTest {

    public static void main(String[] args) {

      CardCompany company = CardCompany.getInstance();    // ์ฑ๊ธํค ํจํด

      Card myCard = company.createCard();   // ๋ฉ์๋์์ Car ์์ฑ
      Card yourCard = compapny.createCard();

      System.out.println(myCard.getCardNumber());   // 10001 ์ถ๋ ฅ
      System.out.println(yourCard.getCardNumber()); // 10002 ์ถ๋ ฅ

    }
  }
```

<br>

- Card ํด๋์ค

```java
  package card;

  public class Card {

	private int cardNumber;
	private static int serialNum = 10000;

	Card() {
		serialNum++;
		cardNumber = serialNum;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

}
```

- Card ํด๋์ค์ `cardNumber ๋ณ์`๋ฅผ `private`๋ก int ํ์ ์์ฑ => ์ธ๋ถ์์ ํจ๋ถ๋ก ๋ฐ๊พธ์ง ๋ชปํจ

- ๊ณ ์  ๋ฒํธ๊ฐ 10001 ๋ถํฐ ์์ํด์ผ ํ๋ ๊ธฐ๋ณธ `serialNum = 10000` ์ผ๋ก `static` ์ค์ 

- Card ๋ฉ์๋๋ฅผ ํธ์ถํ  ๋๋ง๋ค ๊ณ ์ ๋ฒํธ serialNum์ ๊ฐ์ ์ฆ๊ฐ์ํค๊ณ , ์ฆ๊ฐ๋ ๊ฐ์ด ์นด๋ ๋ฒํธ(์ ์ง)

- `cardNumber ๋ณ์`์ getter, setter ์ถ๊ฐ

<br>

- CardCompany ํด๋์ค

```java
  package card;

  public class CardCompany {

	private static CardCompany instance = new CardCompany();

	private CardCompany() {}

	public static CardCompany getInstance() {
		if(instance == null)
			instance = new CardCompany();

		return instance;
	}

	public Card createCard() {
		Card card = new Card();

		return card;
	}

}
```

- `์นด๋ ํ์ฌ`๊ฐ `์ ์ผํ ์ธ์คํด์ค`

- ํจ๋ถ๋ก ๋ณ๊ฒฝ์ด ๋๋ฉด ์๋๋ฏ๋ก `private` ์ค์ 

- ๋จ ํ๋์ ๊ฐ์ ๊ฐ์ ธ์ผ ํ๋ฏ๋ก `static`

- `private CardCompany() {}` => `private` ์ด๋ฏ๋ก ํด๋น ํด๋์ค์์๋ง ์์ฑ ๊ฐ๋ฅ

- ๊ฐ์ฒด๋ฅผ ์์ฑํ์ง ์๊ณ , ํด๋น ์ธ์คํด์ค๋ฅผ ํธ์ถํ๊ธฐ ์ํด `static` ์ผ๋ก `CardCompany getInstance` ์ ์ธ

- `Card createCard()` => ์นด๋ ํ์ฌ์์ ์นด๋ ๋ฐ๊ธ, Card ์์ฑ

<br>

## ๐ Eclipse ์ค์ต

![day10](https://user-images.githubusercontent.com/79084294/183197796-49d5b0f2-2136-4162-a5f5-d6232b87b6df.png)

<br>

## ๐ Eclipse ์ถ๋ ฅ Console

![day10_console](https://user-images.githubusercontent.com/79084294/183197932-cae6021a-498a-4b72-baa4-127f4d63bd02.png)
