import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\BK_Oceana\\SELENIUM_LEARNING\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));

        Thread.sleep(4000);
        alertButton.click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();

        alert.accept();

        Thread.sleep(3000);

        driver.quit();
    }
}
