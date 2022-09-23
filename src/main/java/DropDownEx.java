import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.util.List;

public class DropDownEx
{
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");

        By indexFinder = By.id("dropdown1");
        indexDD(indexFinder);

        By textFinder = By.name("dropdown2");
        textDD(textFinder);

        By valueFinder = By.id("dropdown3");
        valueDD(valueFinder);

        By optionFinder = By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select");
        optionDD(optionFinder);

        By multiSelect = By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select");
        multiOption(multiSelect);


    }

    static void indexDD(By locator) throws InterruptedException {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByIndex(2);
        // 5th DropDown using sendKeys
        element.sendKeys("Selenium");
        Thread.sleep(300);
    }
    static void textDD(By locator) throws InterruptedException {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByVisibleText("Loadrunner");
        Thread.sleep(300);
    }
    static void valueDD(By locator) throws InterruptedException {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByValue("1");
        Thread.sleep(300);
    }
    static void optionDD(By locator)
    {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        List<WebElement> optionList = select.getOptions();
        int size = optionList.size();
        System.out.println("Option Size = " +size);
    }
    static void multiOption(By locator)
    {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByIndex(1);
        select.selectByIndex(3);
    }

}
