package OOP4;
enum Book{
	ALICE_HARIKALAR(150,"Lewis Carroll"),
	FARELER_VE_INSANLAR(1204,"John S."),
	SEFILLER(367,"Victor Hugo");
	
	int pageNumber;
	 private String Description;
	Book(int pageNumber, String desc)
	{
		this.pageNumber =pageNumber;
		this.Description = desc;
		
	}
	public String getDescription() {
		return Description;
	}
	
}
public class JavaEnumTest {
	Book book;
	public static void main(String[] args) {
		
		Book[] books = Book.values();
		
 		for(Book b: books)
			System.out.println(b + " :" + b.pageNumber + ", " + b.getDescription());
	}
	

}
