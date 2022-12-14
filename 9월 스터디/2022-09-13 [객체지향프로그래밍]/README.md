## ๐ธ 2022-09-13 ํ์์ผ

## [๊ฐ์ฒด์งํฅํ๋ก๊ทธ๋๋ฐ]

### 1. String, Wrapper ํด๋์ค

- String ํด๋์ค ์ ์ธํ๊ธฐ
    - 1๋ฒ, `String str1 = new String("abc");` => ์ธ์คํด์ค๋ก ์์ฑ๋จ
    - 2๋ฒ, `String str2 = "abc";` => ์์ํ์ ์๋ ๋ฌธ์์ด์ ๊ฐ๋ฆฌํด
    - 1๋ฒ์ `new` ํค์๋๋ฅผ ์ฌ์ฉํ๋ค๋ ๊ฒ์ ํ ๋ฉ๋ชจ๋ฆฌ์ `Allocation`์ ๋ฐ๊ฒ ๋ค๋ ์๋ฏธ
    - 2๋ฒ์ ์์ํ์ ๋ฌธ์์ด์ด ์๋ค๋ฉด, new ์ฌ์ฉํ์ง ์๊ณ , ๋ฐ๋ก ์ฌ์ฉ ๊ฐ๋ฅ(์์ํ ๊ณต์ )

<br>

```
    // 1๋ฒ Test
    String str1=new String("abc");
    String str2=new String("abc");

    System.out.println(str1==str2);
    
    // 2๋ฒ Test
    String str3 = "abc";
    String str4 = "abc";
		
    System.out.println(str3 == str4);
```

- [1๋ฒ Test] : ๋ฉ๋ชจ๋ฆฌ ์์น๊ฐ ๋ค๋ฅด๊ธฐ ๋๋ฌธ์ `false`
- [2๋ฒ Test] : ์์ ํ์์ ๊ฐ์ ธ์๊ธฐ ๋๋ฌธ์ `true`

<br>

- String์ immutable
    - ํ ๋ฒ ์ ์ธ๋๊ฑฐ๋ ์์ฑ๋ ๋ฌธ์์ด์ ๋ณ๊ฒฝํ  ์ ์์
    - String ํด๋์ค์ concat() ๋ฉ์๋ ํน์ "+"๋ฅผ ์ด์ฉํ์ฌ String์ ์ฐ๊ฒฐํ๋ ๊ฒฝ์ฐ ๋ฌธ์์ด์ ์๋ก ์์ฑ๋จ
    - javaStr๋ก "java", androidStr๋ก "android"๋ฅผ ์์ฑํ์ฌ ์ ๋ฐฉ์์ผ๋ก ๋ถ์ฌ์ "javaandroid"
    - "javaandroid"์ด ๋์ผ๋ก๋ ๊ทธ์  ๋ถ์ธ ๊ฒ์ผ๋ก ๋ณด์ด์ง๋ง, ์ค์  ์๋ก์ด ๋ฉ๋ชจ๋ฆฌ๊ฐ ์์ฑ
    - ํ ๋ฒ ์์ฑ๋ String์ ๋ถ๋ณํ๊ธฐ ๋๋ฌธ์ String์ ๊ณ์ ์์ฑํ  ๋๋ง๋ค ์๋ก์ด ๋ฉ๋ชจ๋ฆฌ์ ํ ๋น

<br>

```
    String java = new String("java");
	String android = new String("android");
		
	java = java.concat(android);
		
	System.out.println(java);    // javaandroid
```

- ์ถ๋ ฅ์ `javaandroid`๋ผ๊ณ  ๋์ค์ง๋ง, ์ค์  ๋ฉ๋ชจ๋ฆฌ๋ ์ด๋ป๊ฒ ๋๋์ง ํ์ธํด๋ณด๊ธฐ
- hashCode ๊ฐ์ผ๋ก๋ ํ์ธํ  ์ ์์ => hashCode๋ String์์ Override ํ๊ธฐ ๋๋ฌธ

```
    String java = new String("java");
	String android = new String("android");
	System.out.println(System.identityHashCode(java));  // 205962452
		
	java = java.concat(android);
		
	System.out.println(java);
	System.out.println(System.identityHashCode(java));  // 1032986144

```

- ์๋ก ๋ฉ๋ชจ๋ฆฌ ์ ์ฃผ์๊ฐ ๋ค๋ฆ
- ๋ฐ๋ผ์ ์ฐ๊ฒฐ์ด ๋๋ฉด ์๋ก์ด ๋ฉ๋ชจ๋ฆฌ๋ฅผ ๊ฐ๋ฆฌํด
- ๊ณ ๋ก String์ ๊ณ์ ์ฐ๊ฒทํด์ ์ฌ์ฉํ  ์ผ์ด ์๋ค๋ฉด, `StringBuider`์ `StringBuffer`๋ฅผ ์ฌ์ฉํ๋ฉด ๋จ
- `StringBuffer` ํด๋์ค๋ฅผ ์ดํด๋ณด๋ฉด, ์์ `AbstractStringBuilder`๋ฅผ ๊ฐ๋ณด๋ฉด `value`๊ฐ `String`์์๋ `final`์ด์์
- ํ์ง๋ง, ์ฌ๊ธฐ์๋ `final`์ด ์๋๊ณ , ๊ฐ๋ณ์ ์ธ ๋ฐฐ์ด์ ๊ฐ๊ฒ ๋จ
- ๋ฐ๋ผ์ ์ฐ๊ฒฐํ๋ค๊ณ  ํด์ ๊ณ์ ๋ฉ๋ชจ๋ฆฌ๋ฅผ ์ฌ์ฉํ๋ ๊ฒ์ด ์๋๋ผ ์๋ก์ด ์ฐ๊ฒฐ์ ํ๊ฒ ๋จ
- `StringBuider`์ `StringBuffer`์ ๊ฐ์ฅ ํฐ ์ฐจ์ด์ ์ `StringBuilder`๋ ๋ฉํฐ ์ฐ๋ ๋ ํ๊ฒฝ์์ ๋๊ธฐํ๋ฅผ ์ง์ํ์ง ์์
- `StringBuffer`์ ๋ฉํฐ ์ฐ๋ ๋ ํ๊ฒฝ์์ ๋๊ธฐํ๋ฅผ ์ง์ ๊ฐ๋ฅ

<br>

- `StringBuider`์ `StringBuffer`
    - ๊ฐ๋ณ์ ์ธ char[] ๋ฐฐ์ด์ ๋ฉค๋ฒ ๋ณ์๋ผ ๊ฐ์ง๊ณ  ์๋ ํด๋์ค
    - ๋ฌธ์์ด์ ๋ณ๊ฒฝํ๊ฑฐ๋ ์ฐ๊ฒฐํ๋ ๊ฒฝ์ฐ ์ฌ์ฉํ๋ฉด ํธ๋ฆฌํ ํด๋์ค
    - `StringBuffer`๋ ๋ฉํฐ ์ฐ๋ ๋ ํ๋ก๊ทธ๋๋ฐ์์ ๋๊ธฐํ(Synchronization)์ด ๋ณด์ฅ๋จ
    - ๋จ์ผ ์ฐ๋ ๋ ํ๋ก๊ทธ๋๋ฐ์์๋ `StringBuilder`๋ฅผ ์ฌ์ฉํ๋ ๊ฒ์ด ๋ ์ข์
    - toString()๋ฉ์๋๋ก String ๋ฐํ

<br>

```
    String java = new String("java");
	String android = new String("android");
		
	StringBuilder buffer = new StringBuilder(java);
	System.out.println(System.identityHashCode(buffer));       // 205962452
	
	buffer.append("android");
	System.out.println(System.identityHashCode(buffer));       // 205962452
		
	java = buffer.toString();
```

- `StringBuilder buffer = new StringBuilder(java);` => java์ String ๊ธฐ๋ฐ์ผ๋ก StringBuilder๊ฐ ์๊น
- ๋ ์ถ๋ ฅ์ผ๋ก ๋ฉ๋ชจ๋ฆฌ ๊ฐ์ด `205962452`๋ก ๋์ผํจ
- ์ด๋ ๋ถ๋ณ์ด ์๋๊ณ , append, insert, reverse ๋ฑ ๋ณ๋์ด ์์ ๋ค ๋์ค์ ํ์ํ๋ค๋ฉด toString() ํ์ฌ ๋ค์ String ๊ฐ์ ์ป์ด์ค๊ฒ ๋จ

<br>

- Wrapper ํด๋์ค

| ๊ธฐ๋ณธํ       | Wrapper ํด๋์ค |
|:----------|:------------|
| `boolean` | Boolean     |
| `byte`    | Byte        |
| `char`    | Character   |
| `short`   | Short       |
| `int`     | Integer     |
| `long`    | Long        |
| `float`   | Float       |
| `double`  | Double      |

<br>

## ๐ Eclipse ์ค์ต

![String_list](https://user-images.githubusercontent.com/79084294/189909378-1129eef9-91b3-4ccf-aeaf-c27e9302f701.png)

<br>

## ๐ Eclipse ์ถ๋ ฅ Console

![String_console1](https://user-images.githubusercontent.com/79084294/189909364-6f3b34a3-03b7-4fa5-a3f3-0de867f7306b.png)

![String_console2](https://user-images.githubusercontent.com/79084294/189909371-9a055fa1-43cc-43dd-aa80-9b1b2580c687.png)

![String_console3](https://user-images.githubusercontent.com/79084294/189909375-6ffbd512-efa4-4f67-884f-80a34795c7ee.png)
