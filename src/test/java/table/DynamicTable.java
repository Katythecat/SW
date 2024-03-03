package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

//click on PIm option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        // find column that has id 65424414

        List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        for (int i = 0; i < table.size() ; i++) {
            String id=table.get(i).getText();
            if(id.equals("65424414")){
                System.out.println(i);
                driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[1]")).click();

            }
        }
    }
}
