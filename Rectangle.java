package OOP5;

public class Rectangle {
	private int x, y ;
	private int width, height;
	
//	public Rectangle() {
//		this.x = 0;
//		this.y = 0;
//		this.width  = 1;
//		this.height = 1;
//	}
	public Rectangle() 
	{
		this(0,0,1,1);
	}
	
//	public Rectangle(int width , int height) {
//		this.x = 0;
//		this.y = 0;
//		this.width  = width;
//		this.height = height;	
//	} 
	public Rectangle(int width, int height) 
	{
		this(0,0,width,height);
	}
	
	public Rectangle ( int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width  = width;
		this.height = height;
	}
	
	void displayInfo() {
		System.out.println("X:"+ this.x + " Y:" + this.y +" W:"+ this.width +" H:"+this.height);
	}

}
