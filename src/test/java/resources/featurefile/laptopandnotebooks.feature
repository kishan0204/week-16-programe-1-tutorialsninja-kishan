Feature: Laptop and notebooks page
  As user I want to Laptop and notebooks page into tutorialsninja website
  @smoke @regression
  Scenario: User should  Products Price Display High To Low Successfully
    Given I select currency
    When I mouse hover on laptop and note book link
    And I selcet menue show
    And I select original prodct price
    And I select lprice high to low
    Then I should Products Price Display High To Low Successfully
  @regression
    Scenario:User Place Order Successfully
      Given I select currency
      When I mouse hover on laptop and note book link
    And I selcet menue show
      And I select original prodct price
      And I select lprice high to low
      And I select product macbook
#      And I verify message macbook
      And I click on add chart button
#      And I verify add chart butoon message macbook
    And I click on clik on shoping chart link
      And I change quantity
      And I click on update buttons
      And I get veriy message
      And I total matched
      Then I Place Order Successfully






