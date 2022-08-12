Feature: Búsqueda en SwagLab

  @test
  Scenario: Búsqueda simple de producto

    Given me encuentro en el login de SwagLab
    When escribo mis credenciales "standard_user" y "secret_sauce"
    And hago click en boton Login
    Then se valida el titulo "PRODUCTS"
    And al menos exista un item