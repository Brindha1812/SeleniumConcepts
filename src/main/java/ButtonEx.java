import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Position;

public class ButtonEx
{
    static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Button.html");

        // first button
        By buttonOne = By.id("home");
        firstButton(buttonOne);

        By buttonTwo = By.id("color");
        secondButton(buttonTwo);

        By buttonThree = By.id("size");
        thirdButton(buttonThree);

        By buttonFour = By.id("home");
        fourthButton(buttonFour);
    }

    static void firstButton(By locator)
    {
        WebElement element = driver.findElement(locator);
        Point xypoint = element.getLocation();
        int xvalue = xypoint.getX();
        int yvalue = xypoint.getY();
        System.out.println("X value is " + xvalue + "  Y value is " + yvalue);
    }
    static void secondButton(By locator)
    {
        WebElement element = driver.findElement(locator);
        String color = element.getCssValue("background-color");
        System.out.println("Background color :  " +color);
    }
    static void thirdButton(By locator)
    {
        WebElement element = driver.findElement(locator);
        int height = element.getSize().getHeight();
        int width = element.getSize().getWidth();
        System.out.println(" The Height is  " + height + " The Width is  " + width);
    }
    static void fourthButton(By locator)
    {
        WebElement element = driver.findElement(locator);
        element.click();
    }
}
