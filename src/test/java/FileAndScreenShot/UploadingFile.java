package FileAndScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFile {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("https://syntaxprojects.com/upload-image.php");

        WebElement uploadFile = driver.findElement(By.id("image-file"));
        uploadFile.sendKeys("C:\\Users\\Wilasinee Ramirez\\Downloads\\capture.png");



    }
}
