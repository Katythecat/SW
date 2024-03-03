package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calenders {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");

        driver.findElement(By.id("start_date")).click();

//        select from calendar
        boolean flag=true;
        while(flag){
//            get the current month
            String currentMonth= driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]")).getText();
            if(currentMonth.equals("August 2024")){
                List<WebElement> allDates = driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
                for(WebElement date:allDates){
                    if(date.getText().equals("1")){
                        date.click();
                        //driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
                        flag=false;
                        break;
                    }
                }
            }
            if(flag){
//                click next button
                driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]")).click();
            }

        }
        driver.quit();
    }
}
