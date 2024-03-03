package Mix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DDwithNoSelectTag {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php#");

//            find the dropDown and perform a click operation
        driver.findElement(By.cssSelector("div.btn.btn-primary.dropdown-toggle")).click();

        // loop tru the desire choice
        List<WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
        for(WebElement li:list){
            String op=li.getText();
            if(op.equals("Peru")){
                li.click();
                break;
            }
        }
    }

}
