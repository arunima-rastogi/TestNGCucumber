package stepDefinition;

import io.cucumber.java.en.Given;

public class firstSteps {

	@Given("As a User i search for {int} text")
	public void exampleIntSteps(int number) {
		System.out.println(number);
	}

	@Given("I share name of {string}")
	public void exampleStringSteps(String name) {
		System.out.println(name);
	}
}
