package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;

public class tc_010Steps {

    WebDriver driver;
    tc_010Page page = new tc_010Page(driver);

    @Given("el usuario accede a la funcionalidad de carga de documentos")
    public void el_usuario_accede_a_la_funcionalidad_de_carga_de_documentos() {
        page.navigateToUploadFunctionality();
    }

    @When("lo hace desde diferentes dispositivos y navegadores")
    public void lo_hace_desde_diferentes_dispositivos_y_navegadores() {
        page.checkResponsivenessAcrossDevices();
    }

    @Then("la interfaz se adapta correctamente y es accesible desde múltiples plataformas")
    public void la_interfaz_se_adapta_correctamente_y_es_accesible_desde_múltiples_plataformas() {
        page.verifyInterfaceAdaptability();
    }

    @Given("el usuario carga un documento")
    public void el_usuario_carga_un_documento() {
        page.uploadDocument();
    }

    @When("ocurre un error o éxito durante la carga")
    public void ocurre_un_error_o_éxito_durante_la_carga() {
        page.simulateUploadOutcome();
    }

    @Then("los mensajes son claros e intuitivos y la experiencia de usuario es satisfactoria")
    public void los_mensajes_son_claros_e_intuitivos_y_la_experiencia_de_usuario_es_satisfactoria() {
        page.verifyClearMessages();
    }
}