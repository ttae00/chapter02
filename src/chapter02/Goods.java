package chapter02;

public class Goods {
	
	private String name;
	protected int price;
	public int countStock;
	
	//default접근제어(public이나 protected, private로 접근지시자를 명시하지 않은 경우
	int countSold;
	
	String getName(){
		return name;
	}
	void discount(int percentage){
		price= price - (price * percentage);
	}
	
}
