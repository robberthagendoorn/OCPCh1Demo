import java.util.Random;

public enum Rank {
	RANK_2, 
	RANK_3, 
	RANK_4, 
	RANK_5, 
	RANK_6, 
	RANK_7, 
	RANK_8, 
	RANK_9,
  	RANK_10,
   	RANK_JACK, 
	RANK_QUEEN, 
	RANK_KING, 
	RANK_ACE;
	
	private static final Random rand = new Random();

	public static Rank getRandomRank() {
		return Rank.values()[rand.nextInt(Rank.values().length)];
	}

	@Override
	public String toString() {
		return this.name().substring(5);
	}
}
