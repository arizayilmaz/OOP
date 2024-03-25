package Game;

public class RockScissorPaper {
	public static void main(String[] args) {
		Gamer g1 = new Gamer("Gamer 1");
		Gamer g2 = new Gamer("Gamer 2");
		GameArena gameArena = new GameArena();
		gameArena.addGamers(g1,g2);
		gameArena.startGame();
	}

}
