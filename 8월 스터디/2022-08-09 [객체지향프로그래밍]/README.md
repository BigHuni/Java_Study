# ๐ Java Study

## ๐ธ 2022-08-09 ํ์์ผ

## [๋ฐฐ์ด๊ณผ ArrayList]

### 1. ์ฝ๋ฉ ๋ฌธ์  ํ๊ธฐ(ArrayList๋ฅผ ํ์ฉํ ์์ฉ ํ๋ก๊ทธ๋จ)

- ์ด๋ ํ๊ต์ ํ์์ด 3๋ช ์์ต๋๋ค. ๊ฐ ํ์๋ง๋ค ์ฝ์ ์ฑ์ ๊ธฐ๋กํ๊ณ  ์์ต๋๋ค. Student ํด๋์ค๋ฅผ ๋ง๋ค๊ณ  ๊ฐ ํ์๋ง๋ค ์ฝ์ ์ฑ์ Student ํด๋์ค๋ด์ ArrayList๋ฅผ ์์ฑํ์ฌ ๊ด๋ฆฌํ๋๋ก ํฉ๋๋ค. ๋ค์๊ณผ ๊ฐ์ด ์ถ๋ ฅ ๋๋๋ก Student, Book, StudentTest ํด๋์ค๋ฅผ ๋ง๋ค์ด ์คํํ์ธ์.

```
    Heo ํ์์ด ์ฝ์ ์ฑ์ : ํ๋ฐฑ์ฐ๋งฅ1 ํ๋ฐฑ์ฐ๋งฅ2 ์๋๋ค.
    Kim ํ์์ด ์ฝ์ ์ฑ์ : ํ ์ง1 ํ ์ง2 ํ ์ง3 ์๋๋ค.
    Cho ํ์์ด ์ฝ์ ์ฑ์ : ํด๋ฆฌํฌํฐ1 ํด๋ฆฌํฌํฐ2 ํด๋ฆฌํฌํฐ3 ํด๋ฆฌํฌํฐ4 ํด๋ฆฌํฌํฐ5 ํด๋ฆฌํฌํฐ 6 ์๋๋ค.
```

<br>

1. Book ํด๋์ค

```java
    public class Book {

	private String bookName;
	private String author;

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
```

- Book ํด๋์ค ์์ฑ ํ private๋ก bookName๊ณผ author์ String ์ ์ธ

- Book ๋ฉ์๋๋ก ์ธ์คํด์ค bookName๊ณผ author์ ๋ฐ๋๋ก ํจ

- ์ดํ source์์ getter, setter ์ถ๊ฐ

<br>

2. Student ํด๋์ค

```java
    import java.util.ArrayList;

    public class Student {

	int studentID;
	String studentName;
	ArrayList<Book> bookList;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		bookList = new ArrayList<Book>();
	}

	public void addBook(String bookName, String author) {
		Book book = new Book(bookName, author);

		bookList.add(book);
	}

	public void showStudentInfo() {

		System.out.print(studentName + " ํ์์ด ์ฝ์ ์ฑ์ : ");

		for(Book book : bookList) {
			System.out.print(book.getBookName() + " ");
		}

		System.out.println("์๋๋ค.");
	}
```

- ArrayList๋ฅผ ์ฌ์ฉํ๊ธฐ ์ํด import ์ถ๊ฐ

- studentID, studentName ์ ์ธํ๊ณ , `ArrayList<Book> bookList` ์ฌ์ฉ

- ์ฑ์ ์ถ๊ฐํ๋ addBook ๋ฉ์๋์ bookName๊ณผ author์ ๋ฐ๋๋ก ํจ

- addbook ๋ฉ์๋๋ฅผ ์ฌ์ฉํ๋ฉด ์ฑ ์ถ๊ฐ

- showStudentInfo ๋ฉ์๋๋ ์ถ๋ ฅ ๊ตฌ๋ฌธ์ ์ํ

- for ๋ฌธ์์ bookList์ ์กด์ฌํ๋ ๊ฐ์๋งํผ ์ํ

<br>

3. StudentTest ํด๋์ค

```java
    public static void main(String[] args) {
		Student studentHeo = new Student(1001, "Heo");

		studentHeo.addBook("ํ๋ฐฑ์ฐ๋งฅ1", "์กฐ์ ๋");
		studentHeo.addBook("ํ๋ฐฑ์ฐ๋งฅ2", "์กฐ์ ๋");

		Student studentKim = new Student(1001, "Kim");

		studentKim.addBook("ํ ์ง1", "๋ฐ๊ฒฝ๋ฆฌ");
		studentKim.addBook("ํ ์ง2", "๋ฐ๊ฒฝ๋ฆฌ");
		studentKim.addBook("ํ ์ง3", "๋ฐ๊ฒฝ๋ฆฌ");

		Student studentCho = new Student(1001, "Cho");

		studentCho.addBook("ํด๋ฆฌํฌํฐ1", "์กฐ์ค ๋กค๋ง");
		studentCho.addBook("ํด๋ฆฌํฌํฐ2", "์กฐ์ค ๋กค๋ง");
		studentCho.addBook("ํด๋ฆฌํฌํฐ3", "์กฐ์ค ๋กค๋ง");
		studentCho.addBook("ํด๋ฆฌํฌํฐ4", "์กฐ์ค ๋กค๋ง");
		studentCho.addBook("ํด๋ฆฌํฌํฐ5", "์กฐ์ค ๋กค๋ง");
		studentCho.addBook("ํด๋ฆฌํฌํฐ6", "์กฐ์ค ๋กค๋ง");

		studentHeo.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
	}
```

- ๊ฐ ํ์์ด ์ฝ์ ์ฑ์ ๋ฆฌ์คํธ(bookName, author) ์๋ ฅ

- showStudentInfo() ๋ฉ์๋๋ก ์ถ๋ ฅ

<br>

## ๐ Eclipse ์ค์ต

![day14](https://user-images.githubusercontent.com/79084294/183700424-37e16c4a-16ea-46de-af9f-28ed901a9adf.png)

<br>

## ๐ Eclipse ์ถ๋ ฅ Console

![day14_console1](https://user-images.githubusercontent.com/79084294/183700438-aec218f5-c106-4db4-bccd-e4c3bd817497.png)
