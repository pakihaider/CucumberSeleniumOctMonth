Feature: Hotels: Verify text/link on "Why book with Hotels.com?" section
	
	@hotel @whybook
	Scenario: Hotels: Verify text/link on "Why book with Hotels.com?" section
		Given launch application
		And go to Why book with Hotels.com section
		Then verify "Free cancellation on most hotels*" free text with icon is displayed
		Then verify "Our price guarantee Find out more" price text with icon is displayed
		Then verify "Get a reward night for every 10 nights you stay" reward text with icon is displayed
		And click on our price guarantee
		Then verify "Price Guarantee" price heading is displayed
		And go to Why book with Hotels.com section
		And click on get a reward night
		Then verify "Instant savings. Reward* nights. And more ..." reward heading is displayed