Feature: Login

  Scenario: Redirecionamento para a página de login
    Given que o usuário esteja na página PHPTRAVELS
    When o usuário clicar no botão de Login
    Then deve ser redirecionado para o formulário de login
