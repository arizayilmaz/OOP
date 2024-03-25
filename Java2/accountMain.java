package OOP2Lab;

public class accountMain {
	public static void main (String[] args) {
		Account acc = new Account();
		acc.add(100);
		System.out.println(acc.getBalance());
		acc.withdraw(50);
		System.out.println(acc.getBalance());
	}

}
