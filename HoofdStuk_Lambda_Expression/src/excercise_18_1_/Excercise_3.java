package excercise_18_1_;

 
public class Excercise_3 {
	public static void main(String[] args)
	{

			

				TextPrinter tp = new TextPrinter(
						new String[] { "Elena", "jack", "mieke", "sridevi", "raja", "seleena", "shazeel", "Aamir" , "Akshay" });

				System.out.println("the names which start with letter " + "A" + " ");
				
				tp.printFilteredWords(new WordFilter() {
					public boolean isValid(String s) {
						return s.startsWith("A");
					}
				});

				 

			 

				//tp.printFilteredWords( s -> s.startsWith("A"));

				 
					}
				
			}
		


	



