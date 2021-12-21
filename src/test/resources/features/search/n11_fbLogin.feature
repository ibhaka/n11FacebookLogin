Feature: n11 login validation on facebook

  @n11_fbLogin
  Scenario: n11 login on facebook
    Given user launch browser and open the login page
    When user sign in with valid credentials on facebook
    Then user sign in successfully

