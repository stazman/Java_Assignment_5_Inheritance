package model;

public class AwesomePerson extends Person {

	public AwesomePerson() {
		
		this.name = "John";
		this.age = 23;
		
		System.out.println("This is from the AwesomePerson class.");
		
	}
	
	public void talk() {
		
		System.out.println("Hello my name is " + this.name + " and my age is " + this.age);
		
	}
	
}
