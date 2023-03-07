import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\BK_Oceana\\SELENIUM_LEARNING\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://199.30.25.97/webUI63/home.html");

        WebElement first_name = driver.findElement(By.id("first_name"));

        first_name.sendKeys("minh dao");

        driver.quit();
    }
}
