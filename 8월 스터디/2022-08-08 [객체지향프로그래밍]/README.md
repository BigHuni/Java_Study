# π Java Study

## πΈ 2022-08-08 μμμΌ

## [λ°°μ΄κ³Ό ArrayList]

### 1. λ€μ°¨μ λ°°μ΄

- 2μ°¨μ μ΄μμ λ°°μ΄

- μ§λ, κ²μ, νλ©΄μ΄λ κ³΅κ°μ κ΅¬νν  λ μ¬μ©

- `int [][] arr = new int [2][3]`

  - int : μλ£ν
  - arr : λ°°μ΄ μ΄λ¦
  - [2] : ν κ°μ
  - [3] : μ΄ κ°μ

<br>

```java
    int [][] arr = {{1, 2, 3}, {4, 5, 6}};

	System.out.println(arr.length);		    // 2
	System.out.println(arr[0].length);      // 3
	System.out.println(arr[1].length);      // 3
```

<br>

```java
    int [][] arr = {{1, 2, 3}, {4, 5, 6}};

	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
		}

		System.out.println();
```

```java
    1 2 3
    4 5 6
```

<br>

- 2μ°¨μ λ°°μ΄μ μ΄μ©ν  λ, for λ¬Έ μ€μ²©μΌλ‘ μ¬μ©νλ κ²½μ°κ° λ§μ

- 3μ°¨μμ for λ¬Έμ΄ 3κ°(λ©΄ - ν - μ΄)

- κ°μ₯ λ°κΉ₯μ΄ κ°μ₯ ν° κ³΅κ°μ μλ―Έ

<br>

### 2. ArrayList ν΄λμ€

- μλ°μμ μ κ³΅λλ κ°μ²΄ λ°°μ΄μ΄ κ΅¬νλ ν΄λμ€

- κ°μ²΄ λ°°μ΄μ μ¬μ©νλλ° νμν μ¬λ¬ λ©μλλ€μ΄ κ΅¬νλμ΄ μμ

- μ£Όμ λ©μλ

| λ©μλ               | μ€λͺ                                                            |
| :------------------- | :-------------------------------------------------------------- |
| `boolean add(E e)`   | μμ νλλ₯Ό λ°°μ΄μ μΆκ°ν©λλ€. Eλ μμμ μλ£νμ μλ―Έν©λλ€.  |
| `int size()`         | λ°°μ΄μ μΆκ°λ μμ μ μ²΄ κ°μλ₯Ό λ°νν©λλ€.                      |
| `E get(int index)`   | λ°°μ΄μ index μμΉμ μλ μμ κ°μ λ°νν©λλ€.                  |
| `E remove(int index` | λ°°μ΄μ index μμΉμ μλ μμ κ°μ μ κ±°νκ³  κ·Έ κ°μ λ°νν©λλ€. |
| `boolean isEmpty()`  | λ°°μ΄μ΄ λΉμ΄ μλμ§ νμΈν©λλ€.                                  |

<br>

```java
    ArrayList<String> list = new ArrayList<String>();
```

- `<String>`μ μ΄λ ν ν΄λμ€λ₯Ό λ°°μ΄μ μμλ‘ μ¬μ©ν  μ§ μ§μ 

<br>

```java
    ArrayList<String> list = new ArrayList<String>();

    list.add("aaa");
	list.add("bbb");
	list.add("ccc");

	for(int i = 0; i < list.size(); i++) {
		String str = list.get(i);
		System.out.println(str);
	}

	for( String s : list) {
		System.out.println(s);
	}
```

<br>

```java
    ArrayList list = new ArrayList();
```

- λ¬΄μμ μΈ κ²μΈμ§ μ ν΄μΌλ¨, for λ¬Έμ μ€λ₯ λ°μ

```java
    ArrayList list = new ArrayList();

    list.add("aaa");
	list.add("bbb");
	list.add("ccc");

	for(int i = 0; i < list.size(); i++) {
		String str = (String)list.get(i);
		System.out.println(str);
	}

	for( Object s : list) {
		System.out.println(s);
	}
```

- ArrayListμ μμ±μμμ Stringμ μ§μ νμ§ μμΌλ©΄ μ€λ₯ λ°μ

- `String str = (String)list.get(i);` => String νμ μ μ΄μ€μΌν¨

- `for( Object s : list)` => λ°νμ΄ objectλ‘ λλλ°, objectλ λͺ¨λ  ν΄λμ€μ μ΅μμ ν΄λμ€μ΄μ, Stringμ μ§μ νμ§ μμΌλ©΄ object ννλ‘ λ€μ΄κ°

- λ°λΌμ, ArrayList μ¬μ© μ μ΄λ€ νμμ κ°μ²΄λ‘ λ°°μ΄μ λ§λ€ κ²μΈμ§ μ§μ νλ κ²μ΄ λ°λμ§

<br>

### 3. νμμ μκ°κ³Όλͺ© νμ  μΆλ ₯νκΈ°

- Heo νμμ λ κ³Όλͺ©μ μκ°νκ³ , Kim νμμ μΈ κ³Όλͺ©μ μκ°ν©λλ€. κ° νμμ νμ κ³Ό μ΄μ μ λ€μκ³Ό κ°μ΄ μΆλ ₯ν΄λ΄μλ€. Student ν΄λμ€μ ArrayList λ©€λ²λ³μλ₯Ό νλ κ°μ§κ³  κ° νμμ΄ μκ°νλ κ³Όλͺ©μ κ΄λ¦¬νλλ‘ ν©λλ€.

<br>

- κ³Όλͺ©μ΄ λλ `Subject`ν΄λμ€λ₯Ό λ§λ€κ³ , `Student` ν΄λμ€ λ΄μ `subjectList`λ₯Ό λ°°μ΄λ‘ μ μ§, Subjectκ° μΆκ° λ  μ μλλ‘ addSubject λ©μλ μ κ³΅

- μ μ²΄ μ λ³΄λ₯Ό λ³Ό μ μλ showStudentInfo() μ κ³΅

<br>

```java
	Student studentHeo = new Student(1001, "Heo");

	studentHeo.addSubject("κ΅­μ΄", 100);
	studentHeo.addSubject("μν", 100);

	Student studentKim = new Student(1002, "Kim");

	studentKim.addSubject("κ΅­μ΄", 95);
	studentKim.addSubject("μν", 90);
	studentKim.addSubject("μμ΄", 80);

	studentHeo.showStudentInfo();
	System.out.println("=================================");
	studentKim.showStudentInfo();
```

<br>

## π Eclipse μ€μ΅

![day13](https://user-images.githubusercontent.com/79084294/183613243-d2a14a90-390e-4db9-bb48-4f500f0232f3.png)

<br>

## π Eclipse μΆλ ₯ Console

![day13_console1](https://user-images.githubusercontent.com/79084294/183613259-25d24557-0298-4df7-a600-738618bafd8e.png)

![day13_console2](https://user-images.githubusercontent.com/79084294/183613297-03259e22-7a66-4385-80e0-fa064513d6e6.png)

![day13_console3](https://user-images.githubusercontent.com/79084294/183613303-48e5a647-e8b0-4f76-9983-4ed4903c0935.png)
