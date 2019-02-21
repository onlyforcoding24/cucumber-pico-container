Feature: Login

  ashgdvahd ajsd ad jd ada j dajdb ad kjabd ad
  ajdhbadh ad jawh dad jhd absd
  ashdb ashd asd

  Scenario Outline: Login with valid credentials
    Given I am on login page
    When I enter "<username>" and "<passowrd>"
    And I click on submit button
    Then I am on home page

    Examples:
      | username | passowrd                         |
      | mahadev  | hsefhsfbsfshfhf                  |
      | jtu      | jhgahfhfvahsfvahfvasfvafgavfhgaf |

    Scenario: Logout
      Given I am on login page
      When I enter "<username>" and "<passowrd>"
      And I click on submit button
      And I am on home page
      Then I log out
