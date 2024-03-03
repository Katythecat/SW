package keyboardMouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/simple_context_menu.php");

//        hover
        WebElement hover = driver.findElement(By.xpath("//button[@class='btn btn-default hover_effect']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(hover).perform();// add perform after the desire action

//        get right click
        WebElement rightClick = driver.findElement(By.xpath("//button[text()='Right Click!']"));
        actions.contextClick(rightClick).perform();

//        dragable
        WebElement dragable = driver.findElement(By.id("draggable"));
//        droplocation
        WebElement dropLoc = driver.findElement(By.id("droppable"));
//        action.dragAndDrop(dragable,dropLoc).perform();
// we use build at end if we are chaining different actions together
        //actions.dragAndDrop(dragable,dropLoc).perform();
        actions.clickAndHold(dragable).moveToElement(dropLoc).release().perform();









    }
}
