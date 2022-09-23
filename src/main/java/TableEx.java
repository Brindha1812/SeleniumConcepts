import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableEx
{
    static WebDriver driver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/table.html");


        By rowList = By.tagName("tr");
        rowCount(rowList);

        By columnList = By.tagName("th");
        columnCount(columnList);

        By interactTd = By.xpath("//td[normalize-space() = 'Learn to interact with Elements']//following::td[1]");
        interactElements(interactTd);

        By lowPercent = By.xpath("//td[2]");
        getLowPercent(lowPercent);


    }

    static void rowCount( By locator)
    {
        List<WebElement> noOfRows = driver.findElements(locator);
        int rows = noOfRows.size();
        System.out.println("The Number of Rows are  :  " +rows);
    }
    static void columnCount(By locator)
    {
        List<WebElement> noOfColumn = driver.findElements(locator);
        int columns = noOfColumn.size();
        System.out.println("The number of Columns are  :  " +columns);
    }
    static void interactElements(By locator)
    {
        WebElement element = driver.findElement(locator);
        String value = element.getText();
        System.out.println("The Value of the node next to 'Learn to Interact with Elements' is  :  " +value);
    }
    static void getLowPercent(By locator)
    {
        List<WebElement> element = driver.findElements(locator);
        List<Integer> numbers = new ArrayList<Integer>();
        for( WebElement web : element)
        {
            String eachValue = web.getText().replace("%","");
            numbers.add(Integer.parseInt(eachValue));
        }
        System.out.println("The ArrayList numbers are :  " +numbers);
        int minValue = Collections.min(numbers);
        System.out.println("Low Percentage is :  " +minValue);
        String finalPath = "//td[normalize-space() = "+ "\"" + minValue +"%" +"\"" + "]//following::td[1]";
        System.out.println(finalPath);
        WebElement check = driver.findElement(By.xpath(finalPath));
        check.click();

    }
}
