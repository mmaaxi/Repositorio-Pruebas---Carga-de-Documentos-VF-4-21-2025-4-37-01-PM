Feature: Cancelación de la carga de documento

  Scenario: Cancelación de la carga antes de completar
    Given El usuario está en la página de carga de documentos
    When El usuario selecciona un documento PDF
    And El usuario cancela la operación antes de la carga
    Then El sistema debería cancelar la carga y no registrar ningún cambio
    And El documento no debería aparecer en la lista de documentos cargados