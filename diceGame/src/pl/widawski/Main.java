package pl.widawski;

public class Main {

	public static void main(String[] args) {
		
		Player pierwszy = new Player("pierwszy");
		Player drugi = new Player("drugi");
		Game gameStart = new Game();
		gameStart.doGame(pierwszy, drugi);

	}

}
