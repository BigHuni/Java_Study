# π Java Study

## πΈ 2022-08-18 λͺ©μμΌ

## [μΈν°νμ΄μ€]

### 1. μΈν°νμ΄μ€

    - μΆμ λ©μλ
    - μμ
    - λν΄νΈ λ©μλ
    - μ μ  λ©μλ
    - private λ©μλ

<br>

- μΈν°νμ΄μ€ : μ΄λ ν κ°μ²΄μ λν λͺμ , μ΄λ ν λ©μλλ€μ μ κ³΅ν  κ²μΈμ§ μ€λͺν κ°μ΄λ μ­ν 

- μΈν°νμ΄μ€ μ μΈκ³Ό κ΅¬ν

```java
    public interface Calc {            // μΈν°νμ΄μ€μμ μ μΈν λ³μλ
    doubl PI = 3.14;                   // μ»΄νμΌ κ³Όμ μμ μμλ‘ λ³ν
    int ERROR = -999999;

    int add(int num1, int num2);       // μΈν°νμ΄μ€μμ μ μΈν λ©μλλ

    int substract(int num1, int num2); // μ»΄νμΌ κ³Όμ μμ μΆμ λ©μλλ‘ λ³ν
}
```

- `PI`λ μμμ μλ―Έλ‘ μ΄ν€λ¦­μ²΄λ‘ λ³κ²½
- μ»΄νμΌ κ³Όμ μμ public static final double ν€μλκ° λΆμ

<br>

- CalcTest ν΄λμ€

```java
    public class CalcTest {

    public static void main(String[] args) {

        CompleteCalc calc = new CompleteCalc();
        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));
        calc.showInfo();
    }

}
```

- CompleteCalc ν΄λμ€λ Calculator ν΄λμ€λ₯Ό μμ λ°κ³ , Calc μΈν°νμ΄μ€κ° κ΅¬ν
- μ μ½λμμ CompleteCalc νμ λμ  `Calc` μΈν°νμ΄μ€λ‘ νμμ μ μΈν  μ μκ³ , `Caculator`λ κ°λ₯
- λ¨, μ΄ κ³Όμ μμ ν λ³νμ΄ μΌμ΄λ¨
- λ§μ½, μΈν°νμ΄μ€ νμμΈ CalcμΌλ‘ μ μΈν λ³μ calcλ μΈμ€ν΄μ€κ° `CompleteCalc()`λΌ ν΄λ νμμ΄ Calc μ΄κΈ° λλ¬Έμ μ¬μ©ν  μ μλ λ©μλλ μΈν°νμ΄μ€ Calcμ μλ λ©μλλ§ μ¬μ©κ°λ₯(μ
  μΊμ€ν)
- `Calc calc = new CompleteCalc();`
- μΈν°νμ΄μ€λ₯Ό κ΅¬νν ν΄λμ€λ μΈν°νμ΄μ€ νμμΌλ‘ λ³μλ₯Ό μ μΈνμ¬ μΈμ€ν΄μ€λ₯Ό μμ±ν  μ μμ
- μΈν°νμ΄μ€λ κ΅¬ν μ½λκ° μκΈ° λλ¬Έμ `νμ μμ`μ΄λΌκ³ λ ν¨

<br>

## π Eclipse μ€μ΅

![day23](https://user-images.githubusercontent.com/79084294/185450265-2683d465-5036-4728-8270-ac2deef06047.png)

<br>

## π Eclipse μΆλ ₯ Console

![day23_console1](https://user-images.githubusercontent.com/79084294/185450267-bd8802f3-e0f6-4cb8-84fd-7ce1bd6cd9e6.png)
