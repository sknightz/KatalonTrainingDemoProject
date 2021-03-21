Feature: Test login functionality

  @smoke
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is naviageted to the home page

    @valid
    Examples: 
      | username | password |
      | Admin    | admin123 |

    @invalid
    Examples: 
      | username | password |
      | Admin123 | abc456   |
