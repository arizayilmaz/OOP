package Game;

public class GameArena {
	static boolean isGameOver;
	Gamer gamer1,gamer2;
	
	 void addGamers(Gamer g1,Gamer g2) {
		this.gamer1 = g1;
		this.gamer2 = g2;
		
	}
	public void startGame() {
		while(!isGameOver) {
			gamer1.move();
			gamer2.move();
			processMoves();
		}
			displayScores();		
		}
	
			void processMoves() {
				if(isGameOver) return;
				if(gamer1.sign == Handsign.PAPER && gamer2.sign == Handsign.ROCK) {
					gamer1.numofWin++;
					System.out.println(gamer1.name + "Wins!");
				}else if (gamer1.sign ==Handsign.ROCK && gamer2.sign == Handsign.SCISSOR) {
					gamer1.numofWin++;
					System.out.println(gamer1.name + "Wins!");
				}else if (gamer1.sign == Handsign.SCISSOR && gamer2.sign == Handsign.PAPER) {
					gamer1.numofWin++;
					System.out.println(gamer1.name + "Wins!");
				}else if(gamer1.sign == gamer2.sign) {
					Gamer.numofDraw++;
					System.out.println("Draws!");
				}
				else {
					gamer2.numofWin++;
					System.out.println(gamer2.name + "Wins!");
				}
				System.out.println(gamer1.name +" "+ gamer1.sign +" | "+gamer2.name +" "+ gamer2.sign);
				Gamer.numofTrials++;
		
	}
	
			private void displayScores() {
				System.out.printf("Name: %s Win: %d %n",gamer1.name,gamer1.numofWin);
				System.out.printf("Name: %s Win: %d %n",gamer2.name,gamer2.numofWin);
				System.out.printf("Trials :%s Draws: %d %n",Gamer.numofTrials,Gamer.numofDraw);
				
		
	}
	
}
