package week06B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import week05.Card2;

public class Deck {

	// field for the Deck
		List<Card2> cards = new ArrayList<Card2>(); 

		// constructors need to be public
		public Deck(List<Card2> cards, String[] suits, String[] values) {
			this.cards = cards;
			
		}
		public Deck() {
			String[] suits = {"Clubs", "Diamonds", "Hearts",  "Spades"};
			String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",  "Ace"};
			for(String s : suits) {
				int count = 2;
				for(String name : names) {
					Card2 c = new Card2();
					c.setSuit(s);
					c.setName(name);
					c.setValue(count);
					cards.add(c);
					count++;
				}
				
			}
		}
		
		public List<Card2> getCards() {
			return cards;
		}

		public void setCards(List<Card2> cards) {
			this.cards = cards;
		}

			public void deckDescribe() {
				for(Card2 c : cards ) {
					c.describe();
				}

			}
			
			//	Add a shuffle method within the Deck Class
			public void shuffle () {
				Collections.shuffle(this.cards); 
				
			}
			
//			Add a draw method within the Deck Class
			public Card2 pullCard() {
				Card2 Card2 = cards.remove(0);
				return Card2;
			}	
			
}
