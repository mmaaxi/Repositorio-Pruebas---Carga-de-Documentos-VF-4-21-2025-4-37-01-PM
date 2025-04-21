Feature: Validación de tamaño de documento

  Scenario: Intentar cargar un archivo PDF cuyo tamaño excede el límite permitido
    Given El usuario está en la página de carga de documentos
    When Intenta seleccionar un archivo PDF que excede el tamaño permitido
    Then El sistema detecta el tamaño excesivo y rechaza el archivo
    And Se muestra un mensaje de error indicando que el archivo supera el tamaño máximo permitido