package OOP2;

public class mainAccount {
	public static void main(String[] args)
	{
		Account acc = new Account("Jack",100);
		acc.deposit(50);
		System.out.println(acc.getBalance());
		acc.setBalance(100);
		System.out.println(acc.getBalance());
	}

}
