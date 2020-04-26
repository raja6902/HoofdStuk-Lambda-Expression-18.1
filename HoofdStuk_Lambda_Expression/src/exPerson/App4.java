package exPerson;

import java.util.function.Predicate;

public class App4 {

	public static void main(String[] args) {
		Inf1 i = Person::new;
		Person s1 = i.getPer("Raja", "Khan", Gender.M, 52, 78, 169);
		Person s2 = i.getPer("Zakia", "Zaka", Gender.F, 42, 48, 164);
		Person s3 = i.getPer("Seleena", "Khan", Gender.F, 1, 8, 78);
		Person s4 = i.getPer("Atia", "Zaka", Gender.F, 39, 70, 163);
		Person s5 = i.getPer("Raja", "Quddus", Gender.M, 82, 68, 169);
		Person s6 = i.getPer("Saeeda", "Bano", Gender.F, 72, 74, 166);
		Person s7 = i.getPer("Raja", "Zahid", Gender.M, 42, 78, 173);

		Person[] person = { s1, s2, s3, s4, s5, s6, s7 };

		Predicate<Person> t1 = (f -> f.getLeeftijd() > 50);
		Predicate<Person> t2 = (f -> f.getGewicht() > 75);
		for (Person m : person) {
			if (t1.test(m) && t2.test(m)) {
				
				System.out.println("Details of a person who is over 50 and weghrd over 75Kg" + "\n" + m);

			}
		}
	}
}
