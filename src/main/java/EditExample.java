import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EditExample
{
    static WebDriver driver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Edit.html");

        By emailID_TextBox = By.id("email");
        enterText(emailID_TextBox, "brindah@gmail.com");

        By appendText = By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input");
        enterText(appendText,"Happy Me");


        By namefinder = By.name("username");
        enterText(namefinder, "Good Happiness");

        By clearfinder = By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input");
        clearText(clearfinder);

        By enablefinder = By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input");
        enableText(enablefinder);

     //   driver.findElement(By.id("email")).sendKeys("brindhacanada@gmail.com");
    }
    static void enterText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }
    static void clearText(By locator)
    {
        WebElement element = driver.findElement(locator);
        element.clear();
    }
    static void enableText(By locator)
    {
        WebElement element = driver.findElement(locator);
        boolean flag = element.isEnabled();
        System.out.println(flag);
    }

}
