package Inheritance.INheritance_project;

public class Zoo {

	public void feedAnimals(Animals[] animals) {
		// TODO Auto-generated method stub
		for(Animals animal:animals) {
			animal.eat();
			animal.age();
		}
	}

}
