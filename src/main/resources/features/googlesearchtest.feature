Feature: As a google user, I am able to search in the google search engine
#
#  Scenario: Search for a device
#    Given I go to "https://www.google.com"
#    And I put "iPhone" in the search box
#    When I click on search button
#    Then I should see all the related results
#    And I close the browser

  Scenario Outline: Search for a device
    Given I go to '<url>'
    And I put '<product>' in the search box
    When I click on search button
    Then I should see all the related results
    And I close the browser

    Examples:
      | url                    | product |
      | https://www.google.com | iPhone  |
      | https://www.google.com | samsung |
      | https://www.google.com | moto    |