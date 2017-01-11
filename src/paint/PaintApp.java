package paint;

public class PaintApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1= new Point();
		p1.setX(100);
		p1.setY(200);
		Point pt2= new Point(50,100);
		Point cp= new ColorPoint(500,500,"red");
	
		Rectangle rec= new Rectangle();
		Circle circle= new Circle();
		Triangle tri = new Triangle();
		
		draw(p1);
		draw(pt2);
		draw(cp);
		
	/*	drawRectangle(rec);
		drawCircle(circle);*/
		draw(circle);
		draw(rec);
		draw(tri);
	}
	


//	public static void drawPoint(Point point){
//		point.show();
//	}
	
	public static void draw(Drawable drawable){
		drawable.draw();
	}
//	
//	public static void drawShape(Shape shape){
//		
//	}
	
	public static void drawRectangle(Rectangle rec){
		rec.draw();
	}
	
	public static void drawCircle(Circle circle){
		circle.draw();
	}
}
