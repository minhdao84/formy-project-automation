import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import javax.xml.ws.WebEndpoint;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\BK_Oceana\\SELENIUM_LEARNING\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        Thread.sleep(3000);
        WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));

        dropdownMenu.click();

        Thread.sleep(3000);
        WebElement autoComplete = driver.findElement(By.id("autocomplete"));

        autoComplete.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
