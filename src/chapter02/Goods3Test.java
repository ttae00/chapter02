package chapter02;

public class Goods3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods3 g1= new Goods3();
		g1.setName("nikon");
		g1.setPrice(1000000);
		g1.setCountStock(10);
		g1.setCountSold(100);

		//위의 코드 대신에 다음 생성자로 객체를 생성하면 초기화
		Goods3 g2 = new Goods3("nikon",100000,10,100);
		
		System.out.println(g1.toString());
		System.out.println(g2.toString());	
	}

}
