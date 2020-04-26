package hoofdStuk_Stram_19;

import java.util.stream.Stream;

public class Ex1_1 {

	public static void main(String[] args) {
		
		System.out.println("Numbers from 1 - 99");
		
		 Stream<Integer> nos = Stream.iterate(0, n -> n + 1);
		 
		nos .limit(100).forEach( System.out::println );

	}

}
