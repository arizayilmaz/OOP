package OOP2;
import java.util.Scanner;

public class Account 
{
	private String name;
	private double balance;
	
	public Account(String name, double balance) 
	{
		this.name = name;
		this.balance = balance;
	}
	public void deposit(double balance) 
	{
		this.balance+=balance;
	}
	public double getBalance()
	{	// private olan balanceyi method ile görüntülüyorum.
		return balance;
	}
	public void setBalance(double amount)
	{
		String sifre ="1234";
		System.out.println("please enter the password");
		Scanner kullaniciGiris = new Scanner(System.in);
		if (sifre.equals(kullaniciGiris.next()))
			{
				if(amount<=this.balance) 
				{
				this.balance -= amount;
				}
					
			}
		
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

}
