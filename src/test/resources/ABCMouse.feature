Feature: ABC Mouse

  @ABCMouse
  Scenario:
    Given user navigates to "{{baseUrl}}".
#    And waits for 155 seconds
    And clicks on signup button from ABC home page.
    And user verifies the "Become a member!" text is visible on the page.
    Then waits for url to be "{{baseUrl}}/abc/prospect-register/" and verifies it.
    And enters a "{{configEmail}}" address then submits.
    Then waits for url to be "{{baseUrl}}/abc/subscription/" and verifies it.