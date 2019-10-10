package Inheritance.INheritance_project;

import org.junit.Test;

public class ZooTest {

	@Test
	public void shouldFeedAllAnimal() {
		Zoo zoo = new Zoo();
		Animals[] animals = {new Dog(), new Gorilla(), new Lion(), new Tiger(), };
		zoo.feedAnimals(animals);
	}
}
