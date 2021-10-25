Feature: Ensuring guest functionality of application
 @hotel @guest
 Scenario: Verify total number of guest
  Given launch application
  And click on guest
  And select "4" adults
  And select "2" children
  And select age is "4" for first child
  And select age is "<1" for second child
  Then verify number of adults and children
  And click apply
  Then verify "6" number of guests