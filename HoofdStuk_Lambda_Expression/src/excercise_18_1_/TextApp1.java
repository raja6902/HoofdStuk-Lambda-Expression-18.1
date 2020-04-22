package excercise_18_1_;

public class TextApp1 {
	public static void main(String[] args) {

		TextPrinter tp = new TextPrinter("");

		tp.printFilteredWords(new WordFilter() {
			public boolean isValid(String s) {
				return s.contains("e");
			}
		});

		String[] m = { "Mieke", "Chivanjee", "Katrina", "Madhubala", "Juhichawla", "Siridevi", "Kiran", "Aamir", "Raja",
				"Shazeel", "Zakia", "Seleena", "Samantha" };

		System.out.println("the names contains letter " + "e" + " ");

		WordFilter w = s -> s.contains("e");

		for (String el : m) {

			if (w.isValid(el)) {

				System.out.println(el);

			}
		}
	}
}


