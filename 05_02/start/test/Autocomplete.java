import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\BK_Oceana\\SELENIUM_LEARNING\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        driver.quit();
    }
}
