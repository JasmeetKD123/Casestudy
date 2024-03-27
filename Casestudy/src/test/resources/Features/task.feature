Feature: Google Search
  As a user
  I want to be able to search on Google
  So that I can find relevant information

  Scenario Outline: Searching on Google with DataTable
    Given I am on the Google search page
    When I search for the following terms
      | Search Term |
      | <term>     |
    Then I should see search results for "<term>"

    Examples:
      | term     |
      | Java     |
      | Cucumber |
      | Selenium |

  Scenario Outline: Searching on Google with DataTable as Map
    Given I am on the Google search page
    When I search for the following terms and language
      | Search Term | Language |
      | <term>      | <lang>   |
    Then I should see search results for "<term>" in "<lang>"

    Examples:
      | term     | lang |
      | Java     | EN   |
      | Cucumber | EN   |
      | Selenium | EN   |
