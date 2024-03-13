package OOP1;
import java.util.Scanner;

public class OOP1_2 {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter an integer: ");
		int sayi = scanner.nextInt();
		System.out.println("Please enter an string");
		String string = scanner.next();
		
		System.out.println(sayi + string);
	}

}
