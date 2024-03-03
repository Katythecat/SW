package Mix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DD {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        WebElement dd=driver.findElement(By.id(("select-demo")));

        Select select=new Select(dd);
        System.out.println(select.isMultiple()); // false
        select.selectByVisibleText("Sunday");
        Thread.sleep(2000);
//        select.deselectByVisibleText("Sunday");
//        we can use deselect only with multiple dd

        select.selectByValue("Monday");
        Thread.sleep(2000);

        select.selectByIndex(1);// index start from 0

//        multiple dd
        WebElement mdd=driver.findElement(By.id("multi-select"));
        Select sc=new Select(mdd);
        System.out.println(sc.isMultiple());
        sc.selectByIndex(0);
        sc.selectByValue("Texas");

        sc.deselectByIndex(4);


        // this getAllSelectedOptions() use for retrieving options that are already selected
        List<WebElement> selectAll = sc.getAllSelectedOptions();
        for(WebElement all:selectAll){
            System.out.println(all.getText());
        }



//        sc.deselectByVisibleText("Ohio");
//



    }
}
