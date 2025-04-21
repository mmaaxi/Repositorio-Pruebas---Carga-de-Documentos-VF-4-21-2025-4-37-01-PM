package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_009Page;

public class tc_009Steps {

    WebDriver driver;
    tc_009Page page = new tc_009Page(driver);

    @Given("El usuario carga un archivo PDF validado")
    public void el_usuario_carga_un_archivo_pdf_validado() {
        page.cargarArchivoPDF("ruta/del/archivo.pdf");
    }

    @When("El archivo es enviado para la validación de integridad")
    public void el_archivo_es_enviado_para_la_validacion_de_integridad() {
        Assert.assertTrue(page.iniciarValidacionDeIntegridad());
    }

    @Then("El sistema recibe una respuesta positiva de validación")
    public void el_sistema_recibe_una_respuesta_positiva_de_validacion() {
        Assert.assertTrue(page.recibirRespuestaDeValidacion());
    }

    @Then("El sistema marca el archivo como 'Verificado'")
    public void el_sistema_marca_el_archivo_como_verificado() {
        Assert.assertEquals("Verificado", page.obtenerEstadoArchivo());
    }
}