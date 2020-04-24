package excercise_18_1_;

public class Ex5_Lambda {

	public static void main(String[] args) {
		TextPrinter printer = new TextPrinter(new String[] {"Elena", "jack", "mieke", "sridevi",
        		"raja", "sellena" ,"shazeel"});
		
		
		
	 	printer.printFilteredWords(s -> {
			int lettercounter = 0;
			final var charst = s.toCharArray();
			for (char c : charst) {
				if (c == ('e')) {
						lettercounter++;
					}
				}
			return lettercounter >= 2;
	    	});
        

	}

}
