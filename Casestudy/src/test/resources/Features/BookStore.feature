# https://automationbookstore.dev/

Feature: Bookstore Website Testing

  Scenario: Verify Homepage Title
    Given User navigates to the homepage
    Then User should see the title "Automation Bookstore"

  Scenario: Search for a Book
    Given User is on the homepage
    When User searches for "Selenium WebDriver"
    Then User should see search results containing the book "Selenium WebDriver in Practice"

  Scenario: Add Book to Cart
    Given User is on the homepage
    When User searches for "Java Programming"
    And User adds "Java Programming for Beginners" to the cart
    Then User should see the book added to the cart

  Scenario: Remove Book from Cart
    Given User has added "Java Programming for Beginners" to the cart
    When User removes the book from the cart
    Then User should see the cart is empty