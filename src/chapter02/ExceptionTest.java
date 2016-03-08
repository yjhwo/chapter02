package chapter02;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int a = 0;
		double b = 0;
		try{
			b = 100/a;	// ArithmeticException
			System.out.println("some more codes...");
		}catch(Exception e){
			System.out.println("error occurs : "+e);
		}finally{
            System.out.println("clean-up code"); 
		}
		

	}

}
