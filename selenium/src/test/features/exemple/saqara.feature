

@tag
Feature: Site leadgen CP saqara
  verifications des liens 

  
  @tag2
  Scenario Outline: test de bout en bout 
    Given ouvrir Chromee <name>
    
    And ouvrir url <name>
    When saisir mail <value> 
    And saisir mot de passee <value> 
    And tappez sur connecter <value> 
    
    Then I verify the <status> 

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
