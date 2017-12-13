Feature: Test facebook smoke scenario

  Scenario: Test login with valid credencial
  
    Given Open Firefox and start application
    When  I enter valid "abi@gmail.com" and valid "selenium123"
    Then User should be able to login successfully
    Then Application closed
    

    