Feature: Place Order

  Scenario: Search Single Item
  Given User is on Home Page
  When User Search an Item "Macbook Air"
  Then Item must be listed

  Scenario: Add Item to cart
 Given User should be on Search Result page
 When User add item to cart 
 Then Item must be added

#  Scenario: Checkout Order
#  When User do Checkout 
 # Then Should navigate to Checkout page