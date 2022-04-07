import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewList {
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}

    @Test
    public void newlistGd() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("dogs\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("dogs"));
        driver.quit();

    }
    @Test
    public void newlistGc() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("cats\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("cats"));
        driver.quit();

    }
    @Test
    public void newlistGr() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("rabbits\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("rabbits"));
        driver.quit();

    }

    @Test
    public void newlistGt() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("turtle\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("turtle"));
        driver.quit();
    }

    @Test
    public void newlistGp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("parrot\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("parrot"));
        driver.quit();
    }

    @Test
    public void newlistBd() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("dogs\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("dogs"));
        driver.quit();

    }

    @Test
    public void newlistBc() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("cats\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("cats"));
        driver.quit();

    }

    @Test
    public void newlistBr() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("rabbits\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("rabbits"));
        driver.quit();

    }

    @Test
    public void newlistBt() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("turtle\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("turtle"));
        driver.quit();

    }

    @Test
    public void newlistBp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("parrot\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("parrot"));
        driver.quit();

    }
    @Test
    public void newlistYd() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='p']")).sendKeys("dogs\n");
        sleep(1);
        Assert.assertTrue(driver.getCurrentUrl().contains("dogs"));
        driver.quit();

    }

    @Test
    public void newlistYc() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='p']")).sendKeys("cats\n");
        sleep(1);
        Assert.assertTrue(driver.getCurrentUrl().contains("cats"));
        driver.quit();

    }
    @Test
    public void newlistYr() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='p']")).sendKeys("rabbits\n");
        sleep(1);
        Assert.assertTrue(driver.getCurrentUrl().contains("rabbits"));
        driver.quit();

    }
    @Test
    public void newlistYt() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='p']")).sendKeys("turtle\n");
        sleep(1);
        Assert.assertTrue(driver.getCurrentUrl().contains("turtle"));
        driver.quit();

    }
    @Test
    public void newlistYp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='p']")).sendKeys("parrot\n");
        sleep(1);
        Assert.assertTrue(driver.getCurrentUrl().contains("parrot"));
        driver.quit();

    }
    @Test
    public void newlistGdd() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("fish\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("fish"));
        driver.quit();

    }

}
