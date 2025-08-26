Feature: deposit
    As a customer
    I want to deposit money to ATM
    so that I can increase my account balance

Background:
    Given a customer with id 1 and pin 111 with balance 200.0 exists
    And I login to ATM with id 1 and pin 111

Scenario: Deposit money
    When I deposit 100.0 to ATM
    Then my account balance is 300.0

Scenario: Deposit zero amount
    When I deposit 0.0 to ATM
    Then my account balance is 200.0

Scenario: Deposit negative amount
    When I deposit -50.0 to ATM
    Then my account balance is 150.0

Scenario: Deposit negative amount more than balance
    When I try to deposit -300.0 to ATM
    Then my account balance is 200.0