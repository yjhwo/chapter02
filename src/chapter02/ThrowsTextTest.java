package chapter02;

public class ThrowsTextTest {

	public static void main(String[] args) {
		ThrowsText test = new ThrowsText();

		try {
			test.dangerousMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
