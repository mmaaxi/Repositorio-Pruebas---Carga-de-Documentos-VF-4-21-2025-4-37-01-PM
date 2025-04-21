package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page page = new tc_002Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }
    
    @When("selecciona un archivo con formato {string}")
    public void selecciona_un_archivo_con_formato(String formato) {
        page.selectFileWithFormat(formato);
    }
    
    @Then("el sistema rechaza el archivo y muestra un mensaje indicando que el formato no es soportado")
    public void el_sistema_rechaza_el_archivo_y_muestra_un_mensaje_indicando_que_el_formato_no_es_soportado() {
        Assert.assertTrue(page.isUnsupportedFormatMessageDisplayed());
    }
    
    @When("intenta cargar el archivo")
    public void intenta_cargar_el_archivo() {
        page.tryToUploadFile();
    }
    
    @Then("no se permite la carga y se indica claramente el error de formato")
    public void no_se_permite_la_carga_y_se_indica_claramente_el_error_de_formato() {
        Assert.assertTrue(page.isUploadNotAllowed());
    }
}