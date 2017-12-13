Feature: Test facebook smoke scenario

  Scenario: Test login with valid credencial
    Given Open Firefox and start application
    When I enter valid "abi@gmail.com" and valid "selenium123"
    Then User should be able to login successfully
    Then Application closed

  Scenario Outline: Test login with valid credencial
    Given Open Firefox and start application
    When I enter valid "<username>" and valid "<password>"
    Then User should be able to login successfully
    Then Application closed

    Examples: 
      | username       | password |
      | avi@gmail.com  | abc123   |
      | avin@gmail.com | avn123   |
