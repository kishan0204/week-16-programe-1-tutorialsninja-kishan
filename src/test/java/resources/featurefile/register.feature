Feature: Register
  As user I want to register into tutorialsninja website
  @smoke
  Scenario: User Should Navigate To Login Page Successfully
    Given I am on homepage
    When I click on my account tab
    And  I Click on Register link

    Scenario: User Should Login And Logout Successfully
      Given I am on homepage
      When I click on my account tab
      And  I Click on Register link
      And I click on first name
      And I click on last name
      And I enter email id field
      And I enter phone number
      And I enter password field
      And I enter password confirm field
      And I click on radio button
      And I click on privacy policy
      And I click on continue button
      And I verify Account created
      And I click on continue button link
      And I click on my account link
      And I click on logout






