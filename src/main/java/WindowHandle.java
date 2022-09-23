import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle
{
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Window.html");

        By homeNew = By.id("home");
        firstLinkWindow(homeNew);

        By secondBox = By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button");
        multiWindow(secondBox);

        By thirdLink = By.xpath("//*[@id=\"color\"]");
        closeChild(thirdLink);

        driver.quit();

    }

    static void firstLinkWindow(By locator) throws InterruptedException {
        WebElement element = driver.findElement(locator);
        element.click();
        String homeWindow = driver.getWindowHandle();
        Set<String> windowsList = driver.getWindowHandles();
        for ( String newWindow : windowsList)
        {
            driver.switchTo().window(newWindow);
        }
        WebElement editBox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
        editBox.click();
        Thread.sleep(300);
        driver.close();
        driver.switchTo().window(homeWindow);
       // WebElement wbem = driver.findElement(By.xpath("//*[@id=\"color\"]"));
       // wbem.click();
    }
    static void multiWindow(By locator)
    {
        WebElement element = driver.findElement(locator);
        element.click();
        int noOfWindows = driver.getWindowHandles().size();
        System.out.println("The number of windows open :  " +noOfWindows );
    }
    static void closeChild(By locator)
    {
        WebElement element = driver.findElement(locator);
        element.click();
        String homeWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for ( String newWindow : allWindows)
        {
            if (!newWindow.equals(homeWindow))
            {
                driver.switchTo().window(newWindow);
                driver.close();
            }
        }
    }

}
