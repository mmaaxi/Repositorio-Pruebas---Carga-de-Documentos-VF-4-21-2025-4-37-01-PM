package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class tc_008Page {

    private WebDriver driver;
    private WebDriverWait wait;

    private By fileUploadInput = By.id("fileUpload");
    private By uploadButton = By.id("uploadButton");
    private By warningMessage = By.id("warningMessage");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadMaliciousFile() {
        WebElement uploadElement = driver.findElement(fileUploadInput);
        uploadElement.sendKeys("/path/to/malicious_file.txt");
        driver.findElement(uploadButton).click();
    }

    public boolean isFileUploadBlocked() {
        // Logic to verify if the file upload was blocked
        return driver.findElements(warningMessage).size() > 0;
    }

    public boolean isWarningMessageDisplayed() {
        // Logic to confirm that the warning message is displayed
        wait.until(ExpectedConditions.visibilityOfElementLocated(warningMessage));
        return driver.findElement(warningMessage).isDisplayed();
    }
}