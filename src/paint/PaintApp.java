package paint;

public class PaintApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1= new Point();
		p1.setX(100);
		p1.setY(200);
		p1.show();
		
		Point p2= new Point();
		p2.setX(10);
		p2.setY(23);
		p2.show();
		
		Point pt2= new Point(50,100);
		pt2.show();
		
		p1.show(false);
		p2.show(false);
	}

}
