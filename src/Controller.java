import java.util.*;

public class Controller {

	private View view;

	public Controller(View view) {
		this.view = view;
	}

	public void start(int numCards) {
		ArrayList<Card> cardList = generateCards(numCards);
		Set<Card> cardSet = removeDuplicates(cardList);
		view.displayCards(cardSet);
	}

	private static ArrayList<Card> generateCards(int numCards) {
		ArrayList<Card> cardList = new ArrayList<Card>();
		for (int i = 0; i < numCards; i++) {
			Card newCard = new Card();
			cardList.add(newCard);
		}
		return cardList;
	}

	private static Set<Card> removeDuplicates(ArrayList<Card> cardList) {
		Set<Card> set = new HashSet<>();
		set.addAll(cardList);
		return set;
	}
}
