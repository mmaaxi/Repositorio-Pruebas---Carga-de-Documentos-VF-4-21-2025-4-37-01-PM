package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_002Page {
    private WebDriver driver;
    private WebDriverWait wait;
    
    private By fileInput = By.id("file-input");
    private By uploadButton = By.id("upload-button");
    private By unsupportedFormatMessage = By.id("unsupported-format-message");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void selectFileWithFormat(String format) {
        WebElement fileInputElement = wait.until(ExpectedConditions.elementToBeClickable(fileInput));
        fileInputElement.sendKeys("/path/to/file." + format.toLowerCase());
    }
    
    public boolean isUnsupportedFormatMessageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(unsupportedFormatMessage)).isDisplayed();
    }
    
    public void tryToUploadFile() {
        WebElement uploadButtonElement = wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
        uploadButtonElement.click();
    }
    
    public boolean isUploadNotAllowed() {
        // Implement logic to verify if the upload action was prevented
        // This could be checking for an absence of a success message, etc.
        return isUnsupportedFormatMessageDisplayed(); // Example condition
    }
}