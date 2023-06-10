package gameOfWar;


public class App {

	public static void main(String[] args) {

		//Instantiating a new deck and 2 players
		Deck playingDeck = new Deck();
		Player player1 = new Player("Sam");
		Player player2 = new Player("Jim");
		
		// Calling Shuffle Method
		playingDeck.shuffle();
		
		// Drawing all cards for each player
		for(int i = 1; i <= 52; i++) {
			if(i % 2 != 0) {
				player1.draw(playingDeck);
			} else {
				player2.draw(playingDeck);
			}
		}
		/*
		// Flipping the cards for each player
		System.out.println("Player 1's Hand:");
		for(int j = 0; j <= 25; j++) {
			player1.flip(player1.hand, j);
		}
		System.out.println();
		System.out.println("Player 2's Hand:");
		for(int k = 0; k <= 25; k++) {
			player2.flip(player2.hand, k);
		}
		*/
		//Gameplay!
		for(int h = 0; h <= 25; h++) {
			System.out.println(player1.name + "'s Card:");
			player1.flip(player1.hand, h);
			System.out.println(player2.name + "'s Card:");
			player2.flip(player2.hand, h);
			if(player1.hand.get(h).value > player2.hand.get(h).value) {
				System.out.println(player1.name + "'s Card is higher!");
				System.out.println(player1.name + " gets a point!");
				player1.incrementScore(player1.score);
				System.out.println("Current Scores: ");
				System.out.println(player1.name + ": " + player1.score);
				System.out.println(player2.name + ": " + player2.score);
				System.out.println();
			} else if(player1.hand.get(h).value < player2.hand.get(h).value) {
				System.out.println(player2.name + "'s Card is higher!");
				System.out.println(player2.name + " gets a point!");
				player2.incrementScore(player2.score);
				System.out.println("Current Scores: ");
				System.out.println(player1.name + ": " + player1.score);
				System.out.println(player2.name + ": " + player2.score);
				System.out.println();
			} else {
				System.out.println("It's a tie!");
				System.out.println("Current Scores: ");
				System.out.println(player1.name + ": " + player1.score);
				System.out.println(player2.name + ": " + player2.score);
				System.out.println();
			}
		}
		
		// Final Scoring and announcing winner
		System.out.println("Final Scores: ");
		System.out.println(player1.name + ": " + player1.score);
		System.out.println(player2.name + ": " + player2.score);
		System.out.println();
		
		if(player1.score > player2.score) {
			System.out.println(player1.name + " wins!");
		} else if(player1.score < player2.score) {
			System.out.println(player2.name + " wins!");
		} else {
			System.out.println("It's a draw!");
		}
	
	}

}
