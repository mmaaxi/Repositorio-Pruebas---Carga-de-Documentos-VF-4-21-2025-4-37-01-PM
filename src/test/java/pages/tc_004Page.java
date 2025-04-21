package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {
    
    WebDriver driver;

    By uploadButton = By.id("upload-btn");
    By corruptionMessage = By.id("corruption-msg");
    
    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://www.example.com/upload");
    }

    public void selectCorruptPdf() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/corrupt-file.pdf");
    }

    public void verifyFileIsCorrupt() {
        // Logic to verify the file integrity, usually handled on the backend
    }

    public void proceedToUpload() {
        // Attempt to upload the corrupt file
    }

    public void verifyCorruptionMessageDisplayed() {
        WebElement messageElement = driver.findElement(corruptionMessage);
        assert messageElement.isDisplayed();
    }
}