Feature: Feature to test credentials to login on a given website

  Scenario Outline: To check given credentials are working
    Given user is on the browser
    And user is navigated to the desired website
    When user enters <username> and <password>
    And user clicks on Sign In
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | testing  |    12345 |
      | selenium |    12345 |
