Feature: Carga de documento corrupto

  Scenario: Verificar carga de archivo PDF corrupto
    Given El usuario está en la página de carga de archivos
    When El usuario selecciona un archivo PDF dañado o incompleto
    Then El sistema verifica la integridad del archivo y detecta que está corrupto
    When El usuario procede a cargar el archivo
    Then Se muestra un mensaje indicando la corrupción del documento y se cancela la carga