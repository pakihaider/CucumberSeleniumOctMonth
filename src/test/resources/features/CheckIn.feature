Feature: Ensuring checkin functionality of hotels.com
  @hotel @checkin
  Scenario: Hotels : Verify past date and back button on current month calendar is disabled
  	Given launch application
    And click on checkin calender
    Then verify back button is disabled
    And verify previous dates are disabled
