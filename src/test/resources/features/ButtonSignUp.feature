Feature: Botão de Sign Up

  Scenario: Validação da visibilidade do botão Sign Up
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    Then o botão Sign Up deve estar visível

  Scenario: Validação do texto do botão Sign Up
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    Then o texto do botão Sign Up deve estar correto

  Scenario: Validação da cor botão Sign Up
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    Then a cor do botão Sign Up deve estar correta

  Scenario: Validação da cor do botão Sign Up quando sofre hover
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    When der hover no botão Sign Up
    Then a cor do botão em hover Sign Up deve estar correta

  Scenario: Redirecionamento para a página de Sign Up
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    When clicar no botão de Sign Up
    Then deve ser redirecionado para o formulário de Sign Up
