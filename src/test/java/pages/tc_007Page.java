package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {

    private WebDriver driver;
    private By uploadButton = By.id("uploadButton");
    private By cancelButton = By.id("cancelButton");
    private By documentList = By.id("documentList");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void selectPdfDocument() {
        driver.findElement(uploadButton).sendKeys("/path/to/document.pdf");
    }

    public void cancelUploadOperation() {
        driver.findElement(cancelButton).click();
    }

    public boolean isUploadInProgress() {
        // Implement logic to check if upload is in progress
        return false;
    }

    public boolean isDocumentInList() {
        // Implement logic to verify if the document is in the list
        return driver.findElements(documentList).stream()
                .noneMatch(element -> element.getText().contains("document.pdf"));
    }
}