## ๐ธ 2022-09-16 ๊ธ์์ผ

## [๊ฐ์ฒด์งํฅํ๋ก๊ทธ๋๋ฐ]

### 1. List ์ธํฐํ์ด์ค

- ํ๋์ ์๋ฃ๋ฅผ ์ํ ์ธํฐํ์ด์ค
- Collection ํ์ ์ธํฐํ์ด์ค
- ๊ฐ์ฒด๋ฅผ ์์์ ๋ฐ๋ผ ์ ์ฅํ๊ณ , ๊ด๋ฆฌํ๋๋ฐ ํ์ํ ๋ฉ์๋๊ฐ ์ ์ธ๋ ์ธํฐํ์ด์ค
- ๋ฐฐ์ด์ ๊ธฐ๋ฅ์ ๊ตฌํํ๊ธฐ ์ํ ๋ฉ์๋๊ฐ ์ ์ธ๋จ
- ArrayList, Vector, LinkedList

<br>

- ArrayList์ Vector
    - ๊ฐ์ฒด ๋ฐฐ์ด ํด๋์ค
    - `Vector`๋ ์๋ฐ 2๋ถํฐ ์ ๊ณต๋ ํด๋์ค
    - ์ผ๋ฐ์ ์ผ๋ก `ArrayList`๋ฅผ ๋ ๋ง์ด ์ฌ์ฉ
    - `Vector`๋ ๋ฉํฐ ์ฐ๋ ๋ ํ๋ก๊ทธ๋จ์์ `๋๊ธฐํ`๋ฅผ ์ง์
    - ๋๊ธฐํ(Synchronization) : ๋ ๊ฐ์ ์ฐ๋ ๋๊ฐ ๋์์ ํ๋์ ๋ฆฌ์์ค์ ์ ๊ทผํ  ๋ ์์๋ฅผ ๋ง์ถ์ด์ ๋ฐ์ดํฐ์ ์ค๋ฅ๊ฐ ๋ฐฉ์งํ์ง ์๋๋ก ํจ
    - capacity(๋ฐฐ์ด์ ์ฉ๋)์ size(๋ฐฐ์ด ์์ ์์ ๊ฐ์)๋ ๋ค๋ฅธ ์๋ฏธ์

<br>

- ArrayList์ LinkedList
    - ๋ ๋ค ์๋ฃ์ ์์ฐจ์  ๊ตฌ์กฐ๋ฅผ ๊ตฌํํ ํด๋์ค
    - ArrayList๋ ๋ฐฐ์ด์ ๊ตฌํํ ํด๋์ค๋ก ๋ผ๋ฆฌ์  ์์์ ๋ฌผ๋ฆฌ์  ์์๊ฐ ๋์ผํจ
    - LinkedList๋ ๋ผ๋ฆฌ์ ์ผ๋ก ์์ฐจ์ ์ธ ๊ตฌ์กฐ์ง๋ง, ๋ฌผ๋ฆฌ์ ์ผ๋ก๋ ์์ฐจ์ ์ด์ง ์์ ์ ์์
    - LinkedList ๊ตฌ์กฐ : `์๋ฃ(data)/๋ค์ ์์์ ์ฃผ์` => `์๋ฃ(data)/๋ค์ ์์์ ์ฃผ์` => `์๋ฃ(data)/๋ค์ ์์์ ์ฃผ์`...
    - LinkedList์์ ์๋ฃ์ ์ถ๊ฐ์ ์ญ์  ๋น์ฉ ํจ์จ์ 
    - ArrayList๋ ์กฐ๊ธ ๋ ๋นจ๋ฆฌ [i] ๋ฒ์งธ ์์ ๊ฒ์ ๊ฐ๋ฅ

<br>

- ArrayList์ ์ปค๋งจ๋ ์๋ ฅํ ์ํ์์ ๋๋ฅด๋ฉด ArrayList์ ํด๋์ค ์์ค๋ฅผ ํ์ธํ  ์ ์์
- ArrayList๋ AbstractList์ ์์์ ๋ฐ๊ณ  ์๊ณ , List ์ธํฐํ์ด์ค ๊ตฌํ๋จ
- `DEFAULT_CAPACITY = 10` => 10๊ฐ ์ฉ๋์ ๋ง๋ฌ
- ๋ด๋ถ์ ์ผ๋ก Object[]๋ก ๊ตฌ์ฑ๋จ, ํ์์ด ์์์ ๋ฐ๋
- ArrayList๋ฅผ ์ฌ์ฉ ์ Element๋ฅผ ์ง์ ํด์ ์ฌ์ฉํจ <E> => ์ ๋ค๋ฆญ ํ์์ผ๋ก ๊ตฌํ

<br>

- Vector์ ํด๋์ค ์์ค๋ฅผ ํ์ธ, ArrayList์ ๋น์ท
- Vector๋ ์์ `synchronized`๋ผ๋ ํค์๋๊ฐ ๋ฉ์๋์ ํฌํจ๋์ด ์์ => ๋์ค์ ๋ฉํฐ ์ฐ๋ ๋ ํ๊ฒฝ์์ ์ฌ์ฉํ๋ค๋ ์  ์์๋๊ธฐ
- `synchronized(๋๊ธฐํ)` => ์ญํ  : ๋๊ธฐํ, ์ฌ๋ฌ ๊ฐ์ ์ฐ๋ ๋๊ฐ ํ๊บผ๋ฒ์ ๋ฆฌ์์ค์ ์ ๊ทผํ  ๋, ์์๋ฅผ ๋ง์ถฐ์ฃผ๋ ๊ธฐ๋ฅ
- ๋๊ธฐํ ๊ธฐ๋ฅ์ ์ง์ํด์ฃผ๋ Vector๊ฐ ๋ ์ข์๋ณด์ด์ง๋ง, ๋จ์ผ ์ฐ๋ ๋ ํ๊ฒฝ์์ ๋๊ธฐํ๊ฐ ์ค๋ฒํค๋ ๋จ => ์ธ ์ผ์ด ์์

<br>

- LinkedListTest
    - Element String ์ถ๊ฐ
    - Collection์์ ์ ๊ณต๋๋ ๊ธฐ๋ณธ ๋ฉ์๋ ํ์ฉ => `myList.add("")`
    - ๋๋ถ๋ถ์ Collection์์ toString ์ ๊ณต
    - ๊ธฐ์ตํด์ผ ํ  ์  : ArrayList, LinkedList ๋ ๋ค List ์ธํฐํ์ด์ค๋ฅผ ๊ตฌํํ ๊ฒ์ด๊ณ , ๊ทธ ์ธ์ myList.size(), i++ ์กฐ๊ฑด์ผ๋ก ๋ช ๋ฒ์งธ ์ธ๋ฑ์ค๋ฅผ ๊ฐ์ ธ์ค๋
      ๊ฒ์ `myList.get(i)`
    - ๋์ค์ `set`์ ํ์ตํ  ๋, `set`์ get(i) ๋ฉ์๋๋ฅผ ์ฌ์ฉํ  ์ ์์, get(i) ๋ฉ์๋๋ `List์์๋ง` ์กด์ฌ
    - set์ Collection ์ธํฐํ์ด์ค์ด๊ธด ํ๋, ์ค๋ณต์ ํ์ฉํ์ง ์๊ณ , ๋ฐ์ดํฐ๋ฅผ ๊ด๋ฆฌํ๋ ์ญํ 
    - ์์ `List ์ธํฐํ์ด์ค`๋ ์์์ ๋ฐ๋ผ ๊ฐ์ฒด๋ฅผ ์ง์ , `set ์ธํฐํ์ด์ค`๋ ์์์ ๋ฐ๋ผ ๊ฐ์ฒด๋ฅผ ์ง์ ํ์ง ์์
    - `List ์ธํฐํ์ด์ค`๋ ์ค๋ณต์ ํ์ฉ, `set ์ธํฐํ์ด์ค`๋ ์ค๋ณต์ ํ์ฉํ์ง ์์

```java
  LinkedList<String> myList=new LinkedList<String>();

        myList.add("A");
        myList.add("B");
        myList.add("C");
        System.out.println(myList);         // [A, B, C]

        myList.add(1,"D");
        System.out.println(myList);         // [A, D, B, C]

        myList.removeLast();
        System.out.println(myList);         // [A, D, B]

        for(int i=0;i<myList.size();i++){
        String s=myList.get(i);
        System.out.println(s);
        }
```

<br>

## ๐ Eclipse ์ค์ต

![Linked_list](https://user-images.githubusercontent.com/79084294/190658665-240c07b0-c486-4809-b3a2-fb5634a94d47.png)

<br>

## ๐ Eclipse ์ถ๋ ฅ Console

![linked_console1](https://user-images.githubusercontent.com/79084294/190658675-8dc67458-7fdd-4cc2-9758-c3af55149e63.png)
