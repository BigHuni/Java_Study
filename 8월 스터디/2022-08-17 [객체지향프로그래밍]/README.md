# π Java Study

## πΈ 2022-08-17 μμμΌ

## [μΆμ ν΄λμ€ μμ©]

### 1. μ½λ©ν΄λ³΄κΈ°

- μμ  : μλμ°¨ μ£Όν κ³Όμ  κ΅¬ννκΈ°
    - Car μΆμ ν΄λμ€λ₯Ό μμλ°λ Sonata, Avante, Grandeur, Genesis ν΄λμ€κ° μλ€.
    - κ° μ°¨λ μ£ΌννκΈ° μν΄ λ€μ λ©μλμ μμλ‘ μμ§μ
  ```java
  run() {
    start();
    drive();
    stop();
    turnoff();
  }
    ```
    - run() λ©μλλ₯Ό ννλ¦Ώ λ©μλλ‘ κ΅¬ννκ³ , CarTest ν΄λμ€λ₯Ό μ°Έκ³ νμ¬ νλ‘κ·Έλ¨μ μμ±

<br>

- Car ν΄λμ€

```java
  public abstract class Car {
    public abstract void start();

    public abstract void drive();

    public abstract void stop();

    public abstract void turnoff();

    public void washCar() {
        System.out.println("μΈμ°¨λ₯Ό ν©λλ€.");
    }

    public void run() {
        start();
        drive();
        stop();
        turnoff();
    }
}
```

- μΆμ ν΄λμ€λ‘ Car ν΄λμ€ μμ±
- μΆμ λ©μλ start(), drive(), stop(), turnoff() μμ±
- run() λ©μλλ‘ κ° μΆμ λ©μλ μ€ννλλ‘ κ΅¬ν

<br>

- Avante ν΄λμ€

```java
  public class Avante extends Car {

    @Override
    public void start() {
        System.out.println("Avante μλμ μΌ­λλ€.");
    }

    @Override
    public void drive() {
        System.out.println("Avante λ¬λ¦½λλ€.");
    }

    @Override
    public void stop() {
        System.out.println("Avante λ©μΆ₯λλ€.");
    }

    @Override
    public void turnoff() {
        System.out.println("Avante μλμ λλλ€.");
    }
}
```

- Car ν΄λμ€λ‘λΆν° μμλ°μ Avante ν΄λμ€ μμ±(λλ¨Έμ§ Genesis, Grandeur, Sonataλ μμ±)
- Overrideλ‘ κ° μΆμ λ©μλ κ΅¬ν
- μΆλ ₯λ¬ΈμΌλ‘ κ° ν΄λΉνλ κ΅¬λ¬Έ κΈ°μ¬

<br>

CarTest ν΄λμ€

```java
  import java.util.ArrayList;

public class CarTest {

    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Avante());
        carList.add(new Genesis());
        carList.add(new Grandeur());
        carList.add(new Sonata());

        for (Car car : carList) {
            car.run();

            System.out.println("====================");
        }
    }

}
```

- ArrayList μ¬μ©μ μν΄ util.ArrayList import μΆκ°
- main ν¨μ μ μ©
- λ°°μ΄ μμ±νμ¬ κ° μ°¨μ’μ μλ° νμΌ add
- carListμ μλ λͺ¨λ  μ°¨μ’ run() λ©μλ λμ

<br>

## π Eclipse μ€μ΅

![day22](https://user-images.githubusercontent.com/79084294/185276339-caf803f9-6c75-4e98-9fbb-0a81dcdca000.png)

<br>

## π Eclipse μΆλ ₯ Console

![day22_console1](https://user-images.githubusercontent.com/79084294/185276343-9ccd761c-7ba0-4b99-ac41-f982ad273cff.png)
