
Feature: Sheet1 @feature_user_login

  Background: 
    Given the user is on the Candidate Profiles Search Page

  @search-candidate-profiles
  Scenario Outline: NLP Smart Search for Candidate Profiles
    When I enter a natural language query to search for candidates
    Then the system should display relevant candidate profiles based on the query

    Examples:
      | query                          |
      | "Java developer in New York"   |
      | "Senior data analyst with Python" |
      | "Marketing manager with 5 years experience" |
