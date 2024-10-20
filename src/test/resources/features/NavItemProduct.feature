Feature: Nav Item Product

  Scenario: Validação do texto do Item de Navegação Product
    Given que o usuário esteja na página PHPTRAVELS
    Then o texto do Item de Navegação Product deve estar correto

  Scenario: Validação do click no Item de Navegação de Produtos
    Given que o usuário esteja na página PHPTRAVELS
    When clicar no Item de Navegação Product
    Then o menu dropdown correspondente deve ser exibido

  Scenario: Validação do texto do item Themes do dropdown de Produtos
    Given que o usuário esteja na página PHPTRAVELS
    When clicar no Item de Navegação Product
    Then o texto do item Themes do menu dropdown deve estar correto

  Scenario: Validação da cor do background do item Themes do dropdown de Produtos
    Given que o usuário esteja na página PHPTRAVELS
    When clicar no Item de Navegação Product
    And der hover no item Themes
    Then a cor do item Themes do menu dropdown deve estar correto

  Scenario: Validação do click no item Themes do dropdown de Produtos
    Given que o usuário esteja na página PHPTRAVELS
    When clicar no Item de Navegação Product
    And clicar no Item Themes do dropdown Product
    Then deve ser redirecionado para a página correta