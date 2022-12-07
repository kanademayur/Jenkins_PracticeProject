import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestExecution_withoutLogin {
    public WebDriver driver;
    Properties prop=new Properties();
    FileInputStream file;
    {
        try {
            file=new FileInputStream("/home/mayuk/Doker/SeleniumAssignment/src/main/resources/data.properties");
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
    @BeforeTest
    public void launch() throws IOException {
        prop.load(file);
        System.setProperty("webdriver.chrome.driver", "/home/mayuk/Doker/SeleniumAssignment/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(prop.getProperty("url"));
    }
    @Test(priority = 1)
    public void todaysDeal() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.clickOnTodaysDeal().click();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void thirdElement() throws InterruptedException {
        TodaysDeals todaysDeals = new TodaysDeals(driver);
        todaysDeals.getThirdDeal().click();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void verifyCart() throws InterruptedException {
        VerifyCart verifyCart=new VerifyCart(driver);
        verifyCart.getFirstitem().click();
        verifyCart.getAddTocart().click();
        verifyCart.getGoToCart().click();
        Thread.sleep(2000);
        String ExpectedQty= verifyCart.verifyQuantity().getText();
        System.out.println(ExpectedQty);
        String Actual="1";
        Assert.assertEquals(Actual,ExpectedQty,"Not Match");

    }
    @Test(priority = 4)
    public void searchMobiles() throws InterruptedException {
        SearchForMobiles searchForMobiles=new SearchForMobiles(driver);
        searchForMobiles.getSearch().sendKeys("Mobiles");
        searchForMobiles.getSearchButton().click();
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,3000)");
        String details=searchForMobiles.getLastMobile().getText();
        System.out.println(details);

        for(int i=0;i<=5;i++) {
            driver.navigate().back();
        }
    }
    @AfterTest
    public void close()
    {
        driver.close();
    }
}