package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {

    tc_008Page uploadPage = new tc_008Page();

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        uploadPage.navigateToUploadPage();
    }

    @When("El usuario intenta cargar un archivo con código malicioso embebido")
    public void el_usuario_intenta_cargar_un_archivo_con_código_malicioso_embebido() {
        uploadPage.uploadMaliciousFile();
    }

    @Then("El sistema realiza un escaneo de seguridad y bloquea la carga del archivo")
    public void el_sistema_realiza_un_escaneo_de_seguridad_y_bloquea_la_carga_del_archivo() {
        Assert.assertTrue("El archivo fue bloqueado por el escaneo de seguridad",
                uploadPage.isFileUploadBlocked());
    }

    @Then("Se muestra un mensaje de advertencia sobre la posible amenaza")
    public void se_muestra_un_mensaje_de_advertencia_sobre_la_posible_amenaza() {
        Assert.assertTrue("Se mostró el mensaje de advertencia",
                uploadPage.isWarningMessageDisplayed());
    }
}