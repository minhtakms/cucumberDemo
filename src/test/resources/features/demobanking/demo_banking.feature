Feature: Demo Banking Guru99
    Scenario: Add new customer
    Given user is on homepage
    Given user logged in successfully with admin account
    When user navigate to new customer tab
    And user enter customer name "<name>"
    And user select gender "<gender>"
    And user enter customer info "<dob>" and "<addr>" and "<city>" and "<state>" and "<pin>" and "<phone>"
    And user enter customer email "<email>"
    And user enter customer password "<password>"
    And user click on Submit button
    Then new customer should be added successfully

    Examples:
        |name        |gender|dob     |addr     |city    |state   |pin   |phone|email         |password|
        |Nguyen Van A|false |10031990|dong khoi|Bien Hoa|Dong Nai|123456|12345|test@gmail.com|test@123|

    Scenario: Add new account based on created customer
    Given user is on homepage
    Given user logged in successfully with admin account
    Given user navigate to New Account page
    When user enter Customer id
    And user select account type "<type>"
    And user enter deposit amount "<amount>"
    And user click on Submit new account button
    Then user should be able to create new account successfully

    Examples:
        |type   |amount|
        |Current|686868|

    Scenario: Deposit for account that created recently
    Given user is on homepage
    Given user logged in successfully with admin account
    Given user navigate to deposit page
    When user enter account ID
    And user enter amount to deposit "<depamount>"
    And user enter description "<desc>"
    And user click on submit deposit form button
    Then user should be able to deposit successfully

    Examples:
        |depamount   |desc        |
        |68888       |test deposit|