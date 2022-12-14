package object;

class Student {
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			return(this.studentNum == std.studentNum);
		}
		return false;
	}
}

public class EqualsTest {

	public static void main(String[] args) {

		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		Student	Shin = new Student(100, "이순신");
		
		System.out.println(Lee == Shin);       // false
		System.out.println(Lee.equals(Shin));  // false
	}

}
