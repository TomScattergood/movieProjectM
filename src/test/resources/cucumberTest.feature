Feature: George Test
  Is George Test a member?

  Scenario: Searching for a member
    Given George Test is in the customer database
    When I ask whether George Test is a member
    Then I should be told yes

  Scenario: Searching for a member
    Given George Test is not in the member database
    When I ask whether George Test is a member
    Then I should be told no