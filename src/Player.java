
public class Player {
	private Card[] cards;
	private int maxcards;
	private String name;
	public Player() {
		this.maxcards = 5;
		this.cards = new Card[maxcards];
	}
	public int getMaxCards() {
		return maxcards;
	}
	public Card getCards(int index) {
		return cards[index];
	}
	public void setCards(int index, Card card) {
		this.cards[index] = card;
	}
	public String getName() {
		return name;
	}
}
