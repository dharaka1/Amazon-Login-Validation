Feature: Website testing

Scenario: A to Z Testing the website
    Given User launch "<Browsers>"
    When Launch The Url 
    When user click Sigin
    And user Enter "<Username>"
    When user3 Clicks Continue
    And user2 Enter "<password>"
    Then user3 Clicks Sigin
    
         
    
    
     Examples:                                   
          | Browsers    |         username           |password    |
          | Chrome      |  Dharakasundar8@gmail.com  |Gayathri1   |
          | Edge        |  Dharakasundar8@gmail.com  |Gayathri1   |
          | FireFox     |  Dharakasundar8@gmail.com  |Gayathri1   |
     
               	
     