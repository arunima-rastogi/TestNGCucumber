package stepDefinition;

import java.util.Map;
import CSVUtilities.ReadCSVasMapOfMaps;
import io.cucumber.java.en.Given;

public class csvReaderSteps {

	@Given("I read a CSV file with {string}")
	public void myFunction(String itc) {
		Map<String, Map<String, String>> dat = ReadCSVasMapOfMaps.getData("c:\\abc.csv");
		if(itc== null) {
			itc = "TC001";
			System.out.println(itc);
		}
			
		System.out.println(dat.get(itc));
	}
}
