Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: User goes to the Index page

Given user is on Index page
Then find title CMIS

Scenario: User clicks tree root

Given user is on Index page
When user clicks tree root
Then node Root is found
Then root is selected

Scenario: User expands tree root

Given user is on Home page
When user clicks root expand
Then root is expanded

Scenario: User clicks delete button

Given user is on Home page
Then user clicks delete button for folder
Then user clicks cancel button on delete folder page
Then user clicks create button for folder
Then user clicks cancel button on create folder page
