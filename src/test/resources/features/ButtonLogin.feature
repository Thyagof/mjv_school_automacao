Feature: Botão de Login

  Scenario: Validação da visibilidade do botão Login
    Given que o usuário esteja na página PHPTRAVELS
    Then o botão Login deve estar visível

  Scenario: Validação do texto do botão Login
    Given que o usuário esteja na página PHPTRAVELS
    Then o texto do botão Login deve estar correto

  Scenario: Validação da cor botão Login
    Given que o usuário esteja na página PHPTRAVELS
    Then a cor do botão Login deve estar correta

  Scenario: Validação da cor do botão Login quando sofre hover
    Given que o usuário esteja na página PHPTRAVELS
    When der hover no botão Login
    Then a cor do botão em hover Login deve estar correta

  Scenario: Redirecionamento para a página de login
    Given que o usuário esteja na página PHPTRAVELS
    When clicar no botão de Login
    Then deve ser redirecionado para o formulário de login
