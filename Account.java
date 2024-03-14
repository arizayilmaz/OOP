package OOP2Lab;
import java.util.Scanner;
public class Account {
	private double balance;
	private String ownerName;
	
	public void add(double amount) 
	{
		balance += amount;
	}
	public void withdraw(double amount) 
	{
		Scanner sc = new Scanner(System.in);
		String password ="1234";
		
		for(int i=1;i<=4;i++) 
		{ if(i==4) 
		{
			System.out.println("Hesabını engellendi!");
				break;
		}else {
			System.out.println("Please enter the 4-digit pass");
			
			if(password.equals(sc.next())) 
			{
			balance -= amount;
			}else
			System.out.println("Wrong pass");
			
			}
		}
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setOwnerName(String name) 
	{
		this.ownerName = name;
	}
	public String getOwnerName() {
		return ownerName;
	}

}
