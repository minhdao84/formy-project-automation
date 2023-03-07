import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\BK_Oceana\\SELENIUM_LEARNING\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");


        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement chooseFile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("file-upload-field")));

        chooseFile.sendKeys("DaoMinh");

        driver.quit();
    }
}
