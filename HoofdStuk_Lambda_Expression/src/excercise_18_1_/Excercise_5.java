package excercise_18_1_;


public class Excercise_5 {
	public static void main(String[] args) {

		TextPrinter tp = new TextPrinter(new String[] {"Elena", "jack", "mieke", "sridevi",
        		"raja", "sellena" ,"shazeel"});
        


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
	}
}
		 


