package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/handle-iframe.php");

        driver.switchTo().frame("textfieldIframe");
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("cat");
        driver.switchTo().frame("checkboxIframe");
        driver.findElement(By.cssSelector("input.cb1-element")).click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");

        WebElement ani=driver.findElement(By.id("animals"));
        Select select=new Select(ani);
        select.selectByIndex(3);


    }
}
