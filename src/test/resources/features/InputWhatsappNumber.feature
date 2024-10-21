Feature: Input WhatsApp Number

  Scenario: Validar a visibilidade do campo WhatsApp Number
    Given que o usuário esteja na página PHPTRAVELS
    Then o campo WHATSAPP NUMBER deve estar visível

  Scenario: Validar o placeholder do campo WhatsApp Number
    Given que o usuário esteja na página PHPTRAVELS
    Then o placeholder do campo WHATSAPP NUMBER deve estar correto

  Scenario: Validar o preenchimento do campo WhatsApp Number
    Given que o usuário esteja na página PHPTRAVELS
    When preencher o campo WHATSAPP NUMBER
    Then o campo WHATSAPP NUMBER deve estar devidamente preenchido

  Scenario: Validar que o campo WhatsApp Number não aceita letras
    Given que o usuário esteja na página PHPTRAVELS
    When preencher o campo WHATSAPP NUMBER com letras
    Then o campo WHATSAPP NUMBER não deve aceitar letras

  Scenario: Validar a cor da borda do campo WhatsApp Number ao ser clicado
    Given que o usuário esteja na página PHPTRAVELS
    When clicar no campo WHATSAPP NUMBER
    Then a borda do campo WHATSAPP NUMBER deve mudar de cor
