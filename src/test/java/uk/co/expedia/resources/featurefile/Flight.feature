Feature: Flight Destination and Search Flight Functionality
  As a User
  I want to visit expedia website to book flight ticket
  So I can travel to choice of my destination

  Scenario: Verify user should navigate to Flight Page
    Given I am on home page of expedia website
    When I click on Flight button
    Then I should navigate to Flight page successfully


  Scenario Outline: Verify user should find destination according there choice
    Given I am on home page of expedia website
    And I click on Accept button
    When I click on Flight tab
    And I select flying from "<Flying from>"
    And I select Going to "<Going to>"
    And I select Departing date "<Departing date>"
    And I select Returning date "<Returning date>"
    And I click on Travellers
    And I select two Travellers
    And I click on close button after selection of passengers
    And I click on search button
    Then I should see my selected "<Destination>" successfully
    Examples:
      | Flying from | Going to  | Departing date | Returning date | Destination                        |
      | London      | Mumbai | 20/12/2020     | 10/02/2021     | Select your departure to Mumbai |
      | Birmingham  | Mumbai     | 10/12/2020     | 10/01/2021     | Select your departure to Mubai     |
      | Ahmedabad   | Dubai    | 18/12/2020     | 10/01/2021     | Select your departure to Dubai    |


