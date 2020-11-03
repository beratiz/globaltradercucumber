@product
Feature: US_102_verify_the_product_not_add_in_wishlist

  Background: User is on the start page
    Given user is on the start page

  Scenario: TC01 Verify the product not add in wishlist
    And user clicks on the women clothing
    And user clicks on the tassels dresses
    And user clicks on the product
    And user click on the add to wishlist
    Then verify the allert contains "Please Login to use this option."