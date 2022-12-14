# ๐ Java Study

## ๐ธ 2022-08-25 ๋ชฉ์์ผ

## [์ธํฐํ์ด์ค ์์ฉ]

### 1. ์ธํฐํ์ด์ค ์์ฉ

- ํ๋์ ๊ตฌํ ํด๋์ค๊ฐ ์ฌ๋ฌ ๊ฐ์ ์ธํฐํ์ด์ค๋ฅผ ์์๋ฐ์ ์ ์์
- ์ธํฐํ์ด์ค๊ฐ ์ฌ๋ฌ ๊ฐ ์์ ์ ๋ชจ๋ ์์๋ฐ์ ํ๋์ ์ธํฐํ์ด์ค๋ฅผ ๋ง๋ค ์ ์์

<br>

- X, Y interface

```
    public interface X {
	void x();
    }
```

```
    public interface Y {
	void y();
    }
```

<br>

- MyInterface ์ธํฐํ์ด์ค(์์)

```
    public interface MyInterface extends X, Y {
	void myMethod();
    }
```

<br>

- MyClass ํด๋์ค

```
    public class MyClass implements MyInterface {
    
	@Override
	public void x() {
	}
	
	@Override
	public void y() {
	}

	@Override
	public void myMethod() {
	}
}
```

- MyClass๋ MyInteface ํ์์ด๊ธฐ๋ ํ์ง๋ง, X, Y ํ์์ด๊ธฐ๋ ํจ
- ์ด๋ฅผ `ํ์ ์์(type inheritance)`๋ผ๊ณ  ํจ
- ์ด๋ฏธ ๋ผ์ด๋ธ๋ฌ๋ฆฌ์์ ์ด๋ฅผ ์ ๊ณตํ๋ ๊ฒฝ์ฐ๋ ์์

<br>

- BookShelf๋ฅผ ๋ง๋ค๋ ค๊ณ  ํ๋๋ฐ, ๊ธฐ์กด์ Shelf์ Queue๋ฅผ ๋ํ๋ ค๊ณ  ํจ
- ์์ ๊ฒ๋ถํฐ ์์๋๋ก ๊ฐ์ ธ๊ฐ(ํ ์๋ฃ๊ตฌ์กฐ)
- ์ด๋ฅผ implements ํด์ ์ฌ์ฉ

<br>

- Shelf ํด๋์ค

```java
    public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
```

- ArrayList์ String ํ์์ผ๋ก ์์ฑ
- ํ์ ํด๋์ค์์ ์์๋ฐ์ ์ฌ์ฉํ  ์ ์๋๋ก `protected`๋ก ์ ์ธ
- ArrayList ์์ฑ์ ์ฃผ๋ก Constructor์์ ๋ง์ด ํจ => `shelf = new ArrayList<String>();`
- protected ์ด๋ฏ๋ก ์ผ๋จ get๋ง ์์ฑ => `public ArrayList<String> getShelf()`
- ํด๋น ์ ๋ฐ์ ๊ฐ์๊ฐ ๋ช ๊ฐ์ธ์ง ํ์ธํ๊ธฐ ์ํ ๋ฉ์๋๋ก `getCount()` ์์ฑ

<br>

- Queue ์ธํฐํ์ด์ค

```java
    public interface Queue {

    void enQueue(String title);

    String deQueue();

    int getSize();
}
```

- Queue์ ์ง์ด๋ฃ๋ enQueue ๋ฉ์๋
- String์ ๋ฐํํด์ฃผ๋ deQueue ๋ฉ์๋
- Queue ์์ ๋ช ๊ฐ๊ฐ ๋ค์ด์๋์ง ํ์ธํ๊ธฐ ์ํ getSize ๋ฉ์๋

<br>

- BookShelf ํด๋์ค(Shelf ์์๋ฐ๊ณ , ๊ตฌํํ๋ ค๋ interface Queue)

```java
    public class BookShelf extends Shelf implements Queue {

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
```

- enQueue๋ Shelf์ ์ง์ด ๋ฃ์ => `shlelf.add(title);`
- deQueue๋ ์ฑ ํ ๊ถ์ด ๋น ์ ธ๋๊ฐ get์ด ์๋๊ณ , Shelf์์ ์์ด์ง๋ ๊ฒ
- Queue ํ์์์ deQueue๋ ๋งจ ์์ ๊ฒ์ด ์์ด์ง => remove() ์ฌ์ฉ, String ๋ฐํํด์ฃผ๋ index ํ์ฉ(0 ๋ฒ์งธ)
- size๋ Shelf์ getCount() ํธ์ถ

<br>

## ๐ Eclipse ์ค์ต

![day26](https://user-images.githubusercontent.com/79084294/186909107-b3a024a6-f3fb-4fb9-bad9-d6a5eda425b7.png)

<br>

## ๐ Eclipse ์ถ๋ ฅ Console

![day26_console1](https://user-images.githubusercontent.com/79084294/186909121-3bedfcb4-e7ce-4dcd-a9f7-90752dc48672.png)
