package pl.widawski;

import java.util.Random;

public class Game {

	private int roundNumber = 5;
	private int maxThrows = 10;
	private int dice1, dice2;
	Random generator = new Random();
	private int dicesSum, pointsSum;
	
	public void doGame(Player pierwszy, Player drugi) {
		
		System.out.println("New game");
		for(int i=1; i <= roundNumber ; i++) {
			System.out.println("Round number: " +i);
			doThrows(pierwszy);
			doThrows(drugi);
		}
		System.out.println("Player " + pierwszy.getName() + " points: " + pierwszy.getPoints());
		System.out.println("Player " + drugi.getName() + " points: " + drugi.getPoints());
		if (pierwszy.getPoints() < drugi.getPoints()) {
			System.out.println("The winner is first player.");
		} else {
			System.out.println("The winner is second player.");
		}
	}
		
	
	public void doThrows(Player activePlayer) {
		
			for(int j =1; j<= maxThrows; j++) {
				System.out.println("Throw number: " + j);
				System.out.println("Player " + activePlayer.getName() + " throws:");
				dice1 = generator.nextInt(6)+1;
				dice2 =  generator.nextInt(6)+1;
				System.out.println(dice1+ " and " +dice2);
				dicesSum = dice1 + dice2;
				if(j == 1 & dicesSum == 7 || j == 1 & dicesSum == 11 || dicesSum == 5) {
					pointsSum = 0;
					break;
				} else if(j == 1 & dicesSum == 2 || j == 1 & dicesSum == 12) {
					pointsSum = 12 * maxThrows;
					break;
				} else {
					pointsSum = activePlayer.getPoints() +(dice1 + dice2)/j;
				}
				activePlayer.setPoints(pointsSum);	
			}
		
	}
}
