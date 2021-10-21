Feature:  Verifying Change Button Displayed.
 @hotel @changebutton
 Scenario: Hotels: Verify CHANGE DATES button is displayed at the end of search results
  Given launch application
  And enter "bora" in destination
  And select Bora Bora, Leeward Islands, French Polynesia from auto suggestion
  And select 1 november as checkin
  And select 5 november as checkout
  And click on apply
  And click on search
  Then verify change dates is displayed and enabled



