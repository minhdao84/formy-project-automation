import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.*;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\BK_Oceana\\SELENIUM_LEARNING\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        sleep(3000);

        Actions actions = new Actions(driver);
        actions.moveToElement(name);

        name.sendKeys("Minh Dao");

        sleep(5000);

        WebElement date = driver.findElement(By.id("date"));

        date.sendKeys("3/3/2023");

        Thread.sleep(5000);

        driver.quit();
    }
}
