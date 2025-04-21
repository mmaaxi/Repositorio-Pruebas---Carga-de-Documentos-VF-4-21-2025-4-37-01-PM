package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("el usuario ha seleccionado un archivo PDF válido")
    public void seleccionarArchivoPdfValido() {
        page.seleccionarArchivo("ruta/del/archivo/valido.pdf");
        Assert.assertTrue("El archivo seleccionado es incorrecto.", page.verificarNombreArchivo("valido.pdf"));
    }

    @When("el usuario hace clic en el botón 'Cargar documento'")
    public void hacerClicEnCargarDocumento() {
        page.cargarDocumento();
    }

    @Then("el documento se carga exitosamente con un mensaje de confirmación")
    public void verificarCargaExitosa() {
        Assert.assertTrue("El documento no se cargó correctamente.", page.verificarMensajeCargaExitosa());
    }

    @Then("el documento aparece en la lista de documentos con estado 'Cargado'")
    public void verificarDocumentoEnLista() {
        Assert.assertTrue("El documento no aparece en la lista con el estado 'Cargado'.", page.verificarEstadoDocumentoEnLista("valido.pdf"));
    }
}