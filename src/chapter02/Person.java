package chapter02;

public class Person {
	int age; 	// default
	public String name;
	protected int height;
	private int weight;
	
	public Person(){
		System.out.println("Person() called");
	}
	public Person(int i){
		System.out.println("Person(i) called");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
