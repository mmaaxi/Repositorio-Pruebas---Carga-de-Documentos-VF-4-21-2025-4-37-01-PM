Feature: Verificación de integración con servicios externos

  Scenario: Cargar un PDF y verificar integridad con un servicio externo
    Given El usuario carga un archivo PDF validado
    When El archivo es enviado para la validación de integridad
    Then El sistema recibe una respuesta positiva de validación
    And El sistema marca el archivo como 'Verificado'