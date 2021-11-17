
Feature: Add a new URL

  Scenario: Add a new valid URL
    Given  the user is logged in
    And : the user navigates to More tab on the main page and clicks Appreciation
    When  user clicks URL sign
    Then  user is able to insert a valid link and Link text
    And  user should be able to Save