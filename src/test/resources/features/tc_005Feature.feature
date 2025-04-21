Feature: Validación del mensaje de confirmación tras carga exitosa

  Scenario: Carga y verificación de documento PDF válido
    Given el usuario navega a la página de carga de documentos
    When el usuario carga un archivo PDF válido
    Then el sistema muestra un mensaje de éxito con detalles del documento
    And el documento se registra en la base de datos y aparece en la lista de documentos cargados