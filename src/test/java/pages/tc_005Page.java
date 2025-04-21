package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_005Page {
    WebDriver driver;

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Element locators
    private By uploadButton = By.id("uploadButton");
    private By successMessage = By.id("successMessage");
    private By documentList = By.id("documentList");

    // Navigate to upload page
    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    // Upload PDF file
    public void uploadPDF() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/valid_document.pdf");
        uploadElement.submit();
    }

    // Check for success message
    public boolean isUploadSuccessful() {
        return driver.findElement(successMessage).isDisplayed();
    }

    // Verify document in the list
    public boolean isDocumentPersisted() {
        return driver.findElements(documentList).size() > 0;
    }
}