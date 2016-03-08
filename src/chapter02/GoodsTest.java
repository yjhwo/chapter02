package chapter02;

public class GoodsTest {

	public static void main(String[] args) {
		
		Goods camera = new Goods("nikon",400000,30,50);
		System.out.println(camera);
		
		System.out.println(Goods.countOfGoods);
		
		Goods camera2 = new Goods();
		System.out.println(Goods.countOfGoods);
		
		Goods camera3 = new Goods();
		System.out.println(Goods.countOfGoods);
		
		
	}

}
