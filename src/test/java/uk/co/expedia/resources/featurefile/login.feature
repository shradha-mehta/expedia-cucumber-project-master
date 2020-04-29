Feature: Login Functionality
  As a User
  I want to visit expedia website

  Scenario: Verify User should navigate to sign in page
    Given I am on home page of expedia website
    And I click on Accept button
    And I click on account button
    When I click on sign in button
    Then I should be in sign in page successfully

  Scenario: Verify user should not login with invalid credentials
    Given I am on home page of expedia website
    And I click on Accept button
    And I click on account button
    And I click on sign in button
    When I enter email in email field "jiyapandya@gmail.com"
    And I enter password in password field "Rahi0804@"
    And I click on sign in tab
    Then I should see system showing error message
