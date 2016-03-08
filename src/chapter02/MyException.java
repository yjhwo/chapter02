package chapter02;

// 예외의 최상위 클래스인 Exception 클래스를 상속받아 새로운 예외를 정의할 수 있음
// 일반적으로 생성자만 구현

public class MyException extends Exception{
	public MyException(){
		super("MyException");
	}
	
	public MyException(String msg){
		super(msg);
	}
}
