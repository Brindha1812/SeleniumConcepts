import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxEx
{
    static WebDriver driver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");

        By checkerBox1 = By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]");
        checkSelector(checkerBox1);

        By checkerBox2 = By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[2]");
        checkUnSelector(checkerBox2);

        By checkerBox3 = By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[3]");
        checkSelectorTwo(checkerBox3);
    }

    static void checkSelector(By locator)
    {
        WebElement element = driver.findElement(locator);
        element.click();
        Boolean flag = element.isSelected();
        System.out.println("The CheckBox Selected ?  :  " +flag);
    }
    static void checkUnSelector(By locator)
    {
        WebElement element = driver.findElement(locator);
        Boolean flag = element.isSelected();
        System.out.println(" The CheckBox Selected ? :  " +flag);
    }
    static void checkSelectorTwo(By locator)
    {
        WebElement element = driver.findElement(locator);
        element.click();
        Boolean flag = element.isSelected();
        System.out.println("The CheckBox Selected ? :  " +flag);
    }
}
