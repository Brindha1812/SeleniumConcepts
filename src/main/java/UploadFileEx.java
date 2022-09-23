import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

import java.awt.*;
import java.awt.event.KeyEvent;

public class UploadFileEx
{
    static WebDriver driver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://cloudconvert.com/xls-to-xlsx");

        By uploadFileButton = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div/button[1]");
        uploadingFile(uploadFileButton);
    }

    static void uploadingFile(By locator)
    {
        WebElement element = driver.findElement(locator);
        element.click();
        element.sendKeys("C:\\Users\\bhara\\Downloads\\sample3.xls");




    }
}
