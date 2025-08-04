package day15.generics;

	import java.util.Arrays;
	import java.util.List;

	public class UnBoundedWildCardDemo {

		public static void main(String[] args) {
			List<Number> doubleList = Arrays.asList(1.0, 2.0, 3.0);
			System.out.println("Display Integer values");
			
			UnBoundedWildCard.display(doubleList);

			List<String> strList = Arrays.asList("Hi", "Hello", "How are you");
			System.out.println("Display String values");
			
			UnBoundedWildCard.display(strList);
			
			Person persons[]=new Person[] {new Person("Nitin", "Pune"), new Person("Manoj", "Mumbai"),new Person("Mayur", "Delhi")};
			List<Person> personList = Arrays.asList(persons);
			System.out.println("Display Person values");
			
			UnBoundedWildCard.display(personList);
		}
	}

