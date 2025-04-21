Feature: Prueba de reintento en fallo de carga

  Scenario: Reintentar carga tras fallo de red
    Given Un fallo de red durante la carga
    When Hago clic en 'Reintentar'
    Then Se debe mostrar un mensaje de confirmación de éxito en la carga