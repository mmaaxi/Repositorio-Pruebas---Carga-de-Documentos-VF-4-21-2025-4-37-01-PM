package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_001Page {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "file-upload")
    WebElement uploadInput;

    @FindBy(id = "upload-button")
    WebElement uploadButton;

    @FindBy(id = "success-message")
    WebElement successMessage;

    @FindBy(xpath = "//table[@id='document-list']//tr[td[text()='valido.pdf']]")
    WebElement uploadedDocumentRow;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void seleccionarArchivo(String rutaArchivo) {
        uploadInput.sendKeys(rutaArchivo);
    }

    public boolean verificarNombreArchivo(String nombreArchivoEsperado) {
        String nombreArchivoCargado = uploadInput.getAttribute("value");
        return nombreArchivoCargado.contains(nombreArchivoEsperado);
    }

    public void cargarDocumento() {
        uploadButton.click();
    }

    public boolean verificarMensajeCargaExitosa() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        return successMessage.isDisplayed();
    }

    public boolean verificarEstadoDocumentoEnLista(String nombreArchivo) {
        wait.until(ExpectedConditions.visibilityOf(uploadedDocumentRow));
        return uploadedDocumentRow.isDisplayed();
    }
}