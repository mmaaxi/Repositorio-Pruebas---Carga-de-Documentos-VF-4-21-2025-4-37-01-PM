Feature: Validación de seguridad en la carga de documentos

  Scenario: Impedir la carga de archivos con código malicioso
    Given El usuario está en la página de carga de documentos
    When El usuario intenta cargar un archivo con código malicioso embebido
    Then El sistema realiza un escaneo de seguridad y bloquea la carga del archivo
    And Se muestra un mensaje de advertencia sobre la posible amenaza