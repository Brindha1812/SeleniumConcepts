import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioEx
{
    static WebDriver driver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/radio.html");

        By radioBox1 = By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]");
        unChecked(radioBox1);

        By radioBox2 = By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]");
        checked(radioBox2);
    }

    static void unChecked(By locator)
    {
        WebElement element = driver.findElement(locator);
        Boolean flag = element.isSelected();
        System.out.println("The Check Box 1 is checked :  " +flag);
    }

    static void checked(By locator)
    {
        WebElement element = driver.findElement(locator);
        Boolean flag = element.isSelected();
        System.out.println("The Checker Box 2 is Checked :  " +flag);
    }
}
