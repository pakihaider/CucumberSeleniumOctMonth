Feature: Ensuring functionality of terms and condition and privacy statements TC-20
  @hotels @terms
  Scenario: Verify terms and conditions and privacy statements in new tab
    Given launch application
    And navigate to "https://in.hotels.com/profile/signup.html"
    And click on terms and conditions
    Then verify terms and conditions opens in new tab
    And click privacy statement
    Then verify privacy statement opens in new tab