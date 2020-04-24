package excercise_18_1_;

public class Excercise_2 {
	public static void main(String[] args) {
		
		

		

		TextPrinter tp = new TextPrinter(new String[] {"Elena", "jack", "mieke", "sridevi",
        		"raja", "sellena" ,"shazeel"});
		
		System.out.println("the names contains more than 4 letters" + " ");
        

		tp.printFilteredWords(new WordFilter() {
			public boolean isValid(String s) {
				return s.length()>4;
			}
		});

		 

		

	//tp.printFilteredWords( s -> s.length()>4);
		
	}

		 
			}
		
	







