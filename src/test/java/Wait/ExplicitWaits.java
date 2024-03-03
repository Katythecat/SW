package Wait;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaits {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
//implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

        driver.findElement(By.className("btn-default")).click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        driver.findElement(By.id("changetext_button")).click();
        wait.until(ExpectedConditions.textToBe((By.id("headingtext")),"Ssyntaxtechs"));

        String text=driver.findElement(By.id("headingtext")).getText();


        Assert.assertEquals(text,"Ssyntaxtechs");

        driver.quit();






    }
}
