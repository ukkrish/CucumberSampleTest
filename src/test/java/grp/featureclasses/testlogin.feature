Feature: login to email account

  Scenario: Open a webpage and login to gmail account
    Given User opens webpage
    When User enters valid username and password and clicks on login button
    Then email inbox is shown

  Scenario: Open the Timer application and set the timer
    Given User opens the inbuilt Android Timer app 
    When User sets timer and taps on start button 
    Then the Timer starts counting down

