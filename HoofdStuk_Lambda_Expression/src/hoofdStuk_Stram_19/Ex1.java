package hoofdStuk_Stram_19;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {
		String[] str = new String[] { "Mieke", "Lavanya", "Samir", "Patrick", "Doriana", "Jamy" };

		Optional<String> ss = Arrays.stream(str).reduce((str1, str2) -> str1 + "" + str2);

		if (ss.isPresent()) {
			System.out.println(ss.get());

		}

	}

}