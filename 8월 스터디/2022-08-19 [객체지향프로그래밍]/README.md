# π Java Study

## πΈ 2022-08-19 κΈμμΌ

## [μΈν°νμ΄μ€λ₯Ό νμ©ν λ€νμ± κ΅¬ν]

### 1. μΈν°νμ΄μ€μ μ­ν 

- ν΄λΌμ΄μΈνΈ νλ‘κ·Έλ¨μ μ΄λ€ λ©μλλ₯Ό μ κ³΅νλμ§ μλ €μ£Όλ λͺμΈ(Specification) λλ μ½μ
- ν κ°μ²΄κ° μ΄λ€ μΈν°νμ΄μ€μ νμμ΄λΌ ν¨μ κ·Έ μΈν°νμ΄μ€μ λ©μλλ₯Ό κ΅¬ννλ€λ μλ―Έ
- ν΄λΌμ΄μΈνΈ νλ‘κ·Έλ¨μ μ€μ  κ΅¬ν λ΄μ©μ λͺ°λΌλ μΈν°νμ΄μ€μ μ μλ§ μλ©΄ κ·Έ κ°μ²΄λ₯Ό μ¬μ©ν  μ μμ
- μΈν°νμ΄μ€λ₯Ό κ΅¬νν΄ λμ λ€μν κ°μ²΄λ₯Ό μ¬μ©ν¨ - λ€νμ±
    - JDBCλ₯Ό κ΅¬νν μ€λΌν΄, MSSQL λΌμ΄λΈλ¬λ¦¬ λ±
- μ½κ² λ§ν΄, `ABC` λΌλ μΈν°νμ΄μ€μ κ΅¬νλμ΄ μλ a(), b(), c() λ©μλκ° μλ€λ λͺμΈλ₯Ό νμΈν  μ μμ
- μΆμ ν΄λμ€μμ μ°¨μ΄μ μ κ³΅ν΅λλ λͺ¨λμ΄ μμ μλ, μμ μλ μκ³ , ν΄λμ€μ΄κΈ°μ νλλ§ μμλ°μ
- μΈν°νμ΄μ€λ μμνκ² λͺμΈλ§ λμ΄ μκΈ°μ μ¬λ¬ κ°λ₯Ό μμλ°μ μ μμ
- Connetionμ μ¬λ¬ λ©μλ λ±μ κ΅¬ννλΌκ³  μ μΈλμ΄ μμ, μ΄λ₯Ό μμ(implements)νλ κ²μ μ€λΌν΄ MySQL, MSSQL λ± DB μ¬
- μ΄ λ€μ΄ κ΅¬νν΄μ μ°λ¦¬μκ² λΌμ΄λΈλ¬λ¦¬λ₯Ό μ κ³΅(.jar νμΌ)
- μ°λ¦¬λ μ€λΌν΄λ‘ μ°κ²°ν΄μ μΏΌλ¦¬λ¬Έμ μννκΈ° μν΄ .jar νμΌμ import ν΄μ μλ£λ₯Ό Connectionμ μ°κ²°νλλ°, μΈν°νμ΄μ€ λͺμΈλ₯Ό λ³΄λ©΄μ ν¨

<br>

### 2. μΈν°νμ΄μ€μ λ€νμ± κ΅¬ννκΈ°

- κ³ κ° μΌν°μλ μ ν μλ΄μ νλ μλ΄μλ€μ΄ μλ€. μΌλ¨ κ³ κ° μΌν°λ‘ μ νκ° μ€λ©΄ λκΈ°μ΄μ μ μ₯λλ€. μλ΄μμ΄ μ§μ λκΈ° μ κΉμ§ λκΈ° μνκ° λλ€. κ° μ νκ° μλ΄μμκ² λ°°λΆλλ μ μ±μ λ€μκ³Ό κ°μ΄ κ΅¬νλ  μ μμ
    - μλ΄μ μμλλ‘ λ°°λΆνκΈ°
    - λκΈ°κ° μ§§μ μλ΄μ λ¨Όμ  λ°°λΆνκΈ°
    - μ°μ μμκ° λμ(μλ ¨λκ° λμ) μλ΄μμκ² λ¨Όμ  λ°°λΆνκΈ°

- μμ κ°μ λ€μν μ μ±μ΄ μ¬μ©λλ κ²½μ°, interfaceλ₯Ό μ μνκ³  λ€μν μ μ±μ κ΅¬νμ¬ μ€ννκΈ°

<br>

- interface κ΅¬ν (Scheduler)

```java
public interface Scheduler {
    public void getNextCall();

    public void sendCallToAgent();
}
```

<br>

- priorityAllocation ν΄λμ€(μΈν°νμ΄μ€ μμ)

```java
  public class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("κ³ κ° λ±κΈμ΄ λμ κ³ κ°μ callμ λ¨Όμ  κ°μ Έμ΅λλ€.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("μλ¬΄ μλ ¨λκ° λμ μλ΄μμκ² λ¨Όμ  λ°°λΆν©λλ€.");
    }

}
```

<br>

- SchedulerTest ν΄λμ€(main)

```java
  package scheduler;

import java.io.IOException;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {

        System.out.println("μ ν μλ΄μ ν λΉ λ°©μμ μ ννμΈμ.");
        System.out.println("R : νλͺμ© μ°¨λ‘λλ‘");
        System.out.println("L : λκΈ°κ° μ μ μλ΄μ μ°μ ");
        System.out.println("P : μ°μ μμκ° λμ κ³ κ° μ°μ  μλ ¨λ λμ μλ΄μ");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("μ§μλμ§ μλ κΈ°λ₯μλλ€.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();

    }
}
```

- println κ΅¬λ¬Έμ΄ λμ€κ³  P νΉμ p μλ ₯ μ `PriorityAllocation` ν΄λμ€μ ν΄λΉνλ println λ©μλ νΈμΆ
- interfaceμ λ©μλλ€μ κ΅¬ννλ κ²μ΄ μ€μ
- μ΄λ₯Ό κ΅¬ννλ κ²μ κ° ν΄λμ€λ₯Ό μμ±νμ¬ Override
- JDBC κ°μ κ²½μ°μλ κ° DB μ¬μμ κ·Έ μ­ν  μν
- μ μ±μ΄ λ°λμλ€λ©΄, ν΄λΉ νλ ν΄λμ€μ μΆλ ₯κ³Ό mainμμ μ‘°κ±΄λ¬Έμ μ‘°μνλ©΄ λ¨
- νλ‘μ νΈ μν μ μ¬μ  μ μλ μΈν°νμ΄μ€λ₯Ό κ°κ³  μννλ κ²½μ°κ° μμ
- μλ‘ λ€λ©΄, μλλ‘μ΄λ, μ€νλ§ νλ μμν¬λ₯Ό μ¬μ© μ κ΅μ₯ν λ§μ μΈν°νμ΄μ€κ° μ΄λ―Έ μ μΈλμ΄ μμ
- μΈν°νμ΄μ€μ μ­ν μ μ λ¦¬ν΄λ³΄λ©΄, λͺ¨λμ΄ ν΄μΌν  μΌμ μ λ¦¬ν΄λμ κ²

<br>

- μΈν°νμ΄μ€μ strategy pattern
    - μ¬λ¬ κ°μ μ μ±μ΄ μ‘΄μ¬ν  μ μμ(Bubble Sort, Quick Sort, Heap Sort...)
    - μ΄λ νλμ μ μ±μ κ΅¬ν(Sorting)
    - μΈν°νμ΄μ€λ₯Ό νμ©νλ©΄ λ€μν μ μ±μ΄λ μκ³ λ¦¬μ¦μ νλ‘κ·Έλ¨μ ν° μμ  μμ΄ μ μ©, νμ₯ν  μ μμ
    - μλ IUserInfoDao λ±μ κ΅¬ν
    - κ·Έ ν implements ν΄μ μ μ±μ λ°λΌ κ·Έ μΈν°νμ΄μ€μ λ§λ oracleDao, mysqlDao, mssqlDao λ±μ κ΅¬ννμ¬ ν¬ν

<br>

## π Eclipse μ€μ΅

![day24](https://user-images.githubusercontent.com/79084294/185746311-13fc76bd-0656-4bbc-87d6-8e8be788f72e.png)

<br>

## π Eclipse μΆλ ₯ Console

![day24_console1](https://user-images.githubusercontent.com/79084294/185746315-f1f62757-97ef-46bb-a0b6-15ccc2d823b5.png)
