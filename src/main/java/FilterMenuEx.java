import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FilterMenuEx
{
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/howto/howto_js_search_menu.asp");

        By menuIcon = By.xpath("//*[@id=\"mySearch\"]");
        searchIcon(menuIcon);
    }
    static void searchIcon(By locator) throws InterruptedException {
        WebElement element = driver.findElement(locator);
        element.sendKeys("S");
        Thread.sleep(3000);
        List<WebElement> elementList = element.findElements(locator);
        for ( WebElement newItem : elementList)
        {
            if( newItem.getText().equals("SQL"))
            {
                newItem.click();
                break;
            }
        }
    }
}
