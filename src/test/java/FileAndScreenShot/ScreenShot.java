package FileAndScreenShot;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
            WebDriver driver = new ChromeDriver();
//
            driver.manage().window().maximize();
//        goto hrms
            driver.get("https://syntaxprojects.com/simple_context_menu.php");

            TakesScreenshot screenshot=(TakesScreenshot)driver;
//            take screenshot
        File ss= screenshot.getScreenshotAs(OutputType.FILE);
//        save on computer
        FileUtils.copyFile(ss,new File("screenshot/capture.png"));
    }
}
