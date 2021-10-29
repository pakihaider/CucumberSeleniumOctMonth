Feature:
	@hotel @signup 
	Scenario: Hotels: Verify error message for invalid data in SignUp form
		Given launch application
		And click on signin link
		And click on signup link
		And enter email "test@123" for validation
		Then verify email error message "Please check your email address" is displayed
		And enter password "123" characters
		Then verify password error message "Please enter a password that contains at least six characters" is displayed
		And enter password "123456789123456789123456789" characters
		Then verify password error message "Your password cannot be more than 20 characters long." is displayed
		And enter first name "123"
		Then verify firstname error message "Please check your first name" is displayed
		And enter last name "123"
		Then verify lastname error message "Please check your last name" is displayed

	@hotel @signup
	Scenario: Hotels: Verify tick-mark when user enters correct data in SignUp form
		Given launch application 
		And click on signin link
		And click on signup link
		And enter email "test@gmail.com" for validation
		Then verify tick mark is displayed for email
		And enter password "test@123" characters
		Then verify tick mark is displayed for password
		And enter first name "Test"
		Then verify tick mark is displayed for firstname
		And enter last name "Automation"
		Then verify tick mark is displayed for lastname