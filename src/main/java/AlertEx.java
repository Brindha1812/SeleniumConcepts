import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertEx
{
    static WebDriver driver;
//
    @BeforeClass
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Alert.html");

        By promptBox = By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button");
        promptAlert(promptBox);
    }

    @Test

    public  void promptAlert(By locator) throws InterruptedException
    {
        WebElement element = driver.findElement(locator);
        element.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.sendKeys("Love Happiness");
        Thread.sleep(3000);
       // alert.dismiss();
        alert.accept();
    }
}

