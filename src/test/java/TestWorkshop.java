import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestWorkshop {

    @Test
    public void Test1() throws InterruptedException{
        //Create Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        WebDriverWait webDriverWait = new webDriverWait(webDriver, Duration.ofSeconds(10));

        //Go to apple
        webDriver.get("http://www.apple.com");

        // locator
        By iphoneLinkLocator = By.className("ac-gn-link-iphone");

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.className(iphoneLinkLocator)));

        //Find iphone link
        WebElement iphoneLink = webDriver.findElement(By.className(iphoneLinkLocator));

        iphoneLink.click();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("chapternay-item-iphone-14-pro")));

        WebElement iphone14proLink = webDriver.findElement(By.className("chapternay-item-iphone-14-pro"));

        // click iphone 14 pro link
        iphone14proLink.click();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("chapternay-item-iphone-14-pro")));

        WebElement iphone14proLink = webDriver.findElement(By.className("chapternay-item-iphone-14-pro"));

        //Sleep 5s
        Thread.sleep(5000);
        //Quit Chrome

        //webDriver.quit();


    }
}
