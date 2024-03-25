package OOP5;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(100,200);
		Rectangle rect3 = new Rectangle(-10,10,100,200);
		
		rect1.displayInfo();
		rect2.displayInfo();
		rect3.displayInfo();
	}

}
