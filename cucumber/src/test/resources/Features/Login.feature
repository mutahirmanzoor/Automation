Feature: Test the Login functionality
	#@SmokTest
  Scenario: Test Login Success with valid credentials
    Given user is on login page
    When user enters uname and password
    And clicks on login button
    Then user is navigated to the home

  #Scenario Outline: : Test Login Success with valid credentials
    #Given user is on login page
    #When user enters <uname> and <password>
    #And clicks on login button
    #Then user is navigated to the home
#
    #Examples: 
      #| uname | password |
      #| user1 | pass1    |
      #| user2 | pass2    |
