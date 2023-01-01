import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEx
{
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/frame.html");

        driver.switchTo().frame(0);
        By frameClick = By.id("Click");
        frameOne(frameClick);
    }
    static void frameOne(By locator)
    {
        WebElement element = driver.findElement(locator);
        element.click();
        String text = element.getText();
        System.out.println("The Text after we Clicked :   " +text);
        driver.switchTo().defaultContent();
    }
}
