import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarEx
{
static WebDriver driver;
public static void main(String[] args)
{
    System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");

    By calendarBox = By.xpath("//input[@id='datepicker']");
    WebElement datePicker = driver.findElement(calendarBox);
    datePicker.click();

    By nextButton = By.xpath("//a[@title='Next']");
    WebElement nextUI = driver.findElement(nextButton);
    nextUI.click();

    By buttonTen = By.xpath("//a[contains(text(),'10')]");
    WebElement dateTen = driver.findElement(buttonTen);
    dateTen.click();
}
}
