Feature: n11 login

@login
Scenario: n11 signup
  Given user launch browser and open the login page
  When user signed in with valid credentials on Facebook
  Then user signed in successfully
