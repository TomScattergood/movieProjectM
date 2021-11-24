Feature: Search for Mary Smith
  I want to search the customer table for Mary Smith

  Scenario: Searching for a member
    Given The customer with id 1 is in the customer database
    When I ask whether the customer with id 1 is in the customer database
    Then I should see customer info

  Scenario: Searching for a member
    Given Mary Smith is not in the customer database
    When I ask whether Mary Smith is a member
    Then I should be told no