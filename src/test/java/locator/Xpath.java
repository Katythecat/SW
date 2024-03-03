package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://syntaxprojects.com/Xpath.php");
        driver.findElement(By.xpath("//input[@name='exactUserEntry']")).sendKeys("Leo");

        driver.findElement(By.xpath("//button[contains(text(), 'Click Here')]")).click();
        driver.findElement(By.xpath("//input[contains(@name , 089)]")).sendKeys("What is you cat weight");

        // using text contains
        String text=driver.findElement(By.xpath("//label[contains(text(), 'ipsum dolor')]")).getText();
        System.out.println(text);

        // using starts-with
        driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]")).sendKeys("1123.2.11");

        // using indexing
        driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]")).sendKeys("abc@gmail.com");

        // use multiple attributes & operator
        driver.findElement(By.xpath("(//input[@data-detail='two' and @name='customField'])")).sendKeys("abc@gmail.com");

        driver.quit();


    }
}
