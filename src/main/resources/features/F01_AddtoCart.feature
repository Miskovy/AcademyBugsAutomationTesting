@smoke
Feature: F01_Addtocart | Checking all the "Add To Cart" buttons
  Scenario: user adds all the items to the cart
    Given user goto academybugs
    When the user adds the items to cart
    And check whether all buttons are green colored and called checkout now
    Then user clicks view cart

