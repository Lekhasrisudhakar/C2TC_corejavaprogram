package day15.generics;

	public class GenericDemo {
		
			public <E> void displayArrayElements(E[] elements) {
				for (E element : elements) {
					System.out.println("element is: " + element);
				}
			}
	}

