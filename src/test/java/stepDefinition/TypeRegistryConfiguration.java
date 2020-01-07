package stepDefinition;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableTransformer;

import static java.util.Locale.ENGLISH;

import java.util.Locale;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

	@Override
	public Locale locale() {
		return ENGLISH;
	}

	@Override
	public void configureTypeRegistry(TypeRegistry typeRegistry) {
		typeRegistry.defineParameterType(new ParameterType<>("account_type", // name
				"savings|checking", // regexp
				AccountType.class, // type
				AccountType::new // transformer function
		));
		typeRegistry.defineDataTableType(new DataTableType(AccountType.class, (String s) -> new AccountType(s)));
	}

	static class AccountType {

		String accountType;

		AccountType(String accountType) {
			this.accountType = accountType;
		}

	}
}