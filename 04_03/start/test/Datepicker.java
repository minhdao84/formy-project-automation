import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\BK_Oceana\\SELENIUM_LEARNING\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        Thread.sleep(3000);

        WebElement dateField = driver.findElement(By.id("datepicker"));

        dateField.click();

        WebElement date22 = driver.findElement(By.cssSelector())

        // dateField.sendKeys("02/11/2023");

        Thread.sleep(3000);

        dateField.sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        driver.quit();
    }
}