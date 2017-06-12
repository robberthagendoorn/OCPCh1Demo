public class Main {
	
	public static void main(String... args) {
		View view = new View();
		int number = parseNumber(view, args);	
		Controller cont = new Controller(view);
		cont.start(number);
	}

	private static int parseNumber(View view, String... args) {
		int number = 0;
		try {
			number = Integer.parseInt(args[0]);
		} catch (Exception e) {
			view.printParseError();
		}
		return number;
	}
}
