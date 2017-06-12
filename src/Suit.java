import java.util.Random;

public enum Suit {
	CLUBS, DIAMONDS, HEARTS, SPADES;

	private static final Random rand = new Random();

	public static Suit getRandomSuit() {
		return Suit.values()[rand.nextInt(Suit.values().length)];
	}
}
