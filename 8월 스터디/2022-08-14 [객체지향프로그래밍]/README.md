# π Java Study

## πΈ 2022-08-14 μΌμμΌ

## [μΆμ ν΄λμ€]

### 1. μΆμ ν΄λμ€

- μΆμ ν΄λμ€ : μΆμ λ©μλλ₯Ό ν¬ν¨ν ν΄λμ€

  - μΆμ λ©μλ : κ΅¬ν μ½λκ° μμ΄ μ μΈλΆλ§ μλ λ©μλ

  - `abstract` μμ½μ΄ μ¬μ© : μΆμ ν΄λμ€λ new(μΈμ€ν΄μ€ν) ν  μ μμ

  - λ©μλμ bodyκ° μμ

<br>

```java
    public abstract void display();
	public abstract void typing();
```

- μΌλ°μ μΌλ‘ ν΄λμ€λ₯Ό μμ±νμλ€λ©΄, μ€λ₯ λ°μ => `abstract`ν€μλλ₯Ό λΆμ¬ `public abstract class ν΄λμ€λͺ` μΌλ‘ μ§μ΄μΌ ν¨

- μ μ½λλ κ΅¬νμ½λκ° μμ, μΈμ  κ΅¬νμ΄ λλμ§? => `νμ ν΄λμ€`μμ κ΅¬ν

- μΆμ ν΄λμ€λ λ¨λ μ¬μ©μΌλ‘ λ§λ€μ΄μ§λ κ²μ΄ μλλΌ μμ ν΄λμ€μ©μΌλ‘ μ£Όλ‘ μ¬μ©

- νλλΌλ μΆμ λ©μλλ₯Ό ν¬ν¨νλ©΄, `abstract class`κ° λμ΄μΌ ν¨

- μ¦, μΆμ λ©μλκ° ν¬ν¨λ ν΄λμ€λ μΆμ ν΄λμ€λ‘ μ μΈ

- λͺ¨λ  λ©μλκ° κ΅¬νλμλ€κ³  ν΄λ ν΄λμ€μ `abstract` ν€μλλ₯Ό μ¬μ©νλ©΄ μΆμ ν΄λμ€

- μΆμ ν΄λμ€λ μ£Όλ‘ μμμ μμ ν΄λμ€λ‘ μ¬μ©

- μΆμ λ©μλ : νμ ν΄λμ€κ° κ΅¬νν΄μΌ νλ λ©μλ

- κ΅¬νλ λ©μλ : νμ ν΄λμ€κ° κ³΅ν΅μΌλ‘ μ¬μ©νλ κΈ°λ₯μ λ©μλ, νμ ν΄λμ€μ λ°λΌ μ¬μ μ ν  μ μμ

<br>

### 2. Eclipse μ€λ₯(Cannot instantiate the type OOO)

- DeskTop ν΄λμ€

```
    public class DeskTop extends Computer {

    public void display() {
        System.out.println("DestTop display");
    }

    public void typing() {
        System.out.println("DeskTop typing");
    }
}
```

- Computer ν΄λμ€

```
    public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("μ μμ μΌ­λλ€.");
    }

    public void turnOff() {
        System.out.println("μ μμ λλλ€.");
    }
}
```

- ComputerTest ν΄λμ€

```
    public class ComputerTest {

    public static void main(String[] args) {

        Computer computer = new DeskTop();
        computer.display();
    }

}
```

```
    Computer computer = new Computer();
```

\=> ComputerTest ν΄λμ€μμ μ μ½λ μλ ₯ μ μ€λ₯ λ°μ, computer ν΄λμ€λ μΆμ ν΄λμ€μ΄κΈ° λλ¬Έ

- `computer.display();` μ°μμ λ λΆλ¬μ¬ λ©μλκ° μμ(κ΅¬νμ΄ μ λμ΄ μκΈ° λλ¬Έ)
- λ°λΌμ Computerλ μΈμ€ν΄μ€ν λ  μ μμ
- DeskTopμ μΈμ€ν΄μ€ν λ  μ μλ μ΄μ λ μμμμ μμ ν΄λμ€ νμμ λ³μλ‘ νμ ν΄λμ€μ μΈμ€ν΄μ€κ° μμ±λμ΄ λμλ  μ μκΈ° λλ¬Έ
- λ¬΅μμ  ν λ³ν
- μΆμ ν΄λμ€ νλλ₯Ό μμλ°μ μ¬λ¬ ν΄λμ€λ₯Ό λμΌν νμμΌλ‘ μμ ν΄λμ€ νμμΌλ‘ νΈλ€λ§ν΄μ λ§μ΄ μ¬μ©
- μ μ€λ₯λ OOO ν΄λμ€κ° μΈμ€ν΄μ€λ₯Ό λ§λ€ μ μλ Abstract(μΆμ) ν΄λμ€μ΄κΈ° λλ¬Έμ λ°μ
- λ°λΌμ μνΌ μμ±μλ₯Ό νΈμΆνκ±°λ ν΄λΉ ν΄λμ€μ μΆμνλ₯Ό μ κ±°νλ©΄ λ¨
- μΆμ ν΄λμ€λ new() κ°μ²΄ μμ±μ΄ λΆκ°λ₯
- stack overflow μ°Έμ‘° : [https://stackoverflow.com/questions/30317070/java-returns-error-cannot-instantiate-the-type](https://stackoverflow.com/questions/30317070/java-returns-error-cannot-instantiate-the-type)

<br>

## π Eclipse μ€μ΅

![day19](https://user-images.githubusercontent.com/79084294/184638586-07030b46-c423-4e54-a1f8-e991429509a8.png)

<br>

## π Eclipse μΆλ ₯ Console

![day19_console1](https://user-images.githubusercontent.com/79084294/184638592-b831c4a1-e74b-45b8-a5a6-7fd4c8fee5b5.png)
