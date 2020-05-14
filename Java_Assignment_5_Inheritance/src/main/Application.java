package main;

import model.AwesomePerson;
import model.ReallyAwesomePerson;

public class Application {

	public static void main(String[] args) {
		
		AwesomePerson awesomePerson = new AwesomePerson();
		awesomePerson.talk();
		
		ReallyAwesomePerson reallyAwesomePerson = new ReallyAwesomePerson();
		reallyAwesomePerson.talk("This is a reallyAwesomePerson message.");
		
	}
	
}
