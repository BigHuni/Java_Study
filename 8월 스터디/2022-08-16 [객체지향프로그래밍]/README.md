# ๐ Java Study

## ๐ธ 2022-08-16 ํ์์ผ

## [์ถ์ ํด๋์ค ์์ฉ]

### 1. ํํ๋ฆฟ ๋ฉ์๋ ํ์ฉํ๊ธฐ

- ์์  : Player ๊ฐ ์๊ณ , ์ด Player๊ฐ ๊ฒ์์ ํฉ๋๋ค. ๊ฒ์์์ Player๊ฐ ๊ฐ์ง๋ ๋ ๋ฒจ์ ๋ฐ๋ผ run(), jump(), turn() ์ธ๊ฐ์ง ๊ธฐ๋ฅ์ ํ  ์ ์์ต๋๋ค. ๊ฐ ๋ ๋ฒจ์ ๋ฐ๋ผ ๊ธฐ๋ฅ ๊ฐ๋ฅ
  ์ฌ๋ถ๊ฐ ๋ค์๊ณผ ๊ฐ์ต๋๋ค.

    - ์ด๋ณด์ ๋ ๋ฒจ : ์ฒ์ฒํ ๋ฌ๋ฆฝ๋๋ค. {run()} ๊ฐ๋ฅ
    - ์ค๊ธ์ ๋ ๋ฒจ : ๋น ๋ฅด๊ฒ ๋ฌ๋ฆฌ๊ณ  {run()} ๊ฐ๋ฅ, ์ ํ{jump()} ๊ฐ๋ฅ
    - ๊ณ ๊ธ์ ๋ ๋ฒจ : ์ฒ์ฒํ ๋ฌ๋ฆฝ๋๋ค. {run()} ๊ฐ๋ฅ, ์ ํ{jump()} ๊ฐ๋ฅ, ํ ๋ฐํด ๋ ์ ์์ต๋๋ค. {turn()} ๊ฐ๋ฅ

    - ํ๋ ์ด์ด๋ go() ๋ช๋ น์ด๋ฅผ ๋ฐ์ผ๋ฉด ์ด ์ธ๊ฐ์ง ๊ธฐ๋ฅ์ ์ํํฉ๋๋ค. ์ด ์ค ํ  ์ ์๋ ๊ฒ์ ํ  ์ ์๋ค๋ ๋ฉ์์ง๋ฅผ ๋ณด๋๋๋ค.

  <br>

- PlayerLevel ํด๋์ค(์ถ์) - ์์ ํด๋์ค

```java
  public abstract class PlayerLevel {

    public abstract void run();

    public abstract void jump();

    public abstract void turn();

    public abstract void showLevelMessage();

    final public void go(int count) {
        run();

        for (int i = 0; i < count; i++) {
            jump();
        }

        turn();
    }
}
```

<br>

- ๊ทธ ๋ฐ์ ์์ ๋ฐ์ BeginnerLevel, AdvancedLevel, SuperLevel ํด๋์ค ์์ฑ

```java
  public class BeginnerLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("์ฒ์ฒํ ๋ฌ๋ฆฝ๋๋ค.");
    }

    @Override
    public void jump() {
        System.out.println("jump ๋ชปํ์ง๋กฑ");
    }

    @Override
    public void turn() {
        System.out.println("turn ๋ชปํ์ง๋กฑ");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** ์ด๊ธ์ ๋ ๋ฒจ์๋๋ค. ******");
    }
}
```

<br>

- Player ํด๋์ค์ ์๋์ฒ๋ผ ๋ณ์ ์ ์ธ์ ํ๋ฉด ๊ฐ์ฒด์งํฅํ๋ก๊ทธ๋๋ฐ(OOP)์ด ์๋
- `BeginnerLevel blevel;`
- `AdvancedLevel alevel;`
- `SuperLevel slevel;`

<br>

- Player๊ฐ PlayerLevel์ go()๋ฅผ ๋ถ๋ ์ ๋, run(), jump()๋ฅผ ์ด๋ป๊ฒ ๋ถ๋ฅผ์ง ๋๊ฐ
- ๊ทธ ๋๋ง๋ค ๋ฐ๋ก ์ฝ๋ฉํด์ผ ํจ

<br>

- `PlayerLevel level;`
- ์ด๋ ๊ฒ ์ ์ธํ๊ฒ ๋๋ฉด ์ด level ๋ณ์์ BeginnerLevel, AdvancedLevel, SuperLevel๋ ๋ค์ด์ฌ ์ ์๊ฒ ๋จ
- PlayerLevel์ ์์๋ฐ๊ฒ ๋ ๋ชจ๋  ํด๋์ค๋ฅผ `level` ๋ณ์์ ๋์์ด ๊ฐ๋ฅํ๊ฒ ๋จ
- if ๋ฌธ์ ์ฌ๋ฌ ๊ฐ ๋ง๋๋ ๊ฒ์ด ์๋๋ผ ๊ฐ ๋ฉ์๋๋ค์ `๋คํ์ฑ`์ ์ํด ์ธ์คํด์ค์ ๊ฒ์ด ํธ์ถํ๊ฒ ๋จ
- ๋ง์ฝ, ์ฌ๊ธฐ์ ๋ค๋ฅธ ๋ ๋ฒจ์ ๋ฑ๊ธ์ ์์ฑํ๊ณ  ์ถ๋ค๋ฉด ํด๋์ค ์ถ๊ฐํด์ ์์๋ฐ์ผ๋ฉด ๋จ

<br>

- UltraSuperLevel ํด๋์ค ์์ฑ

```java
  public class UltraSuperLevel extends PlayerLevel {

    @Override
    public void run() {
    }

    @Override
    public void jump() {
    }

    @Override
    public void turn() {
    }

    @Override
    public void showLevelMessage() {
    }
}
```

<br>

## ๐ Eclipse ์ค์ต

![day21](https://user-images.githubusercontent.com/79084294/185158352-e68b2671-5f74-488e-a2c8-d56710443002.png)

<br>

## ๐ Eclipse ์ถ๋ ฅ Console

![day21_console1](https://user-images.githubusercontent.com/79084294/185158363-a07ec723-9895-4e7f-ad91-9e42298018e3.png)
