package exPerson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App3Main {

	public static void main(String[] args) {
		
		Inf1 i = Person::new;
		 Person s1 = i.getPer("Raja", "Khan", Gender.M, 52, 78, 169);
		 Person s2 = i.getPer("Zakia", "Zaka", Gender.F, 42, 48, 164);
		 Person s3 = i.getPer("Seleena", "Khan", Gender.F, 1, 8, 78);
		 Person s4 = i.getPer("Atia", "Zaka", Gender.F, 39, 70, 163);
		 Person s5 = i.getPer("Raja", "Quddus", Gender.M, 82, 68, 169);
		 Person s6 = i.getPer("Saeeda", "Bano", Gender.F, 72, 74, 166);
		 Person s7 = i.getPer("Raja", "Zahid", Gender.M, 42, 78, 173);
		 
		 Person[] person = {s1,s2,s3,s4,s5,s6,s7};
		  Stream.of(person).map(f-> f.getVoornaam()+" " + f.getAchternaam()).forEach(System.out::println);
		  System.out.println("______________________________________________________________________________");
	Collection<Float> ls = Stream.of(person).map(f-> f.getGewicht()).collect(Collectors.toCollection(ArrayList::new));
	float sum = ls.stream().reduce((float) 0, (a,b)->a+b);
	System.out.println("sum of weight of all person"+ sum);
	OptionalDouble wt = Stream.of(person).mapToDouble(Person::getGewicht).average();
	System.out.println("the average weight is " + " "  + wt  );
	  Optional<Person> fr = Stream.of(person).min(Comparator.comparing(Person::getLeeftijd));
	  System.out.println("The minimum age is " + fr);
	  Optional<Person> fr1 = Stream.of(person).max(Comparator.comparing(Person::getLeeftijd));
	  System.out.println("The maimum age is"  + fr1) ;
	
		  System.out.println("-----------------------------------------------------");
		Person fr2 = Stream.of(person).min(Comparator.comparingDouble(Person::getGewicht)).get();
		System.out.println("The minimum weight of a person is" + fr2);
		
		  
		 }
		 

	}


