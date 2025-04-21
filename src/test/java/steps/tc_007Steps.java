package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.tc_007Page;
import static org.junit.Assert.*;

public class tc_007Steps {

    private WebDriver driver;
    private tc_007Page documentPage;

    public tc_007Steps() {
        driver = Hooks.getDriver();
        documentPage = new tc_007Page(driver);
    }

    @Given("El usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        documentPage.navigateToDocumentUploadPage();
    }

    @When("El usuario selecciona un documento PDF")
    public void elUsuarioSeleccionaUnDocumentoPDF() {
        documentPage.selectPdfDocument();
    }

    @And("El usuario cancela la operación antes de la carga")
    public void elUsuarioCancelaLaOperacionAntesDeLaCarga() {
        documentPage.cancelUploadOperation();
    }

    @Then("El sistema debería cancelar la carga y no registrar ningún cambio")
    public void elSistemaDeberiaCancelarLaCargaYNoRegistrarNingunCambio() {
        assertFalse(documentPage.isUploadInProgress());
    }

    @And("El documento no debería aparecer en la lista de documentos cargados")
    public void elDocumentoNoDeberiaAparecerEnLaListaDeDocumentosCargados() {
        assertFalse(documentPage.isDocumentInList());
    }
}