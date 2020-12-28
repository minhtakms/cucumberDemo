Feature: Login to guru99
    Scenario: Login with valid credentials
    Given user is on homepage
    When user enter username
    And user enter password
    And user click on login button
    Then user should be able to login