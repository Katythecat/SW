package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Elements {
    public static void main(String[] args) {
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF); // Suppress Selenium logging
        // Logger just make a console cleaner
        WebDriver driver = null;
        // Use try-with-resources to ensure WebDriver resources are properly closed
         try {
             driver = new ChromeDriver();
             driver.manage().window().maximize();
             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

             driver.get("https://ebay.com");

             // Wait for the page to load and explicitly wait for the presence of links
             wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));

             // Find all links within the main content area
             List<WebElement> allLinks = driver.findElements(By.tagName("a"));
             for (WebElement link : allLinks) {
                 String text = link.getText();
                 String url = link.getAttribute("href");

                 // Print link text and URL
                 System.out.println(text);
                 System.out.println(url);
             }
         }catch (Exception e){
             e.printStackTrace();
         }finally {
             driver.quit();
         }
            

    }

    }

