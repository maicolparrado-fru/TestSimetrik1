Feature: Como usuario de google quiero buscar la palabra simetrik y que no me traiga cero resultados

  @BuscarPalabra
  Scenario: Verificar el funcionamiento del motor de busqueda
    Given ir al navegador de Google Chrome
    When digitar la palabra "simetrik" en el buscador
    And dar enter para que se inicie la busqueda
    Then validar que el total de resultados de consulta sea diferente a cero