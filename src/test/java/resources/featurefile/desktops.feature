Feature: Desktop page
  As user I want to desktop page into tutorialsninja website
  @smoke  @regression
  Scenario: User Product Arrange In Alphabetical Order
    Given I select currency
    When I mouse hover on desktops link
    And I select menu
    And I Get all the products name and stored into array list
    And I Sort By Reverse order
    And I Select sort by Name Z - A
    And I After filter Z -A Get all the products name and stored into array list
    Then I Product Arrange In Alphabetical Order successfully
  @regression
Scenario:User should navigate Product Added To Shopping Cart SuccessFully
  Given I select currency
  When I mouse hover on desktops link
  And I select menu
  And I Select sort by Name A-Z
  And I select product by name
  And I Verify message product by name
  And I select delivry date
  And I enter quantity
  And I click on add chart button
  And I verify add chart butoon message
  And I click on shoping chart link in to message
  And I verify message shoping cart
  And I verify product name
  And I verify delivry date
  And I verify get model name
  Then I should navigate Product Added To Shopping Cart SuccessFully


