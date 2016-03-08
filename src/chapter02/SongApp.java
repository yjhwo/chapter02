package chapter02;

public class SongApp {

	public static void main(String[] args) {
		
		Song s = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
		s.show();
		
		Song s2 = new Song("이사랑", "다비치");
		s2.show();
		Song s3 = new Song("always", "윤미래");
		s3.show();
	}

}
