Feature: Key function of HomePage
  @sc01
  Scenario:  Search function
    Given user navigates to amazon homepage
    When user enter the search keyword "mouse"
    And user click the search icon
    Then verify the page title of the page

    @sc03
    Scenario: Drop down values
      Given user navigates to amazon homepage
      When user extracts the dropdown values
      And user select the value from the dropdown
      Then user validates the dropdown values

      @sc02
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

       @sc05
       Scenario: Mouse Handling
       Given user navigates to amazon homepage
       When user clicks on baby wishlist
       Then user validate the field name