package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableForEach {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//b[text()='PIM']")).click();

        // iterate over to find the row number of the desired id


        boolean notFound = true;
        while(notFound) {
            int count = 0;
            List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            for (WebElement id : ids) {
                if (id.getText().equals("65424414")) {
                    System.out.println("the row number is " + (count));
                    //click on check box
                    WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr[" + (count+1) + "]/td[1]"));
                    checkbox.click();
                    notFound = false;
                }
                count++;
            }

            if(notFound){
                driver.findElement(By.linkText("Next")).click();
            }
        }









    }
}
