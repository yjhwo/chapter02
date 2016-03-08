package chapter02;

public class Student extends Person {
	
	public Student(){
		System.out.println("Student() called");
	}
	public Student(int i){
		System.out.println("Student(i) called");
	}
	
	public void showInfo(){
		age = 30;
		name = "둘리";
		height  = 150;
		//weight = 30;
		//protected 이상은 다 접근 가능
	}
}
