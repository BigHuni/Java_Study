## πΈ 2022-09-12 μμμΌ

## [κ°μ²΄μ§ν₯νλ‘κ·Έλλ°]

### 1. Object ν΄λμ€ μμ©

- λ μ§λ₯Ό κ΅¬νν ν΄λμ€ MyDate
- λ μ§κ° κ°μΌλ©΄ equals() λ©μλμ κ²°κ³Όκ° trueκ° λλλ‘ κ΅¬ννκΈ°
- hashCode() λ©μλλ κ΅¬ν

<br>

- MyDate ν΄λμ€

````java
    package object;

public class MyDate {

    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
````

<br>

- MyDateTest ν΄λμ€

```java
    package object;

public class MyDateTest {

    public static void main(String[] args) {

        MyDate date1 = new MyDate(12, 9, 2022);
        MyDate date2 = new MyDate(12, 9, 2022);

        System.out.println(date1.equals(date2));
    }
}
```

- κ²°κ³Όλ `false`
- μλ¬΄κ²λ μ€λ²λΌμ΄λ©μ νμ§ μμκΈ° λλ¬Έ
- equals()μ hashCode() μμ±

<br>

- `@Override` μΆκ°
- equals() μ μ => if μ‘°κ±΄λ¬ΈμΌλ‘ true κ° μ€μ 
- hashCode() μ μ

```java
    @Override
public boolean equals(Object obj){
        if(obj instanceof MyDate){
        MyDate date=(MyDate)obj;

        if(this.day==date.day&&this.month==this.month&&this.year==this.year)
        return true;

        return false;
        }

        return false;
        }
```

```java
    @Override
public int hashCode(){
        return day*11+month*101+year*1001;
        }
```

<br>

## π Eclipse μ€μ΅

![object_list](https://user-images.githubusercontent.com/79084294/189676029-90d77149-a33a-4a16-9940-56c83dbe1a7c.png)

<br>

## π Eclipse μΆλ ₯ Console

![object_console1](https://user-images.githubusercontent.com/79084294/189676036-a48b41d1-0acf-4452-aaf8-9cf5965d3e92.png)
