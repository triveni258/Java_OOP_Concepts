package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

//import static sun.security.util.KnownOIDs.Title;

public class ActionClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        //mouse hove
        WebElement mouseHover=driver.findElement(By.cssSelector("#nav-link-accountList"));
       // act.moveToElement((mouseHover)).build().perform();


//       act.moveToElement(mouseHover).click().keyDown(Keys.SHIFT).sendKeys("java").build().perform();

        //ClickLink to open another tab
        WebElement ClickLink=driver.findElement(By.xpath("//a[@id='nav-orders']"));
      // act.moveToElement(ClickLink).click().build().perform();
       //WindowHandles parent and child windows
        ClickLink.click();
//        Set<String> windows=driver.getWindowHandles();
//        Iterator<String> it= windows.iterator();
//        String parentID=it.next();
//        String childID=it.next();
       // driver.switchTo().window(childID);
        System.out.println(driver.getTitle());
       // driver.findElement(By.xpath("//p[contains(@class,'a-spacing-micro a-text-bold')]")).getText();
        System.out.println(driver.findElement(By.xpath("//p[contains(@class,'a-spacing-micro a-text-bold')]")).getText());
     driver.quit();





    }

}
