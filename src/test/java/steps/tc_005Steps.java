package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    tc_005Page page = new tc_005Page();

    @Given("el usuario navega a la página de carga de documentos")
    public void navigateToUploadPage() {
        page.navigateToUploadPage();
    }

    @When("el usuario carga un archivo PDF válido")
    public void uploadValidPDF() {
        page.uploadPDF();
    }

    @Then("el sistema muestra un mensaje de éxito con detalles del documento")
    public void validateSuccessMessage() {
        Assert.assertTrue(page.isUploadSuccessful());
    }

    @Then("el documento se registra en la base de datos y aparece en la lista de documentos cargados")
    public void verifyDocumentPersistence() {
        Assert.assertTrue(page.isDocumentPersisted());
    }
}