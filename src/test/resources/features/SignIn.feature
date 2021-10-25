Feature: Ensuring error message will display for signin with invalid credentials
	@hotel @errormessage
 	Scenario: Verify error message for signin with invalid credentials
      Given launch application
      And click on signin
      And enter email "test"
      And enter password "hello123"
      And click on signin button
      Then verify error message is displayed
