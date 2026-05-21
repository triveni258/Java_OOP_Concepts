package CodingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles_5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String parenWindow = driver.getWindowHandle();
        System.out.println(parenWindow);
        driver.findElement(By.linkText("Gmail")).click();
        ((JavascriptExecutor) driver).executeScript(
                "window.open('https://mail.google.com/mail/&ogbl','_blank');"    );
                Set<String> allWindow= driver.getWindowHandles();
                for(String childWindow :allWindow)
                {
                    if(!childWindow.equals((parenWindow)))
                    {
                        driver.switchTo().window(childWindow);
                        System.out.println("Child window title is: "+driver.getTitle());
                    }
                }


    }
}
