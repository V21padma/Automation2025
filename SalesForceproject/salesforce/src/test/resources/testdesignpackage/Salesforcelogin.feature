Feature: Login functionality

Scenario: Validating with valid credentials
  Given User navigates to salesforce login page
  When user enter username "PCM" and password "sharlak"
  And clicks on Login button
  Then user should navigate to homepage

  Scenario Outline: Validating the error message when invalid date is provided
    Given User navigates to salesforce login page
    When user enter username <UserName> and password <Password>
    And clicks on Login button
    Then user should navigate to homepage
    Examples:
      | UserName | Password |
      | Lak      | 14       |
      | Shar     | 10       |




