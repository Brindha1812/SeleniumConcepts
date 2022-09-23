import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkEx
{
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");

        By homepageLink = By.linkText("Go to Home Page");
        homepageNavigate(homepageLink);

        By where = By.partialLinkText("Find where");
        nextLink(where);

        By brokenLink = By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a");
        brokenLinkCheck(brokenLink);

    }
    static void homepageNavigate(By locator) throws InterruptedException {
        WebElement element = driver.findElement(locator);
        element.click();
        Thread.sleep(300);
        driver.navigate().back();
    }
    static void nextLink(By locator)
    {
        WebElement element = driver.findElement(locator);
        String linkName = element.getAttribute("href");
        System.out.println("The Next Page is : " +linkName);
        element.click();
        if (driver.getTitle().equalsIgnoreCase("Testleaf - Interact with Buttons"))
            System.out.println("The Specific page successfully loaded");
        else
            System.out.println("The Specific page is not loaded");
        driver.navigate().back();
    }
    static void brokenLinkCheck(By locator)
    {
        WebElement element = driver.findElement(locator);
        element.click();
        if(driver.getTitle().contains("404"))
            System.out.println("The Link is Broken");
        else
            System.out.println("The Link is not Broken");
    }
}
