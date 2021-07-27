
@tag
Feature: Login
  
  @tag1
  Scenario: I wanted successfully login to the application
  
  Given user should open the browser and eneter the url of the application
  And clcik on login button
  When enter the valid username
  And  eneter the valid password
  And click on login buttton
  And print the titlte and URL of the application
  Then user should be successfully login into the application  
  
    