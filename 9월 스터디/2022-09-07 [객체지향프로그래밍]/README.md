## πΈ 2022-09-07 μμμΌ

## [κ°μ²΄μ§ν₯νλ‘κ·Έλλ°]

### 1. Object ν΄λμ€

- reflection νλ‘κ·Έλλ°
    - Class ν΄λμ€λ‘λΆν° κ°μ²΄μ μ λ³΄λ₯Ό κ°μ Έμ νλ‘κ·Έλλ°νλ λ°©μ => λ‘μ»¬μ λ°μ΄ν° νμμ΄ μλ€λ©΄, κ΅³μ΄ μ΄λ κ² μ¬μ©νμ§λ μμ, λ‘μ»¬μ κ°μ²΄κ° μκ±°λ μλ£νμ μ μ μλ μλ£νμ΄ μμ κ²½μ° μ λ°©μ
      μ¬μ©
    - λ‘μ»¬μ κ°μ²΄κ° μκ³ , μλ£νμ μ μ μλ κ²½μ° μ μ©ν νλ‘κ·Έλλ°
    - `java.lang.reflect` ν¨ν€μ§μ μλ ν΄λμ€ νμ©

<br>

- newInstance() λ©μλ
    - Class ν΄λμ€ λ©μλ
    - new ν€μλλ₯Ό μ¬μ©νμ§ μκ³  μΈμ€ν΄μ€λ₯Ό μμ±

<br>

- `Class c3 = Class.forName("java.lang.String");` => ν΄λμ€ μ λ³΄λ₯Ό κ°μ Έμ΄
- Constructorλ‘ μ΄λ€ κ²μ κ°μ§κ³  μλμ§ νμΈ

```
  Constructor[] cons = c3.getConstructors();
    for(Constructor con: cons) {
      System.out.println(con);
    }
```

- `getConstructors()`λ‘ array λ°ν
- for λ¬ΈμΌλ‘ μ μ²΄ λ²μ μ€μ 
- array μμ μλ λͺ¨λ  Constructor μΆλ ₯

## π λͺ¨λ  Constructor λ°ν μΆλ ₯

![constructor_print](https://user-images.githubusercontent.com/79084294/189108047-583237bb-4f81-4614-8fb7-5b0589b00b67.png)

<br>

- μλ° Stringκ³Ό κ΄λ ¨λ λͺ¨λ  Constructor μΆλ ₯
- νμ§λ§, Stringμ μκ³  μμ΄μ `String str = new String();`λ‘ μ°μ΄ μ¬μ©ν  λ©μλκ° λͺ¨λ λ³΄μ΄λλ° μ λ°©μμ²λΌ κ΅³μ΄ κ°μ Έμ€μ§ μμ
- λ°λΌμ λ°μ΄ν° νμμ λν μ λ³΄λ₯Ό μ λͺ¨λ₯΄κ±°λ λ‘μ»¬μ μμ§ μμ κ²½μ°μ μ¬μ©

<br>

- Methods νμΈ => `Method[] methods = c3.getMethods();` - reflect ν¨ν€μ§ μ

```
  Method[] methods = c3.getMethods();
    for(Method method : methods) {
		System.out.println(method);
	}
```

## π λͺ¨λ  Method λ°ν μΆλ ₯

![method_print](https://user-images.githubusercontent.com/79084294/189119401-26aaa918-f6cb-4062-8f53-28c6379d38aa.png)

<br>

- Class ν΄λμ€μμ μ μ¬ν λ΄λ¬μΌνλ λΆλΆμ `Class.forName()`μΌλ‘ λμ  λ‘λ©νλ λΆλΆ
- λ€λ₯Έ μΈμ΄λ€λ§λ€ λμ  λ‘λ©νλ λ°©μμ΄ μ‘΄μ¬
- StaticμΌλ‘ μ»΄νμΌ λ λ°μΈλ©λλ λ°©λ², λ°νμ μ μ νν΄μ μ¬μ©νλ λ°©λ²μ΄ μΈμ΄λ€λ§λ€ μ‘΄μ¬

<br>

```
  Person person = new Person("James");
		System.out.println(person);		
  Class c1 = Class.forName("classex.Person");
```

- `Class.forName`μΌλ‘ κ°κ³  μλλ°, μ΄ Classλ‘λΆν° Constructorλ₯Ό κ°μ Έμ¬ μ μμ
- `Person person1 = c1.newInstance();` => newInstance()λ μΈμ€ν΄μ€λ₯Ό μμ±ν΄μ£Όλλ°, personμ default Constructorλ₯Ό νΈμΆν¨
- `personμ default Constructor` => Person.javaμ `public Person() {};`
- λ¦¬ν΄ νμμ΄ Objectμ΄λ―λ‘ `Person person1 = (Person)c1.newInstance();` λ€μ΄ μΊμ€νμ ν΄μ£Όκ³ , μμ±μ΄ λμ§ μλλ€λ©΄ Exception λ°μν  κ²μ

```
  Person person = new Person("James");
        System.out.println(person);          // James
		
  Class c1 = Class.forName("classex.Person");
  Person person1 = (Person)c1.newInstance();
        System.out.println(person1);         // null  => toString()μμ return name; μΈλ° μ΄λ¦μ μ μ΄μ£Όμ§ μμ null
```

```
  public Person(String name, int age) {
        this.name = name;
        this.age = age;
  }
```

- μ΄λ¦μ λ£λ Constructor μμ±νκΈ°
- newInstance()λ‘ κ·Έλ₯ νΈμΆνλ κ²μ΄ μλλΌ Constructorλ₯Ό μΌλ¨ κ°μ ΈμμΌν¨
- Constructorμ String νλλ₯Ό κ°μ Έμ΄
- μμΈμ²λ¦¬ μΆκ°

```
  Class[] parameterTypes = {String.class};
  Constructor cons = c1.getConstructor(parameterTypes);
```

<br>

- μ΄ Constructorλ‘λΆν° newInstance()μμ κ°μ²΄λ₯Ό μμ±ν  μ μκ² λ¨

```
  Object[] initargs = {"κΉμ μ "};
  Person personLee = (Person)cons.newInstance(initargs);
  System.out.println(personLee);             // κΉμ μ 
```

- λ§μ½, λ§€κ° λ³μλ‘ λ κ°λ₯Ό κ°μ Έμλ€λ©΄, λ κ° κ°μ λ£μ΄μΌν¨
- `Person personLee = (Person)cons.newInstance(initargs);`λ‘ μμ±
- λ°ν κ°μ΄ Objectμ΄λ―λ‘ PersonμΌλ‘ λ€μ΄ μΊμ€ν
- μμΈμ²λ¦¬ μΆκ°

<br>

- default Constructor

```
  Class c1 = Class.forName("classex.Person");
  Person person1 = (Person)c1.newInstance();
  System.out.println(person1);
```

- λ§€κ° λ³μκ° μλ Constructor

```
  Class[] parameterTypes = {String.class};
  Constructor cons = c1.getConstructor(parameterTypes);
		
  Object[] initargs = {"κΉμ μ "};
  Person personLee = (Person)cons.newInstance(initargs);
  System.out.println(personLee);
```

- μμμ μΌλ‘ λ§€κ° λ³μκ° μλ Constructorλ₯Ό `Person person = new Person("James")` ν μ€λ‘ μμ±ν  μ μλλ°,
- μ μ½λμ²λΌ κΈΈκ² μμ±ν΄μ μ¬μ©ν  νμλ μμ
- λ‘μ»¬μ Person νμμ΄ μλ€λ©΄, κ°νΈνκ² new ν€μλ λ°©μμΌλ‘ μμ±νκ³ , λ‘μ»¬μμ Person νμμ μ¬μ©ν  μ μλ κ²½μλ μ λ°©μ μ¬μ©

<br>

- forName() λ©μλμ λμ  λ‘λ©
    - Class ν΄λμ€ static λ©μλ
    - λμ  λ‘λ© => μ»΄νμΌ μμ λ°μ΄ν° νμμ΄ λͺ¨λ binding λμ΄ μλ£νμ΄ λ‘λ©λλ κ², static lodingμ΄ μλλΌ μ€ν μ€μ λ°μ΄ν° νμμ μκ³  binding λλ λ°©μ
    - μ€ν μμ λ‘λ©λλ―λ‘ κ²½μ°μ λ°λΌ λ€λ₯Έ ν΄λμ€κ° μ¬μ©λ  μ μμ΄ μ μ©ν¨
    - μ»΄νμΌ νμμ μ²΄ν¬ν  μ μμΌλ―λ‘ ν΄λΉ λ¬Έμμ΄μ λν ν΄λμ€κ° μλ κ²½μ° μμΈ(CLassNotFoundException)μ΄ λ°μν  μ μμ

<br>

## π Eclipse μ€μ΅

![class_ex](https://user-images.githubusercontent.com/79084294/189127345-bcf1491e-35ad-46de-8f55-647f5dbb55fa.png)
