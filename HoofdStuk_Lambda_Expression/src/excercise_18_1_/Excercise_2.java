package excercise_18_1_;

public class Excercise_2 {
	public static void main(String[] args) {
		
		

		

		TextPrinter tp = new TextPrinter("");

		tp.printFilteredWords(new WordFilter() {
			public boolean isValid(String s) {
				return s.length()>4;
			}
		});

		String[] m = { "Mieke", "Chivanjee", "Katrina", "Madhubala", "Juhichawla", "Siridevi", "Kiran", "Aamir", "Raja",
				"Shazeel", "Zakia", "Seleena", "Samantha" };

		System.out.println("the names contains more than 4 letters" + " ");

		WordFilter w = s -> s.length()>4;

		for (String el : m) {

			if (w.isValid(el)) {

				System.out.println(el);

			}
		}
	}


}




