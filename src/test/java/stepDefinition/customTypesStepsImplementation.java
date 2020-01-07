package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import stepDefinition.TypeRegistryConfiguration.AccountType;

public class customTypesStepsImplementation {

	@Given("a customer has a {account_type} account")
	public void testForCustomTypes(AccountType act) {
		System.out.println("Hello your account type is " + act.accountType);
	}

	@Given("a customer shares his \\{account_type} to helpDesk")
	public void a_customer_shares_his_account_type_as(List<AccountType> table) {
		AccountType buildingName = table.get(1);
		System.out.println("Hola " + buildingName.accountType);
	}
}
