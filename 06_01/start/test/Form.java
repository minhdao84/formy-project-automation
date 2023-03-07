import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\BK_Oceana\\SELENIUM_LEARNING\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Minh");

        driver.findElement(By.id("last-name")).sendKeys("Dao");

        driver.findElement(By.id("job-title")).sendKeys("QC Engineer");
        Thread.sleep(3000);

        driver.findElement(By.id("radio-button-1")).click();

        driver.findElement(By.id("checkbox-1")).click();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("option[value='4']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("03/04/2023");
        /* driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN); */
        Thread.sleep(3000);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
