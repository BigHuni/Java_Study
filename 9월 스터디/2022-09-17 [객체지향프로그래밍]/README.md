## ๐ธ 2022-09-17 ํ ์์ผ

## [๊ฐ์ฒด์งํฅํ๋ก๊ทธ๋๋ฐ]

### 1. Stack๊ณผ Queue ๊ตฌํํ๊ธฐ

- Stack์ ์ด๋ฏธ ๊ธฐ๋ณธ ์ ๊ณต
- Queue๋ ArrayList ์ด์ฉํด์ ๋ง์ด ์ฌ์ฉ

<br>

- Stack ๊ตฌํํ๊ธฐ
    - LIFO(Last In First Out) : ๋งจ ๋ง์ง๋ง์ ์ถ๊ฐ๋ ์์๊ฐ ๊ฐ์ฅ ๋จผ์  ๊บผ๋ด์ง๋ ์๋ฃ ๊ตฌ์กฐ
    - ์ด๋ฏธ ๊ตฌํ๋ ํด๋์ค๊ฐ ์ ๊ณต๋จ
    - ArrayList๋ LinkedList๋ก ๊ตฌํํ  ์ ์์
    - ๊ฒ์์์ ๋ฌด๋ฅด๊ธฐ, ์ต๊ทผ ์๋ฃ ๊ฐ์ ธ์ค๊ธฐ ๋ฑ์ ๊ตฌํ
    - ์คํ์์ ์์ ์ถ๊ฐ(push), ์์ ๊บผ๋ด์ด(pop) ์ญ์ ํ๊ธฐ

<br>

- Queue ๊ตฌํํ๊ธฐ
    - FIFO(First In First Out) : ๋จผ์  ์ ์ฅ๋ ์๋ฃ๊ฐ ๋จผ์  ๊บผ๋ด์ง๋ ์๋ฃ ๊ตฌ์กฐ
    - ์ ์ฐฉ์, ๋๊ธฐ์ด ๋ฑ์ ๊ตฌํํ  ๋ ๊ฐ์ฅ ๋ง์ด ์ฌ์ฉ๋๋ ์๋ฃ ๊ตฌ์กฐ
    - ArrayList๋ LinkedList๋ก ๊ตฌํํ  ์ ์์
    - ํ์์ ์์ ์ถ๊ฐ(enqueue), ์์ ์ญ์ (dequeue)

<br>

- ํด๋์ค MyStack์ ArrayList๋ก ๊ตฌํ

```java
  class MyStack {

    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data) {         // push()๋ก object ํ๋๊ฐ ๋ค์ด์์ผ ํจ
        arrayStack.add(data);               // arrayStack์ ๋งจ ๋ง์ง๋ง์ data๋ฅผ ๋ฃ์ด์ผ ํจ 
    }

    public String pop() {
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("์คํ์ด ๋น์์ต๋๋ค.");
            return null;
        }

        arrayStack.remove(len - 1);
    }

}

public class StackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());        // C
        System.out.println(stack.pop());        // B
        System.out.println(stack.pop());        // A
        System.out.println(stack.pop());        // ์คํ์ด ๋น์์ต๋๋ค. + null ๋ฐํ
    }
}

```

<br>

- ์๋ฐ์ ์ด๋ฏธ Stack์ด ๊ตฌํ
- Stack ์์ค์ `peek()` => ํด๋น ์์๊ฐ ๋ฌด์์ธ์ง ํ์ธ, ๊บผ๋ด์ง๋ ์์
- Queue ์์ค์ `priorityQueue` => ์ฐ์ ์์๋ฅผ ๊ฐ๋ Queue, ์์๋ฅผ ํ๋์ฉ ๊บผ๋ผ ๋๋ง๋ค ์ ์ผ ํฐ ๊ฐ, ์์ ๊ฐ์ ๊บผ๋ผ ๋ ์ฌ์ฉ
- ์ผ๋ฐ์ ์ผ๋ก `ArrayList`๋ฅผ ์ด์ฉํด `Queue`๋ฅผ ๋ง์ด ์ฌ์ฉ

<br>

## ๐ Eclipse ์ค์ต

![stack_list](https://user-images.githubusercontent.com/79084294/190859693-d7ba870f-a0bc-4b21-944a-8f4144282830.png)

<br>

## ๐ Eclipse ์ถ๋ ฅ Console

![stack_console](https://user-images.githubusercontent.com/79084294/190859695-53954b79-e522-4860-814b-659869b4a036.png)
