package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");

        // print all row of the table
        List<WebElement> names = driver.findElements(By.xpath("//table/tbody/tr/td"));
        for (WebElement name : names) {
            System.out.println(name.getText() + " ");
        }

        System.out.println("---------------------");


        // print all rows that have status  "in progress"
        List<WebElement> namee = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
        int count = 1; // because table row start from 1
        for (WebElement row : namee) {
            if (row.equals("in progress")) {
                //System.out.println(count);
                //find particular row
                WebElement rows = driver.findElement(By.xpath("//table/tbody/tr[" + count + "]"));
                System.out.println(rows.getText());
            }
            count++;
        }
    }
}
