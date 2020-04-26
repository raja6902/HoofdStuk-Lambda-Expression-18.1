package Random_Excercise;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Randt {

	public static void main(String[] args) {
		
		HashSet<Integer>  set = new HashSet<>();
	SecureRandom	random =  new SecureRandom();
	
IntStream num = random.ints(500,1,10000).filter(f -> f%2==0);
IntStream num1 =random.ints(500,1,10000).filter(f -> f%2==0);
IntStream num3 = random.ints(500,1,10000).filter(f -> f%2==0);
IntStream num4 =random.ints(500,1,10000).filter(f -> f%2==0);


if(num!=num1&& num3!= num4) {
	num.forEach(System.out::println);
}



 	
	
		
		
		

	}

}
