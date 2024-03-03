package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=ATuJsjwOCU1FK44Oh38rRlu2pF1x-k9BloBlH0DpI7HCA7fx1-EY0tdAE22xIVjI29Aj3G3DxBLN&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1560862489%3A1709369682090211&theme=glif");

        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        driver.findElement(By.xpath("//a[text()='Terms']")).click();

        String mainPage= driver.getWindowHandle();
       // System.out.println(mainPage);

        Set<String> allWindows = driver.getWindowHandles();
        for(String window:allWindows){
            driver.switchTo().window(window);
            String title=driver.getTitle();
            System.out.println(title);
            if(title.equals("Google Account Help")){
                WebElement inputField = driver.findElement(By.xpath("//input[@name='q']"));
                inputField.sendKeys("forgot password");
                //inputField.sendKeys(Keys.ENTER);
                break;
            }
        }
        System.out.println("confirm we are on the focus page :"+driver.getTitle());
        driver.switchTo().window(mainPage);
        System.out.println("go back to parent "+driver.getTitle());



    }
}
