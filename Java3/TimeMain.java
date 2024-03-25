package OOP3;

public class TimeMain {
	public static void main(String[] args) 
	{
		try {
			Time1 time = new Time1(12,12,444);
			System.out.print(time.toString());
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
