Feature: Becoming a member
  Is a customer a member?

  Scenario:Becoming a member
    Given Customer is not already a member
    When Customer signs up to become a member
    Then Customer becomes a member AND receives a membership card with a membership ID AND can rent DVDs

  Scenario: Already a member
    Given Customer is already a member
    When Customer signs up to become a member
    Then Customer should be told that they are already a member