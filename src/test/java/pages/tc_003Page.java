package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_003Page {
    private WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By errorMessage = By.id("errorMsg");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectOversizedFile() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/oversized/file.pdf");
    }

    public boolean isFileRejected() {
        // Implement logic to verify if file is rejected
        return true; // Example return
    }

    public boolean isErrorMessageDisplayed() {
        WebElement errorElement = driver.findElement(errorMessage);
        return errorElement.isDisplayed();
    }
}