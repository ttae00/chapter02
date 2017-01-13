package kr.ac.smu.paint.main;

import kr.ac.smu.paint.i.Drawable;
import kr.ac.smu.paint.i.Resizable;
import kr.ac.smu.paint.shape.Circle;
import kr.ac.smu.paint.shape.Rectangle;
import kr.ac.smu.paint.shape.Shape;

public class InstantceOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c= new Circle();
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);
		
		//에러
		//System.out.println(c instanceof Rectangle);
	
		Shape s= new Rectangle();
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Rectangle);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Resizable);
		
		//에러
		//System.out.println(s instanceof String);
		
		Drawable d= new Circle();
		System.out.println(d instanceof Drawable);
		System.out.println(d instanceof Shape);
		System.out.println(d instanceof Rectangle);
		
		//에러
		//System.out.println(d instanceof String);
	}

}
