package excercise_18_1_;
public class TextPrinter {
		private String sentence = " Hell0 World is every body ok echo ebola friendly match";

		public TextPrinter(String sentence) {

			this.sentence = sentence;
		}

		public void printFilteredWords(WordFilter filter) {
	     for(String w : sentence.split(" ")) {
	    	 System.out.println(w);
	     }
		
		}

	}



