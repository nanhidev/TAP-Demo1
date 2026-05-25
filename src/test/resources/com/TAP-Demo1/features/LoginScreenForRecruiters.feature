
@feature_user_login
Feature: LoginScreenForRecruiters

Background: 
  Given the user is on the Welcome Page

@valid-login
Scenario Outline: Login Screen for Recruiters
  When the user opens the application
  Then the application opens successfully
  And the user verifies the presence of the 'Get Started' button
  Then the 'Get Started' button is visible
  When the user clicks on the 'Get Started' button
  Then the user is navigated to the Organization signup screen
  When the user clicks on the 'Continue as Organization' button
  Then the user is navigated to the Login page

Examples:
  | username | password |
  | <username> | <password> |

@valid_login
Scenario Outline: Login Screen for Recruiters
  Given the user enters "<email>" in the Email field
  And the user enters "<password>" in the Password field
  And the Login button is enabled
  When the user clicks on the Login button
  Then the user should be redirected to the dashboard
  And the dashboard is displayed without errors

  Examples:
    | email                   | password            |
    | recruiter@example.com   | SecurePassword123   |

  @feature_user_login
  @toggle_password_visibility
  Scenario Outline: Login Screen for Recruiters
    Given the user enters <password> in the Password field
    When the user clicks on the 'Show/Hide Password' option
    Then the password should be visible
    When the user clicks on the 'Show/Hide Password' option again
    Then the password should be hidden

    Examples:
      | password      |
      | P@ssw0rd123   |

@valid_login_button_enabled
Scenario Outline: Login Screen for Recruiters
  Given I enter a valid email ID <email> in the Email field
  And I enter a valid password <password> in the Password field
  Then the Login button should be enabled

Examples:
  | email              | password           |
  | krishna@gmail.com  | SecurePassword123   |

@valid-email-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click on the Login button
  Then the user should be directed to the Dashboard

  Examples:
    | email                       | password          |
    | user.name@subdomain.example.com | ValidPassword123 |
    | user+name@example.com      | ValidPassword123  |

@chrome-login
Scenario Outline: Login Screen for Recruiters in Chrome
  Given the user opens the application in Chrome
  When the user enters <username> and <password> and logs in
  Then the user logs in successfully in Chrome
  And the user logs out

@firefox-login
Scenario Outline: Login Screen for Recruiters in Firefox
  Given the user opens the application in Firefox
  When the user enters <username> and <password> and logs in
  Then the user logs in successfully in Firefox
  And the user logs out

@safari-login
Scenario Outline: Login Screen for Recruiters in Safari
  Given the user opens the application in Safari
  When the user enters <username> and <password> and logs in
  Then the user logs in successfully in Safari
  And the user logs out

Examples:
  | username | password |
  | user1    | pass1    |

@desktop-login
Scenario Outline: Open the application on a desktop and log in
  Given the user opens the application on a desktop
  When the user enters "<username>"
  And the user enters "<password>"
  And the user clicks the login button
  Then the user logs in successfully
  And the user logs out

@tablet-login
Scenario Outline: Open the application on a tablet and log in
  Given the user opens the application on a tablet
  When the user enters "<username>"
  And the user enters "<password>"
  And the user clicks the login button
  Then the user logs in successfully
  And the user logs out

@mobile-login
Scenario Outline: Open the application on a mobile device and log in
  Given the user opens the application on a mobile device
  When the user enters "<username>"
  And the user enters "<password>"
  And the user clicks the login button
  Then the user logs in successfully

Examples:
  | username       | password            |
  | recruiter123   | SecurePassword!123  |

  @feature_user_login
  @valid_login_after_password_reset
  Scenario Outline: Login Screen for Recruiters
    Given the user is on the Login page
    When the user enters "<email>" in the Email field
    And the user enters "<password>" in the Password field
    And the user clicks on the Login button
    Then the user logs in successfully with the new password

    Examples:
      | email                   | password          |
      | valid_email@example.com | new_password_value |
