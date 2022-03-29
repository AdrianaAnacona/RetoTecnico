#AdrianaAnacona
@Stories
Feature: Registrar usuario en pagina web utest
  Yo como usuario en la pagina web utest
  Necesito registrarme
  Para acceder al sistema
  @Escenario1
  Scenario: Registrar usuario existoso
    Given Adriana esta en la pagina web utest
    And va a la opcion para registrar en home
    When ingresa los datos correctos en el formulario
    Then usuario sera registrado en el sistema