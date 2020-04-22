package excercise_18_1_;


public class Excercise_4 {
	public static void main(String[] args)
	{

			

				TextPrinter tp = new TextPrinter("");

				tp.printFilteredWords(new WordFilter() {
					public boolean isValid(String s) {
						if(s.charAt(1) == 'e') {
							return true;
						}
						else {
							return false;
						}
					}
					
				});

				String[] m = { "Mieke", "Chivanjee", "Katrina", "Madhubala", "Juhichawla", "Siridevi", "Kiran", "Aamir", "Raja",
						"Shazeel", "Zakia", "Seleena", "Samantha" };

				System.out.println("the names which contains  letter " + "A" + " ");

				WordFilter mo = s-> s.charAt(1)=='e';

				for (String el : m) {

				if(mo.isValid(el)) {

						System.out.println(el);

					}
				}
	}
}
		


	





