package locator;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Locator1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_MainContent_username"))).sendKeys("Tester");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_MainContent_password"))).sendKeys("test");

            driver.findElement(By.className("button")).click();

            String text = driver.findElement(By.xpath("//h1[text()='Web Orders']")).getText();
            System.out.println(text);
            Assert.assertEquals(text, "Web Orders");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            driver.quit();
        }






    }
}
