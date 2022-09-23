import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.sql.SQLOutput;

public class FileDownload
{
    static WebDriver driver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://filesamples.com/formats/xls#google_vignette");

        By xlsXpath = By.xpath("//*[@id=\"output\"]/div[1]/a");
        xlsDownload(xlsXpath);

    }
//qqqqqqqqqqqqqqqqqqqqqq                        q11
    static void xlsDownload(By locator)
    {
        WebElement element = driver.findElement(locator);
        element.click();
        File file = new File("C:\\Users\\bhara\\Downloads");
        File[] totalFiles = file.listFiles();
        for ( File newFile : totalFiles)
        {
            if( newFile.equals("sample3.xls"))
            {
                System.out.println("The Sample3 File is successfully Downloaded");
                break;
            }
        }
    }
}
