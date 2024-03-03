package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Locator {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://fb.com");
//        driver.findElement(By.name("email")).sendKeys("kk.wilasinee@gmail.com");
//        driver.findElement(By.cssSelector("#pass")).sendKeys("Kwangwila121512");
//        driver.findElement(By.name("login")).click();



//        driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("password")).click();




    }
}
