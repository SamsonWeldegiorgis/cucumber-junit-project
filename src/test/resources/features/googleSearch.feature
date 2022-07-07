
Feature: Google Search Title Verification

  User Story : As a user, when I am on the Google Search page
  I should be able to search whatever I want and see relevant information

  Background: User is on Google search page

  @smoke
  Scenario: Search functionality result title verification
   When  User types "etsy" in the google search box and click enter
    Then User sees "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone" is in the google title

  @googleSearch
  Scenario: Search functionality result title verification
   When  User types "apple" in the google search box and click enter
    Then User sees "apple - Google Searc" is in the google title

