Feature: Checking Login Functionality of Facebook Page

  Scenario: Login with Valid Credentials
    Given User Launches the Fb Url
    When User Enters Username
    And User Enters Password
    And User Clicks Login Button
    Then User should be login sucessfully
