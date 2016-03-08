package com.estsoft.chapter02.car;

public class CarTest {

	public static void main(String[] args) {
//		Car c1 = new Car();
//		Car c2 = new Car();
//		Car c3 = new Car();
//		Car c4 = new Car();
	
		
		// 이렇게 인스턴스를 많이 생성 못하게 하도록 private로 하는 것
		// 외부에서 받을 경우 getInstance()로만 받아야 한다.
		Car c = Car.getInstance();
		Car c1 = Car.getInstance();
		Car c2 = Car.getInstance();
		Car c3 = Car.getInstance();
		Car c4 = Car.getInstance();
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
// 싱글톤 패턴