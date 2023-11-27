Feature: ABC Mouse

  @HerokuApp
  Scenario: Happy login
    Given user navigates to "{{herokuAppBaseUrl}}".
#    And waits for 155 seconds
    And clicks on "Form Authentication" from heroku app home page.
    And user verifies the "Login Page" text is visible on the heroku login page.
    Then waits for url to be "{{herokuAppBaseUrl}}/login" and verifies it.
    And enters "{{userName}}" as user name and "{{password}}" as password and logs in.
    Then waits for url to be "{{herokuAppBaseUrl}}/secure" and verifies it.
    And user verifies the "Secure Area" text is visible on the heroku login page.
    And user verifies the "Welcome to the Secure Area. When you are done click logout below." text content is visible.