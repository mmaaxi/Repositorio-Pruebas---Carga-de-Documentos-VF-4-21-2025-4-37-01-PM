package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {

    WebDriver driver;

    By reintentarButton = By.id("retry-button");
    By mensajeExito = By.id("success-message");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void simularFalloDeRed() {
        // Código para simular un fallo de red
    }

    public boolean verificarFalloDeRed() {
        // Lógica para verificar la presencia de un fallo de red
        return true;
    }

    public void clickReintentar() {
        WebElement button = driver.findElement(reintentarButton);
        button.click();
    }

    public boolean verificarCargaExitosa() {
        // Lógica para verificar si el mensaje de éxito se muestra
        return driver.findElement(mensajeExito).isDisplayed();
    }
}