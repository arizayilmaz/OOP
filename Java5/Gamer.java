package Game;

import java.util.Scanner;

enum Handsign{
	ROCK,
	SCISSOR,
	PAPER,
}

public class Gamer {
	static int numofDraw;
	static int numofTrials;
	int numofWin;
	String name;
	Handsign sign;
	
	
	public  Gamer(String name) {
		
		this.name=name;
		
	}
	void move() {
		if(GameArena.isGameOver) return;
		
		boolean inputInvalid = false;
		Scanner input = new Scanner(System.in);
			
			
		do{
			char userChoice=input.next().charAt(0); 
				inputInvalid=false;
		
			switch(userChoice) {
				
					case 's':
						this.sign=Handsign.SCISSOR;
						break;
			
					case 'r':
						this.sign=Handsign.ROCK;
						break;
				
					case 'p':
						this.sign=Handsign.PAPER;
						break;
				
					case 'q':
						GameArena.isGameOver=true;
						break;
				
					default:
						inputInvalid =true;
						break;
			
			}
		}
		while(inputInvalid);
				System.out.println(this.name + " 's " +sign);
				
	}
}
		
	


