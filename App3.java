package week06B;

public class App3 {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		Player player01 = new Player();
		Player player02 = new Player();
		Player tie = new Player();
		
		// divide the deck among the two players 
		for(int i = 0; i < 26; i++) {
			player01.getHand().add(deck.pullCard());
			player02.getHand().add(deck.pullCard());

		}
		for(int j = 0; j<26; j++) {

			System.out.println("\t**************** Round " + (j+1) + " ****************");
			Card2 player01Draw = player01.flip();
			Card2 player02Draw = player02.flip();
			System.out.print("Player 1 ");
			player01Draw.describe();
			System.out.print("Player 2 ");
			player02Draw.describe();
			System.out.println();
			if(player01Draw.getValue() > player02Draw.getValue()) {
				System.out.println("Player 1 wins this round");
				player01.incrementScore();
				
			} else if (player02Draw.getValue() > player01Draw.getValue()){
				System.out.println("Player 2 wins this round");
				player02.incrementScore();
				
			}
			
			else {
				tie.incrementScore();
			}
			
			System.out.println();
			System.out.println("Player 1 score is: " + player01.getScore());
			System.out.println("Player 2 score is: " + player02.getScore());
			System.out.println();
		}
		
		System.out.println("\t**************** The winner is? ****************");
		System.out.println("\t\t\t\tIn the 26 rounds, there was/were: " + tie.getScore() + " tie(s).");
		if(player01.getScore() > player02.getScore()) {
			System.out.println("Player 1 wins the game!!!!!!!!");
		} else if(player02.getScore() > player01.getScore()){
			System.out.println("Player 2 wins the game!!!!!!!!");
		} else {
				System.out.println("The game is a tie. And no one wins in war. Nothing but losers!");
			}

	}

}
