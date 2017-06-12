public class Card {
	private Suit suit;
   	private Rank rank;

	public Card() {
		this.suit = Suit.getRandomSuit();
		this.rank = Rank.getRandomRank();
	}

	public Suit getSuit() {
		return suit;
	}
	
	public Rank getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return rank.toString() + " of  " +  suit.toString();
	}

	@Override
	public int hashCode() {
		return suit.ordinal() + (rank.ordinal() << 3); //suit has 4 possible outcomes so rank is shifted 3 bits to the left to avoid hash collisions
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Card)) return false;
		Card card = (Card) obj; 
		return (this.rank == card.rank && this.suit == card.suit);
	}
}
