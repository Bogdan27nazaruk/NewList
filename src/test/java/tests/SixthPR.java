import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SixthPR {
    @Test
    public void newBybitSearch() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bybit.com/uk-UA/");
        driver.manage().window().maximize();
        driver.findElements(By.xpath("//a[contains(text(), 'Ринки')]")).get(0).click();
        driver.findElement(By.xpath("//input[@placeholder='Пошук']")).sendKeys("Ada");
        driver.findElement(By.xpath("//div[contains(text(), 'ADAUSDT')]")).click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("ADAUSDT"));
        driver.quit();
    }

}
