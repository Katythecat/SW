package SwitchTo;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        WebElement al=driver.findElement(By.cssSelector("button.btn.btn-default"));
        al.click();
        Alert alert= driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();

        System.out.println(alert.getText());
        alert.dismiss();
        String confirm=driver.findElement(By.id("confirm-demo")).getText();
        Assert.assertEquals(confirm,"You pressed Cancel!");

    }
}
