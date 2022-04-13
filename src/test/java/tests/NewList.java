package tests;

import org.testng.Assert;

import org.testng.annotations.Test;
import tests.TestInit;

public class NewList extends TestInit {


    @Test
    public void newlistGd() {
        goToGoogle();
        driver.manage().window().maximize();
        getSearchFieldGoogle().sendKeys("dogs\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("dogs"));

    }

    @Test
    public void newlistGc() {
        goToGoogle();
        driver.manage().window().maximize();
        getSearchFieldGoogle().sendKeys("cats\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("cats"));

    }

    @Test
    public void newlistGr() {
        goToGoogle();
        driver.manage().window().maximize();
        getSearchFieldGoogle().sendKeys("rabbits\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("rabbits"));

    }

    @Test
    public void newlistGt() {
        goToGoogle();
        driver.manage().window().maximize();
        getSearchFieldGoogle().sendKeys("turtle\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("turtle"));
    }

    @Test
    public void newlistGp() {
        goToGoogle();
        driver.manage().window().maximize();
        getSearchFieldGoogle().sendKeys("parrot\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("parrot"));
    }

    @Test
    public void newlistBd() {
        goToBing();
        driver.manage().window().maximize();
        getSearchFieldBing().sendKeys("dogs\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("dogs"));
        driver.quit();

    }

    @Test
    public void newlistBc() {
        goToBing();
        driver.manage().window().maximize();
        getSearchFieldBing().sendKeys("cats\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("cats"));

    }

    @Test
    public void newlistBr() {
        goToBing();
        driver.manage().window().maximize();
        getSearchFieldBing().sendKeys("rabbits\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("rabbits"));

    }

    @Test
    public void newlistBt() {
        goToBing();
        driver.manage().window().maximize();
        getSearchFieldBing().sendKeys("turtle\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("turtle"));

    }

    @Test
    public void newlistBp() {
        goToBing();
        driver.manage().window().maximize();
        getSearchFieldBing().sendKeys("parrot\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("parrot"));

    }

    @Test
    public void newlistYd() {
        goToYahoo();
        driver.manage().window().maximize();
        getSearchFieldYahoo().sendKeys("dogs\n");
        sleep(1);
        Assert.assertTrue(driver.getCurrentUrl().contains("dogs"));

    }

    @Test
    public void newlistYc() {
        goToYahoo();
        driver.manage().window().maximize();
        getSearchFieldYahoo().sendKeys("cats\n");
        sleep(1);
        Assert.assertTrue(driver.getCurrentUrl().contains("cats"));

    }

    @Test
    public void newlistYr() {
        goToYahoo();
        driver.manage().window().maximize();
        getSearchFieldYahoo().sendKeys("rabbits\n");
        sleep(1);
        Assert.assertTrue(driver.getCurrentUrl().contains("rabbits"));

    }

    @Test
    public void newlistYt() {
        goToYahoo();
        driver.manage().window().maximize();
        getSearchFieldYahoo().sendKeys("turtle\n");
        sleep(1);
        Assert.assertTrue(driver.getCurrentUrl().contains("turtle"));

    }

    @Test
    public void newlistYp() {
        goToYahoo();
        driver.manage().window().maximize();
        getSearchFieldYahoo().sendKeys("parrot\n");
        sleep(1);
        Assert.assertTrue(driver.getCurrentUrl().contains("parrot"));

    }

    @Test
    public void newlistGdd() {
        goToYahoo();
        driver.manage().window().maximize();
        getSearchFieldYahoo().sendKeys("fish\n");
        sleep(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("fish"));

    }

}
