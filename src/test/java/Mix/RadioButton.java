package Mix;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement firstButton = driver.findElement(By.xpath("//input[starts-with(@value,'Ma') and starts-with(@name,'op')]"));
        firstButton.click();
        if (firstButton.isSelected()) {
            driver.findElement(By.id("buttoncheck")).click();
            WebElement text = driver.findElement(By.cssSelector("p.radiobutton"));
            String t = text.getText();
            Assert.assertEquals(t, "Radio button 'Male' is checked");
        }


        List<WebElement> group = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement g : group) {
            String age = g.getAttribute("value");
            if (age.equals("15 - 50")) {
                g.click();
                break;



            }
        }
    }
}
