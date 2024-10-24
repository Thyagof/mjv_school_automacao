Feature: DemoRequestForm

  Scenario: Validar a visibilidade do formulário
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    Then o formulário Demo Request Form deve estar visível

  Scenario: Validar envio do formulário vazio
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    When clicar no botão Submit
    Then o alerta avisando que o First Name deve ser preenchido deve ser exibido

  Scenario: Validar envio do formulário preenchido corretamente
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    When preencher o campo FIRST NAME
    And preencher o campo LAST NAME
    And selecionar o país no campo SELECT COUNTRY
    And preencher o campo WHATSAPP NUMBER
    And preencher o campo BUSINESS NAME
    And preencher o campo EMAIL
    And preencher o CAPTCHA
    And clicar no botão Submit
    Then deve ser exibido aviso de que as credenciais foram enviadas

  Scenario: Validar captcha com resultado errado
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    When preencher o campo FIRST NAME
    And preencher o campo LAST NAME
    And selecionar o país no campo SELECT COUNTRY
    And preencher o campo WHATSAPP NUMBER
    And preencher o campo BUSINESS NAME
    And preencher o campo EMAIL
    And preencher o CAPTCHA com valor inválido
    And clicar no botão Submit
    Then o alerta avisando que o resultado do captcha está errado deve ser exibido

  Scenario: Validar envio do formulário correto após envio com erro
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    When preencher o campo FIRST NAME
    And preencher o campo LAST NAME
    And selecionar o país no campo SELECT COUNTRY
    And preencher o campo WHATSAPP NUMBER
    And preencher o campo BUSINESS NAME
    And preencher o campo EMAIL com valor inválido
    And preencher o CAPTCHA
    And clicar no botão Submit
    And limpar o campo EMAIL
    And preencher o campo EMAIL
    And clicar no botão Submit
    Then deve ser exibido aviso de que as credenciais foram enviadas