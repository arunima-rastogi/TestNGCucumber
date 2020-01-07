Feature: Cucumber custom Data types example
	@CustomTypes
  Scenario: test for custom types
    Given a customer has a savings account
    And a customer has a checking account
    
	@CustomTypes
  Scenario: test for custom types
    Given a customer shares his {account_type} to helpDesk
    | checking |
    | savings |