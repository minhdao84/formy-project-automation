import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\BK_Oceana\\SELENIUM_LEARNING\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        Thread.sleep(3000);
        WebElement fileuploadField = driver.findElement(By.id("file-upload-field"));



        fileuploadField.sendKeys("Harbor.jpg");

        Thread.sleep(3000);

        driver.quit();
    }
}
