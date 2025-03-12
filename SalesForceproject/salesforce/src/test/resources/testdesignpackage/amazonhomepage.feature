Feature: Key function of HomePage
  Scenario:  Search function
    Given user navigates to amazon homepage
    When user enter the search keyword "mouse"
    And user click the search icon
    Then verify the page title of the page


    Scenario: Drop down values
      Given user navigates to amazon homepage
      When user extracts the dropdown values
      Then user validates the dropdown values

      Scenario Outline: search function wth multiple test data
        Given user navigates to amazon homepage
        When user enter the search keyword "<SearchInput>"
        And user click the search icon
        Then verify the page title of the page
        Examples:
          | SearchInput |  |
          | iPhone      |  |
          | Keyboard    |  |
          | table       |  |
