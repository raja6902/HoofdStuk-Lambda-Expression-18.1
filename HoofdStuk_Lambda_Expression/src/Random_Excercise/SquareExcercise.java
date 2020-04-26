package Random_Excercise;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;


public class SquareExcercise {

	public static void main(String[] args) {
	 IntStream.range(0, 1001).filter(f->f%f==0).filter(f->f<21).filter(f->f%5==0).filter(f->f%8==0).forEach(System.out::println);	
			
		
				
			
	

		
		
		
		
		
		
			
		}
	    

	}


