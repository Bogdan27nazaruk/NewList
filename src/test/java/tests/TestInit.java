package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    WebDriver driver;

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void goToGoogle() {
        driver.get("https://www.google.com/");
    }

    public void goToBing() {
        driver.get("https://www.bing.com/");
    }

    public void goToYahoo() {
        driver.get("https://www.yahoo.com/");
    }

    public WebElement getSearchFieldGoogle() {
        return driver.findElement(By.xpath("//input[@name='q']"));
    }

    public WebElement getSearchFieldBing() {
        return driver.findElement(By.xpath("//input[@name='q']"));
    }

    public WebElement getSearchFieldYahoo() {
        return driver.findElement(By.xpath("//input[@name='p']"));
    }
}
