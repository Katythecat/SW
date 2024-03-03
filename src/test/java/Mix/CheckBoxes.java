package Mix;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

//        click on the checkbox
        WebElement cb = driver.findElement(By.id("isAgeSelected"));
        cb.click();
        WebElement msg=driver.findElement(By.xpath("//div[text()='Success - Check box is checked']"));
        String text=msg.getText();
        Assert.assertEquals(text, "Success - Check box is checked");

        // click option 3 in checkbox
        // when we have multiple cb we need to check which is the same attribute for all of cb
        //then loop tru it by using text

        List<WebElement> multiCB=driver.findElements(By.className("cb1-element"));
        for(WebElement cb1:multiCB){
            String value= cb1.getText();
            if(value.equals("Option 3"))
                cb1.click();
                break;
            }


        }



       // driver.quit();


    }

