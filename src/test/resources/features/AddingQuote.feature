@wip
Feature: Add a new quote

  Scenario: Add a new quote
    Given the user is logged in
    And the user navigates to More tab on the main page and clicks Appreciation
    When  user clicks quote sign
    Then  quote can be added

