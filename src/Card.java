
public class Card {
	private Suit suit;
	private int value;
	public Card(Suit suit, int value) {
		super();
		this.suit = suit;
		this.value = value;
	}
	public Suit getSuit() {
		return suit;
	}
	public int getValue() {
		return value;
	}
	public enum Suit {
		club, diamond, heart, spade;
	}
}
