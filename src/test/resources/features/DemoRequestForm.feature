Feature: DemoRequestForm

  Scenario: Digitar no campo FIRST NAME
    Given que o usuário esteja na página PHPTRAVELS
    When visualizar o campo FIRST NAME
    Then digita seu nome no campo FIRST NAME