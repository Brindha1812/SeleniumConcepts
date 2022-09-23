import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.*;

public class SeleniumIntro
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:/Web Drivers/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Link.html");
       // System.out.println(driver.getTitle());
       // System.out.println(driver.getCurrentUrl());
        driver.findElement(By.linkText("Go to Home Page")).click();


        //driver.close();


    }
}
