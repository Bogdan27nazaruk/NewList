import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewListAnimalsGoogle {


    @Test
    public void newlistGm() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mouse\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("mouse"));
        driver.quit();

    }
}

