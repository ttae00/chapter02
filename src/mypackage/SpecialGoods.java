package mypackage;

import chapter02.Goods;

public class SpecialGoods extends Goods {
	
	void test(){
		
		//private은 자식에서도 접근할 수 없다.
		//name= "canon";
		
		//protected는 자식에서 접근할 수 있다.
		price= 2000;
		
		//public은 자식에서도 접근 가능
		countStock=20;
	}
}
