Feature: Validate credentials on given website

  Scenario: To check login is successful using given credentials
    Given user is on the browser
    And user is navigated to the desired website
    And user clicks on Sign In
    Then user enter credentials
    And user click on Sign in
    Then user is navigated to the home page
