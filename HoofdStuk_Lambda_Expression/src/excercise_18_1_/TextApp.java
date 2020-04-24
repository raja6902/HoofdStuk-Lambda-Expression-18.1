package excercise_18_1_;
 

public class TextApp {
	public static void main(String[] args) {
       
	 
	        TextPrinter printer = new TextPrinter(new String[] {"Elena", "jack", "mieke", "sridevi",
	        		"raja", "sellena" ,"shazeel"});
	        

	        System.out.println("********* WORDS CONTAINING 'e' **********");
	        printer.printFilteredWords(new WordFilter() {
	           public boolean isValid(String s) {
	        	return s.contains("e");
	        	
	        
	        	
	   	    	
	   	    
	            
	           } });
	             
	          
	        }
	}

	          


	    
	