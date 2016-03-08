package chapter02;

public class Swap {

	public static void main(String[] args) {
		//	call-by-value
		int i1 = 10;
		int i2 = 20;
		
		swap(i1, i2);
		System.out.println(i1+":"+i2);
		//	call-by-reference
		Value v1 = new Value();
		v1.setValue(10);
		
		Value v2 = new Value();
		v2.setValue(20);
		
		swap2(v1, v2);
		System.out.println(v1.getValue()+":"+v2.getValue());
	}
	/*
	 	값이 바뀌지 않음
	 	
	 */
	public static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void swap2(Value a, Value b){
		int temp = a.getValue();
		a.setValue(b.getValue());
		b.setValue(temp);
	}
	
}
