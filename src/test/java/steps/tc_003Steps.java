package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page uploadPage = new tc_003Page();

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        uploadPage.navigateToUploadPage();
    }

    @When("Intenta seleccionar un archivo PDF que excede el tamaño permitido")
    public void intenta_seleccionar_un_archivo_pdf_que_excede_el_tamaño_permitido() {
        uploadPage.selectOversizedFile();
    }

    @Then("El sistema detecta el tamaño excesivo y rechaza el archivo")
    public void el_sistema_detecta_el_tamano_excesivo_y_rechaza_el_archivo() {
        Assert.assertTrue(uploadPage.isFileRejected());
    }

    @And("Se muestra un mensaje de error indicando que el archivo supera el tamaño máximo permitido")
    public void se_muestra_un_mensaje_de_error_indicando_que_el_archivo_supera_el_tamano_maximo_permitido() {
        Assert.assertTrue(uploadPage.isErrorMessageDisplayed());
    }
}