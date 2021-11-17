@wip
Feature: Adding a video link

  Scenario: Add a new video
    Given  the user is logged in
    And : the user navigates to More tab on the main page and clicks Appreciation
    When  user clicks on the video icon
    Then  user is able to insert a valid vimeo video link
    And  user should be able to Save video link