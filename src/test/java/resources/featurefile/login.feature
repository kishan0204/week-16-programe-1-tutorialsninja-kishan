Feature: Login Test
  As user I want to login into nop commerce website

  @smoke @regression
  Scenario:  User Should Navigate To Login Page Successfully
    Given I am on homepage
    When I click on my account tab
    And I select option login
    Then I Should Navigate To Login Page Successfully
  @regression
    Scenario: User Should Login And Logout Successfully
      Given I am on homepage
      When I click on my account tab
     And I select option login
      And I enter email address"prime123@gmail.com"
      And I enter password "test123"
      And i click on login button
      And I click on my account
      And I select my account options
      Then I Should Login And Logout Successfully


