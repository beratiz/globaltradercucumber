@dhltest
Feature: US_001_DHLShipping_should_be_available_for_IpadPro_on_the_table

  Scenario: TC_001 Testing if DHL shipping option for iPad Pro is available on the table
    Given user is on the start page
    And user clicks on the Computers&Office button
    And user clicks on the Ipad link
    And user clicks on the Apple Ipad Pro link
    And user clicks on the Shipping & Payments tab
    Then verify "DHL" is in the table
