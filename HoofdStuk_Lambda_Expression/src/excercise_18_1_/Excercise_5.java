package excercise_18_1_;


public class Excercise_5 {
	public static void main(String[] args) {

		TextPrinter tp = new TextPrinter("");

		tp.printFilteredWords(new WordFilter() {
			public boolean isValid(String s) {
				int lettercounter = 0;
				final var charst = s.toCharArray();
				for (char c : charst) {
					if (c == ('e')) {
						lettercounter++;
					}

				}
				return lettercounter >= 2;

			}
		});

		String[] m = { "Mieke", "Chivanjee", "Katrina", "Madhubala", "Juhichawla", "Siridevi", "Kiran", "Aamir", "Raja",
				"Shazeel", "Zakia", "Seleena", "Samantha" };

		System.out.println("List of names which contains two " + "e" + " ");

		WordFilter wit = s -> {
			int lettercounter = 0;
			final var charst = s.toCharArray();
			for (char c : charst) {
				if (c == ('e')) {
					lettercounter++;
				}
			}
			return lettercounter >= 2;
		};

		for (String el : m) {
			if(wit.isValid(el))

			System.out.print("["+  el+ "]");

		}
	}
}


