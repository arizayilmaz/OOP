package OOP3;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) 
	{
		try {
//		int a = 50/0;
//		System.out.println(a);
		Scanner input = new Scanner(System.in);
		input.nextInt();
		}
		catch (InputMismatchException ex) 
		{
			System.out.println(ex.getMessage());
			System.out.println("Expected in put is int");
		}
		catch(Exception ex) 
		{
		System.out.println(ex.getMessage());
		}
		finally {
			System.out.print("done");
		}
		
	}

}
