package chapter02;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Student(10);
		
		// upcasting
		Student s = new Student();
		Person p2 = s;

		
		// DownCasting
		Person p3= new Student();
//		Student s2 = (Student)p3;
//		s2.showInfo();
		
		((Student)p3).showInfo();
	}

}
