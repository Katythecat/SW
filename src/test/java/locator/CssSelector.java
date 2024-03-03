package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/cssSelector.php");

        //when find by id using css we can do this way
        driver.findElement(By.cssSelector("input[id='profileID']")).sendKeys("123");

        // id  tagname#idname
        driver.findElement(By.cssSelector("input#profileBox")).sendKeys("234");

        // class tagname.classname
        driver.findElement(By.cssSelector("input.form-control.feedbackBox1")).sendKeys("345");

        // we use * for contains first * mean any tagname and second mean contains
        driver.findElement(By.cssSelector("*[name*='content']")).sendKeys("444");

        // we use ^ for starts with
        driver.findElement(By.cssSelector("*[name^='Intro']")).sendKeys("555");

        // we use $ for ends with
        driver.findElement(By.cssSelector("*[name$='Input']")).sendKeys("888");



    }
}
