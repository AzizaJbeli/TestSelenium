@tag
Feature: cas de test authenfication

  @tag1
  Scenario Outline: Authentification cas passant et non passant
    Given ouvrir Chrome
    And ouvrir URL application "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir "<user>" dans le login
    And saisir "<mdp>" dans mot de passe
    And taper sur le bouton connexion
    Then verifier le resultat obtenu "<resultat>"

    Examples: 
      | user  | mdp      | resultat            |
      | Admin | admin123 | Paul Collings       |
      | Aziza |   123456 | Invalid credentials |
      | adm   | admin123 | Invalid credentials |
      | Admin | admin    | Invalid credentials |
