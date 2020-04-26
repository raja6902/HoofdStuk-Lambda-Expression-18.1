package hoofdStuk_Stram_19;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class EX1_01 {

	public EX1_01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] string= {"Alfa", "Bravo", "Charlie","Delta", "Echo", "Foxtrot", "Golf", "Hotel"};
		
		Stream.of(string).forEachOrdered(System.out::println);

	}

}
