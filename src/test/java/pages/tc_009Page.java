package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {

    WebDriver driver;

    By uploadField = By.id("uploadField");
    By validateButton = By.id("validateButton");
    By statusField = By.id("statusField");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarArchivoPDF(String filePath) {
        WebElement uploadElement = driver.findElement(uploadField);
        uploadElement.sendKeys(filePath);
    }

    public boolean iniciarValidacionDeIntegridad() {
        WebElement validateElement = driver.findElement(validateButton);
        validateElement.click();
        // Simulate waiting for a response
        return true; // Assume the request is sent correctly
    }

    public boolean recibirRespuestaDeValidacion() {
        // Mock response from external service
        // Here we could use a stub or a mock object to simulate the service response
        return true; // Assume positive response
    }

    public String obtenerEstadoArchivo() {
        WebElement statusElement = driver.findElement(statusField);
        return statusElement.getText(); // Returns the status of the file
    }
}