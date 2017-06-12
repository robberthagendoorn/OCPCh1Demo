import java.util.*;

public class View {

	public static void printParseError() {
		System.out.println("Please type java Main followed by an integer value");
	}

	public static void displayCards(Set<Card> cardSet) {
		for (Card card : cardSet) {
			System.out.println(card);
		}
	}
}


