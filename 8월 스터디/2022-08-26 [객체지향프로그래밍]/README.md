# π Java Study

## πΈ 2022-08-26 κΈμμΌ

## [μΈν°νμ΄μ€ μμ© λ¬Έμ νμ΄]

### 1. μΈν°νμ΄μ€ μμ© λ¬Έμ νμ΄

- μ λ ¬ μκ³ λ¦¬μ¦ κ΅¬ννκΈ°
- Sort(ascending(int[]), descending(int[]), description()) 3κ°μ λ©μλ κ΅¬ν
- νμλ‘ QuickSort, HeaSort, BubbleSort 3κ°μ μ’λ₯ κ΅¬ν

<br>

- Sort ν΄λμ€

```java
    package sorting;

public interface Sort {

    void ascending(int[] arr);

    void descending(int[] arr);

    default void description() {
        System.out.println("μ«μλ₯Ό μ λ ¬νλ μκ³ λ¦¬μ¦ μλλ€.");
    }
}
```

- λ¨Όμ , μμν  μΈν°νμ΄μ€ Sort κ΅¬ν
- λ§€κ°λ³μλ‘ μ λ ¬ν  λ°°μ΄μ λ°μ(ascending, descending)
- default λ©μλ description κ΅¬ν

<br>

- BubbleSort ν΄λμ€

```java
    package sorting;

public class BubbleSort implements Sort {

    @Override
    public void ascending(int[] arr) {
        System.out.println("BubbleSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("BubbleSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("BubbleSort μλλ€.");
    }
}
```

- μμ μΈν°νμ΄μ€ Sortλ₯Ό μμλ°μ
- Sortμ ascending, descending, description 3κ° Override
- μ μ½λ κ΅¬μ± νμμΌλ‘ BubbleSort, HeapSort, QuickSort κ΅¬ν

<br>

- SortTest(main) ν΄λμ€

```java
    package sorting;

import java.io.IOException;

public class SortTest {

    public static void main(String[] args) throws IOException {

        System.out.println("μ λ ¬λ°©μμ μ ννμΈμ.");
        System.out.println("B : BubbleSort ");
        System.out.println("H : HeapSort ");
        System.out.println("Q : QuickSort ");

        int ch = System.in.read();
        Sort sort = null;

        if (ch == 'B' || ch == 'b') {
            sort = new BubbleSort();
        } else if (ch == 'H' || ch == 'h') {
            sort = new HeapSort();
        } else if (ch == 'Q' || ch == 'q') {
            sort = new QuickSort();
        } else {
            System.out.println("μ§μλμ§ μλ κΈ°λ₯μλλ€.");
            return;
        }

        int[] arr = new int[10];
        sort.ascending(arr);
        sort.descending(arr);
        sort.description();
    }
}
```

- throw μμΈ μ²λ¦¬ λ°©λ²μΌλ‘ if ~else λ¬Έμ ν΅ν΄ μ½λλ₯Ό μ€ν μν€κ³ , μ‘°κ±΄μ λ§λ μμΈ λ°μ μ ν΄λΉ μ‘°κ±΄μμΌλ‘ μ²λ¦¬
- κΈ°λ³Έμ μΌλ‘ μλ°κ° μμ€ν€μ½λ κ°μ΄ μλ ₯λκΈ° λλ¬Έμ int νμμΌλ‘ λ°μ
- `System.in.read()` => μ«μ νλλ₯Ό μλ ₯λ°μ κ·Έλλ‘ μΆλ ₯
- μ¬μ©μκ° μλ ₯ μ λμλ¬Έμ μ€λ₯ λ°μνμ§ μλλ‘ κ΅¬λΆ μ‘°κ±΄λ¬Έ ν¬ν¨
- ν΄λΉ μ‘°κ±΄μμ ν¬ν¨λμ§ μμ μ μ§μλμ§ μλ κΈ°λ₯ λͺμ
- `int[] arr = new int[10];` => λ°°μ΄ μ μΈκ³Ό λμμ μμ±

<br>

## π Eclipse μ€μ΅

![day27](https://user-images.githubusercontent.com/79084294/187034664-c6e2d82c-e0fd-4907-b692-1e4af9c2af3c.png)

<br>

## π Eclipse μΆλ ₯ Console

![day27_console1](https://user-images.githubusercontent.com/79084294/187034668-a64772ca-6490-474a-b4be-e87f20ed945c.png)

![day27_console2](https://user-images.githubusercontent.com/79084294/187034669-a5f34ce3-ecbf-4a6e-9d79-11fda0838d23.png)

![day27_console3](https://user-images.githubusercontent.com/79084294/187034670-b001524c-f8c1-4a53-9650-d97182655e36.png)
