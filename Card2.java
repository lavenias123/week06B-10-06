package week06B;

public class Card2 {
	
	private String name;
	private String suit;
	private int value; 
	
	public Card2(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	public Card2() {}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public void describe() {
		System.out.println("The Card is " + name + " of " + suit + " with the value of " + value + ".");
	}
}
