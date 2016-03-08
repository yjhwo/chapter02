package chapter02;

import java.io.IOException;

public class ThrowsText {
	
	public void dangerousMethod() throws Exception{
		System.out.println("예외 발생 전");
		
		if(true){
//			throw new IOException();	// 강제로 예외 발생
			throw new MyException("this is MyException Test");
		}
		
		System.out.println("예외 발생 후");
	}
}
