package excercise_18_1_;

 
public class Excercise_3 {
	public static void main(String[] args)
	{

			

				TextPrinter tp = new TextPrinter("");

				tp.printFilteredWords(new WordFilter() {
					public boolean isValid(String s) {
						return s.startsWith("A");
					}
				});

				String[] m = { "Mieke", "Chivanjee", "Katrina", "Madhubala", "Juhichawla", "Siridevi", "Kiran", "Aamir", "Raja",
						"Shazeel", "Zakia", "Seleena", "Samantha" };

				System.out.println("the names which start with letter " + "A" + " ");

				WordFilter w = s -> s.startsWith("A");

				for (String el : m) {

					if (w.isValid(el)) {

						System.out.println(el);

					}
				}
			}
		


	}




