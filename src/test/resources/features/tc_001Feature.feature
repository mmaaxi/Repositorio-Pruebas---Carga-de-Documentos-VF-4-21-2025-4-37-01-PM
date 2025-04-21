Feature: Carga de documento PDF válido

  Scenario: Selección y carga de un PDF válido
    Given el usuario ha seleccionado un archivo PDF válido
    When el usuario hace clic en el botón 'Cargar documento'
    Then el documento se carga exitosamente con un mensaje de confirmación
    And el documento aparece en la lista de documentos con estado 'Cargado'