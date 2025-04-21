package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_006Page;

public class tc_006Steps {

    WebDriver driver = new ChromeDriver();
    tc_006Page page = new tc_006Page(driver);

    @Given("Un fallo de red durante la carga")
    public void fallo_de_red_durante_la_carga() {
        page.simularFalloDeRed();
        Assert.assertTrue(page.verificarFalloDeRed());
    }

    @When("Hago clic en 'Reintentar'")
    public void hago_clic_en_reintentar() {
        page.clickReintentar();
    }

    @Then("Se debe mostrar un mensaje de confirmación de éxito en la carga")
    public void se_debe_mostrar_un_mensaje_de_exito_en_la_carga() {
        Assert.assertTrue(page.verificarCargaExitosa());
        driver.quit();
    }
}