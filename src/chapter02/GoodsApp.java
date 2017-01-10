package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		
		
		//private은 외부에서 접근 x
		//camera.name="nikon";
		
		//protected는 같은 패키지에서 접근 가능
		camera.price=400000;
		
		//public은 외부에서 접근 가능
		camera.countSold=100;
		
		//default는 같은 패키지내에서 접근 가능
		camera.countStock=50;
				
		camera.getName();
	}

}
