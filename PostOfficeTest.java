package OOP4_L;
import java.util.Scanner;
public class PostOfficeTest {
	public static void main(String[] args) {
		Post post = new Post("myPost","Istanbul","Ankara");
		
		PostOffice po1 = new PostOffice("ıstanbul Sultanbeyli POST OFFICE");
		PostOffice po2 = new PostOffice("ANKARA CANKAYA POST OFFICE");
		
		po1.send(post);
		po2.receive(post);
	
		
	}

}
