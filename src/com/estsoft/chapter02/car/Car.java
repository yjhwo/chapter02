package com.estsoft.chapter02.car;

public class Car {
	private int speed;
	private String name;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + speed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}

	
	private Car(){ }
	
	private static Car instance = null;	// 자기 자신만 접근 가능!★
	
	public static Car getInstance(){
		if(instance == null){
			instance = new Car();
		}
		return instance;
	}
	
}
/*
 * Singleton Pattern
 * - 인스턴스는 하나로 제한을 둔다.
 * 	  즉, 객체를 딱 한번만 생성 가능하게끔 하는 것
 *   static 변수는 선언만 하면 끝이지만 클래스는 static으로 선언하지 못하기 때문에
 *   static 개념(공유)으로 사용할 수 있도록 하는 것. 
 *   
 *   한번은 생성해야 하기 때문에 class 자체는 public이지만
 *   객체 생성할 때 실행되는 생성자는 private로 접근을 막고,
 *   다른 public 메소드를 통해 접근하는 것.
 */
