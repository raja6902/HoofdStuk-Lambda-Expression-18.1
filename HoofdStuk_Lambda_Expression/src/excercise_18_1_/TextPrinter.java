package excercise_18_1_;
public class TextPrinter {
		private String[] sentence;

		public TextPrinter(String[] sentence) {

			this.sentence = sentence;
		}

		public void printFilteredWords(WordFilter filter) {
	     for(String w: sentence) {
	    	 if(filter.isValid(w)) {
	    	 System.out.println(w);
	     }
		
		}

		}
}


	
