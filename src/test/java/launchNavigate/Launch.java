package launchNavigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String titlte=driver.getTitle();
        System.out.println(titlte);

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        Thread.sleep(2000);
        driver.navigate().to("https://fb.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);
        driver.quit();

    }


}
