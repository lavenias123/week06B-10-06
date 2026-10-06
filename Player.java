package week06B;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card2> hand = new ArrayList<>();
	private int score;
	private String name;
	
	public Player(List<Card2> hand, int score, String name) {
		super();
		this.hand = hand;
		this.score = 0;
		this.name = name;
	}

	public Player() {};
	
	public List<Card2> getHand() {
		return hand;
	}

	public void setHand(List<Card2> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [Hand=" + hand + ", Score=" + score + ", Name=" + name + "]";
	}
	
	public void incrementScore() {
		score++;
	}
	
	public Card2 flip() {
		Card2 Card2 = hand.get(0);
		hand.remove(0);
		return Card2;
	}
}
