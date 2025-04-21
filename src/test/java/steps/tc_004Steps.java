package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;

public class tc_004Steps {

    WebDriver driver;
    tc_004Page page = PageFactory.initElements(driver, tc_004Page.class);

    @Given("^El usuario está en la página de carga de archivos$")
    public void el_usuario_está_en_la_página_de_carga_de_archivos() {
        page.navigateToUploadPage();
    }

    @When("^El usuario selecciona un archivo PDF dañado o incompleto$")
    public void el_usuario_selecciona_un_archivo_PDF_dañado_o_incompleto() {
        page.selectCorruptPdf();
    }

    @Then("^El sistema verifica la integridad del archivo y detecta que está corrupto$")
    public void el_sistema_verifica_la_integridad_del_archivo_y_detecta_que_está_corrupto() {
        page.verifyFileIsCorrupt();
    }

    @When("^El usuario procede a cargar el archivo$")
    public void el_usuario_procede_a_cargar_el_archivo() {
        page.proceedToUpload();
    }

    @Then("^Se muestra un mensaje indicando la corrupción del documento y se cancela la carga$")
    public void se_muestra_un_mensaje_indicando_la_corrupción_del_documento_y_se_cancela_la_carga() {
        page.verifyCorruptionMessageDisplayed();
    }
}