package OOP4_L;

public class PostOffice {
	String name;
	
	PostOffice (String name){
		this.name = name;
	}
	
	 void send(Post post) {
		System.out.printf("send : %s from %s to %s by %s %n",post.content,post.source,post.destination,this.name);
	}
	 void receive(Post post) {
		System.out.printf("receive : %s from %s to %s by %s",post.content,post.source,post.destination,this.name);
		 
	}

}
