package excercise_18_1_;

public class Excercise_4 {
	public static void main(String[] args) {

		TextPrinter tp = new TextPrinter(
				new String[] { "Elena", "jack", "mieke", "sridevi", "raja", "seleena", "shazeel" });

		System.out.println("the names which contain e as a  second letter ");
		
		tp.printFilteredWords(new WordFilter() {
			public boolean isValid(String s) {
				if (s.charAt(1) == 'e') {
					return true;
				} else {
					return false;
				}
			}

		});

		 
	//	tp.printFilteredWords( s -> s.charAt(1) == 'e');

		 

			}
		
	}

