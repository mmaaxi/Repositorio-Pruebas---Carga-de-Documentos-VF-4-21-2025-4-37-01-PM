Feature: Prueba de accesibilidad y usabilidad en la carga de documentos

  Scenario: Verificar adaptabilidad de la interfaz desde diferentes plataformas
    Given el usuario accede a la funcionalidad de carga de documentos
    When lo hace desde diferentes dispositivos y navegadores
    Then la interfaz se adapta correctamente y es accesible desde múltiples plataformas

  Scenario: Verificar claridad de los mensajes de error y éxito
    Given el usuario carga un documento
    When ocurre un error o éxito durante la carga
    Then los mensajes son claros e intuitivos y la experiencia de usuario es satisfactoria