## πΈ 2022-09-14 μμμΌ

## [κ°μ²΄μ§ν₯νλ‘κ·Έλλ°]

### 1. μ λ€λ¦­ νλ‘κ·Έλλ°

- λ³μμ μ μΈμ΄λ λ©μλμ λ§€κ° λ³μλ₯Ό νλμ μ°Έμ‘° μλ£νμ΄ μλμ¬λ¬ μλ£νμ λ°νλ  μ μλλ‘ νλ‘κ·Έλλ° νλ λ°©μ
- μ€μ  μ¬μ©λλ μ°Έμ‘° μλ£νμΌλ‘μμ λ³νμ μ»΄νμΌλ¬κ° κ²μ¦νλ―λ‘ μμ μ μΈ νλ‘κ·Έλλ° λ°©μ

<br>

- μλ£ν λ§€κ° λ³μ T
    - μ¬λ¬ μ°Έμ‘° μλ£νμΌλ‘ λμ²΄λ  μ μλ λΆλΆμ νλμ λ¬Έμλ‘ νν
    - typeμ μλ―Έλ‘ T μ¬μ©

```java
    public class GenericPrinter<T> {             // GenericPrinter<T> => μ λ€λ¦­ ν΄λμ€
    private T material;                          // T => typeμ μ½μ. μλ£ν λ§€κ° λ³μ

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        retrun material;
    }
}
```

<br>

 ```
  GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
  Powder powder = new Powder();
  powderPrinter.setMaterial(powder);
  System.out.println(powderPrinter);
  
  GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
  Plastic plastic = new Plastic();
  plasticPrinter.setMaterial(plastic);
  System.out.println(plasticPrinter);
 ```

- `new GenericPrinter<Powder>();` => <Powder>λ₯Ό μ μ°κ³ , <>λ₯Ό μ¬μ©νλ©΄ μμ <Powder>λ‘ μ μΆλ₯Ό νκ² λ¨
- `Powder powder = new Powder();` => Powderμ λν μ¬λ£ λ£κΈ°
- `powderPrinter.setMaterial(powder);` => `powder`κ° Printerμ μ¬λ£κ° λ¨
- μμ κ·Έλ₯ `GenericPrinter<T>` νμλ§ μ μΈνλ€κ³  ν΄μ μμ±λλ κ²μ μλ
- main Testμμ new μμ±νμ¬ setMaterialλ‘ κ°μ ν λΉν΄μΌ ν¨
- μ μ½λλ₯Ό λ³΄κ³ , κ°κ° λ€λ₯Έ νμμ λν Printerλ₯Ό μμ±ν  λ, `μλ£ν<>`μ λμν΄μ μ¬μ©ν  μ μμ => `Generic νλ‘κ·Έλλ°`

<br>

- λ§μ½, 3D νλ¦°ν°μ Water μ¬λ£λ₯Ό λ£λλ€κ³  κ°μ 
- λ¬Όμ 3D νλ¦°ν° μ¬λ£κ° λ  μ μκΈ°μ `GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();`λ₯Ό λ£κ³ , μμ ν΄λμ€(Material) μμ±
- κ·Έ λ€μ λͺ¨λ  GenericPrinterμ μ¬μ©νλ ν€λ₯Ό `<T extends Material>` ν΄μΌν¨ => μ¬κΈ°μ μμλ°μ μ¬λ£λ§ GenericPrinterλ‘ μ¬μ© κ°λ₯
- μ΄λ κ² λλ©΄, Main Testμμ μ¬μ μ μλ ₯ν Powderμ Plasticμ μ€λ₯ λ°μ => νμ¬ μμλ°κ³  μμ§ μκΈ° λλ¬Έ
- μμμ λ°μ μ μλλ‘ κ° μ¬λ£ ν΄λμ€μ `extends Material` μΆκ° => μ΄λ²μλ Waterλ₯Ό μ¬μ©ν  μ μκ² λ¨(Waterλ₯Ό μ μΈν λλ¨Έμ§ μ¬λ£λ§ μμλ°μκΈ° λλ¬Έ)
- μ¬μ©ν  μ μλ μ¬λ£μ λν μ νμ λκ³  μΆμ λ, `μμ ν΄λμ€` μ¬μ© λ°©λ² μ΄μ©
- λ λ€λ₯Έ λ°©λ², μΆμ ν΄λμ€ μ μΈ

```
  public abstract class Material {
	public abstract void doPrinting();
}
```

- Material ν΄λμ€μμ abstract ν΄λμ€λ‘ λ³ν ν doPrinting() μΆμ λ©μλ μΆκ°
- Powderμ Plastic λ μ¬λ£ ν΄λμ€ λͺ¨λ `@Override`λ‘ doPrinting() μΆκ°
- GenericPrinterμμ Tμ μ­ν μ extends Materialμ΄ μλλ©΄ materialμ `.(μ )`μ μ°μ΄λ³΄λ©΄ Object λ©μλλ€(toString, getClass, hashCode...) λ°μ
  μμ, μ¬κΈ°λ€κ° doPrinting()μ΄ μΆκ°λ¨ => Material ν΄λμ€λ doPrinting() λ©μλλ₯Ό νΈμΆν  μ μμ

<br>

- <T extends ν΄λμ€>
    - T λμ μ μ¬μ©λ  μλ£νμ μ ννκΈ° μν΄ μ¬μ©
    - Materialμ μ μλ λ©μλλ₯Ό κ³΅μ ν  μ μ

<br>

- μλ£ν λ§€κ° λ³μκ° λ κ° μ΄μμΌ λ

```java
  public class Point<T, V> {
    T x;
    V y;

    Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {       // public T getX(), V getY() => μ λλ¦­ λ©μλ
        return x;
    }

    public V getY() {
        return y;
    }
}
```

- μ λλ¦­ λ©μλ
    - λ©μλμ λ§€κ° λ³μλ₯Ό μλ£ν λ§€κ° λ³μλ‘ μ¬μ©νλ λ©μλ
    - λ©μλ λ΄μμμ μλ£ν λ§€κ° λ³μλ λ©μλ λ΄μμλ§ μ ν¨ν¨ (μ§μ­ λ³μμ κ°μ κ°λ)

```
  class Shape<T> {
    public static<T,V> double makeRectangle(Point<T,V>p1, Point<T,V>p2) {
      .....
     }
  }
```

- Shapeμ Tμ makeRectangleμ Tλ μ ν λ€λ₯Έ μλ―Έ

<br>

## π Eclipse μ€μ΅

![generic_list](https://user-images.githubusercontent.com/79084294/190173228-9e18f865-2c07-4650-8b31-0e92a1ebba09.png)

<br>

## π Eclipse μΆλ ₯ Console

![generic_console1](https://user-images.githubusercontent.com/79084294/190173217-2035c66c-273c-4f1a-ba5b-a259934abad0.png)
