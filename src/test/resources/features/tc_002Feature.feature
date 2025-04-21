Feature: Carga de documento con formato no soportado

  Scenario: Intentar cargar un documento con formato JPG
    Given el usuario está en la página de carga de documentos
    When selecciona un archivo con formato "JPG"
    Then el sistema rechaza el archivo y muestra un mensaje indicando que el formato no es soportado
    When intenta cargar el archivo
    Then no se permite la carga y se indica claramente el error de formato