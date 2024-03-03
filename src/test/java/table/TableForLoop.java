package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableForLoop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//b[text()='PIM']")).click();
        
        boolean flag=true;
        List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i < ids.size() ; i++) {
            String id= ids.get(i).getText();
            if(id.equals("65424414")) {
                System.out.println("The id is on the row " + i);

                // after knowing the row we will click on the checkbox
                WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkbox.click();
                flag = false;
            }
        }
        if(flag){
            WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
            nextBtn.click();

        }
    }
}
