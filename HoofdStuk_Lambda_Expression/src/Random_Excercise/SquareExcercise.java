package Random_Excercise;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;

public class SquareExcercise {

	public static void main(String[] args) {
		double myStream = IntStream.rangeClosed(1, 1000)
				.filter(f -> f % 8 == 0 && f % 5 == 0)
				.limit(20)
				.mapToDouble(Math::sqrt)
				.sum();
		 
		System.out.println(myStream);

	}

}
