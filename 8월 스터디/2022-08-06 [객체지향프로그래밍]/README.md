# ๐ Java Study

## ๐ธ 2022-08-06 ํ ์์ผ

## [๋ฐฐ์ด๊ณผ ArrayList]

### 1. ๋ฐฐ์ด์ด๋

<br>

- ๋์ผํ ์๋ฃํ์ ์์ฐจ์  ์๋ฃ ๊ตฌ์กฐ

- ๋ฐฐ์ด ์ ์ธํ๊ธฐ

```java
    int[] arr = new int[10];
    int arr[] = new int[10];
```

- ๋ฉ๋ชจ๋ฆฌ ๊ตฌ์กฐ => `int`๋ 4๋ฐ์ดํธ, ๋ฐฐ์ด์ ๊ธธ์ด๋ฅผ 10์ผ๋ก ์ค์ 

- 0 ๋ฒ์งธ ํ ๊ณต๊ฐ์ 4๋ฐ์ดํธ ์์ผ๋ก ๋ฐฐ์ด์ ๊ธธ์ด๊ฐ 10์ด๋ฏ๋ก ์ด 40๋ฐ์ดํธ

- ์ธ๋ฑ์ค ๋ฒํธ๋ 0๋ถํฐ ์์ํ์ฌ 0 ~ 9 ์ ๋ฒ์๋ฅผ ๊ฐ์

- `์ฐ์๋ ์๋ฃ๊ตฌ์กฐ`, ์ค๊ฐ์ ๊ฐ์ด ๋น์ด์์ผ๋ฉด ์ ๋จ

- ์ฒจ์ ์ฐ์ฐ์ด ๋น ๋ฅด๋ค(์ธ๋ฑ์ค ๋ฒํธ ํ์ฉ์ผ๋ก ๊ฐ ๊ณ์ฐ)

<br>

```java
    public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int total = 0;

		for(int i=0, num=1; i < arr.length; i++, num++) {
			arr[i] = num;
		}

		for(int i=0; i < arr.length; i++) {
			total += arr[i];
			System.out.println(total);
		}

		System.out.println(total);
	}
```

- for ๋ฌธ ์์ ์กฐ๊ฑด์์ผ๋ก ์ซ์(i < 10)๋ณด๋จ ๋ฐฐ์ด์ ๊ธธ์ด `arr.length`์ฒ๋ผ ํํํ๋๊ฒ ์ข์

- `i <= 9`์ฒ๋ผ ํํํ์ง ์๋ ์ด์ ๋ `i < 10`์ผ๋ก ํ์ฌ๊ธ ๋ฐฐ์ด์ ๊ธธ์ด๋ฅผ ์ง์์ผ ํ  ์ ์์

<br>

```java
    double[] dArr = new double[5];

	int count = 0;

	dArr[0] = 1.1; count++;
	dArr[1] = 2.1; count++;
	dArr[2] = 3.1; count++;

	double mtotal = 1;
	for( int i = 0; i < count; i++) {
		mtotal *= dArr[i];
	}

	System.out.println(mtotal);
```

- ๋ฐฐ์ด์ ๊ธธ์ด๊ฐ 5๊ฐ, 3๊ฐ์ ์ ํจ๊ฐ์ด ์๋ค๋ฉด ๋๋จธ์ง๋ 0.0 ์ผ๋ก ์ด๊ธฐํ

- ๋ฐ๋ผ์ for ๋ฌธ ์กฐ๊ฑด์์ `i < dArr.length` ์ผ๋ก ์ค์ ํ๋ฉด ๊ฒฐ๊ณผ๊ฐ 0์ผ๋ก ๋์ค๋ ์ค๋ฅ ๋ฐ์

- ๋ฐ๋ผ์ count ๋ณ์๋ฅผ ๋ง๋ค์ด ์ ํจํ ๊ฐ์ ๋ํ ๊ฒ๋ง ๊ณฑ ์ฐ์ฐ์ ํ  ์ ์๋๋ก ํจ

<br>

### 2. ๋ฐฐ์ด ๋ฌธ์  : ๋ฌธ์ ๋ฐฐ์ด์ ์์ฑํ๊ณ  ์ถ๋ ฅ

### ๋๋ฌธ์๋ฅผ A - Z ๊น์ง ๋ฐฐ์ด์ ์ ์ฅํ๊ณ  ์ด๋ฅผ ๋ค์ ์ถ๋ ฅํ๋ ํ๋ก๊ทธ๋จ ์ถ๋ ฅ

<br>

```java
    char[] alphabets = new char[26];
		char ch = 'A';

		for(int i = 0; i < alphabets.length; i++) {

			alphabets[i] = ch++;
		}

		for(int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int) alphabets[i] );
		}
```

- ์ํ๋ฒณ A ๋ถํฐ Z ๊น์ง ์ถ๋ ฅ, 26 ๋ฌธ์์ด ๋ฐฐ์ด ๊ณต๊ฐ ์์ฑ

- ์ถ๋ ฅ์ ๊ฐ 26 ๊ฐ์ ์ํ๋ฒณ๊ณผ, ๊ฐ ํด๋น ๋ฌธ์ ์์คํค ์ฝ๋์ ๊ฐ์ด ์ถ๋ ฅ

<br>

## ๐ Eclipse ์ค์ต

![day11](https://user-images.githubusercontent.com/79084294/183284410-26bc20c3-040f-4466-94f9-e16029637476.png)

<br>

## ๐ Eclipse ์ถ๋ ฅ Console

![day11_console1](https://user-images.githubusercontent.com/79084294/183284413-87918fe9-3e6a-4053-b497-32905c303733.png)

![day11_console2](https://user-images.githubusercontent.com/79084294/183284416-2d0d3bec-e27f-4db5-8803-f4cf4117da25.png)
