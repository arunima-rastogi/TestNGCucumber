package stepDefinition;

import io.cucumber.java.en.Given;

public class firstSteps {

	@Given("As a User i search for {int} text")
	public void exampleIntSteps(int number) {
		System.out.println(number);
	}

}
