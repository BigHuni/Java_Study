# π Java Study

## πΈ 2022-09-03 ν μμΌ

## [κ°μ²΄μ§ν₯νλ‘κ·Έλλ°]

### 1. Object ν΄λμ€

- μ¬λ¬ κ°μ²΄λ€μ λν `equals()`μ `hashcode()` λ©μλ κ΅¬ν μ
- λ¨Όμ  μμ±ν `equals()`μ λ©€λ²λ₯Ό νμ©νκΈ°
- λ¨, λ©€λ²κ° μ¬λ¬ κ° μμ κ²½μ° μ¬μ μ ν΄μΌ νλ κ²½μ°λ μμ
- `equals()` => λ κ°μ κ°μ²΄κ° κ°λ€κ³  νμ λ, λ κ°μ κ°μ²΄κ° λ°ννλ hashCode κ°λ λμΌνκ²λ μ€λ²λΌμ΄λ© ν¨

````
    Integer i1 = new Integer(100);
    Integer i2 = new Integer(100);

    System.out.println(i1.equals(i2));
    System.out.println(i1.hashCode());
    System.out.println(i2.hashCode());
````

<br>

- μ€μ  hashCode κ°μ λ©λͺ¨λ¦¬ μ£Όμ μκΈ°
- `System.out.println(System.identityHashCode(i1));`
- `System.out.println(System.identityHashCode(i2));`

<br>

- clone() λ©μλ
    - κ°μ²΄μ λ³΅μ¬λ³Έμ λ§λ¦
    - κΈ°λ³Έ ν(prototype)μΌλ‘λΆν° κ°μ μμ± κ°μ κ°μ§ κ°μ²΄μ λ³΅μ¬λ³Έμ μμ±ν  μ μμ
    - κ°μ²΄μ§ν₯νλ‘κ·Έλλ°μ μ λ³΄μλμ μλ°°λλ κ°λ₯μ±μ΄ μμΌλ―λ‘ λ³΅μ ν  κ°μ²΄λ `cloneable` μΈν°νμ΄μ€λ₯Ό λͺμν΄μΌ ν¨
    - μ€λ²λΌμ΄λ©μΌλ‘ clone λ©μλλ₯Ό μ ννλ©΄, λ©λͺ¨λ¦¬ λ³΅μ λ‘ μΈμ€ν°μ€μ κ°μ κ·Έλλ‘ λ³΅μ 

```
    @Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
```

<br>

- `Book book2 = (Book)book.clone();`
- clone() λ©μλμ μνμ΄ objectλ‘ λ°ν
- `(Book)`μΌλ‘ λͺμμ μΌλ‘ μΊμ€ν
- μ΄ λ, exception λ°μ
- ν΄λΉ ν΄λμ€κ° clone() λ©μλλ₯Ό μ¬μ©νλ €λ©΄, `class Book implements Cloneable` μ²λΌ λͺμν΄μΌ ν¨

<br>

## π Eclipse μ€μ΅

![day30](https://user-images.githubusercontent.com/79084294/188318544-b1a86d09-f9d7-4953-b4f4-35f1e0a85a15.png)

<br>

## π Eclipse μΆλ ₯ Console

![day30_console1](https://user-images.githubusercontent.com/79084294/188318546-682e1ca9-e702-4d51-a564-b65bb8eaaf50.png)
