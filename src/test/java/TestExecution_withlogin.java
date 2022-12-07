
import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.annotations.*;

        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.time.Duration;
        import java.util.Properties;

public class TestExecution_withlogin {
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
    @Test(priority = 1)
    public void launch() throws IOException {
        prop.load(file);
        System.setProperty("webdriver.chrome.driver", "/home/mayuk/Doker/SeleniumAssignment/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(prop.getProperty("url"));
    }
    @Test(priority = 2)
    public void loginPage() throws IOException {
        prop.load(file);
        SigninPage signinPage = new SigninPage(driver);
        signinPage.getSignIn().click();
        signinPage.getEmailId().sendKeys(prop.getProperty("mobileNum"));
        signinPage.getContinueBtn().click();
        signinPage.getPassword().sendKeys(prop.getProperty("password"));
        signinPage.getSubmitBtn().click();

    }
    @Test(priority = 3)
    public void selectPrimeBox()
    {
        PrimeCheckBox checkBox=new PrimeCheckBox(driver);
        checkBox.getBabyBtn().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        checkBox.getPrimeBox().click();
        String date= checkBox.getDeliveryDate().getText();
        System.out.println(date);
    }
    @Test(priority = 4)
    public void pastOneYearOrder()
    {
        YourOrder yourOrder=new YourOrder(driver);
        yourOrder.getOrderBtn().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        yourOrder.getDropDown().click();
        yourOrder.getSelectLastYear().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test(priority = 6)
    public void addNewPaymentOption() throws IOException, InterruptedException {
        prop.load(file);
        NewPaymentOption paymentOption=new NewPaymentOption(driver);
        paymentOption.getAccountList().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        paymentOption.getAddPaymentOption().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        paymentOption.getAddDebitCard().click();
        Thread.sleep(7000);
        driver.switchTo().frame(driver.findElement(By.className("apx-secure-iframe")));
        paymentOption.getEnterCardNo().sendKeys(prop.getProperty("cardNo"));
        paymentOption.getEnterName().sendKeys(prop.getProperty("nameOnCard"));
        paymentOption.getSelectDate().click();
        paymentOption.getClickOnDate().click();
        paymentOption.getSelectYear().click();
        paymentOption.getClickOnYear().click();
        paymentOption.getClickOnAddYourCard().click();
        Thread.sleep(2000);

    }
    @Test(priority = 5)
    public void addNewAddress() throws IOException, InterruptedException {
        prop.load(file);
        NewAddress address=new NewAddress(driver);
        address.getAccountList().click();
        Thread.sleep(2000);
        address.getAddAddress().click();
        Thread.sleep(1000);
        address.getClickOnAddress().click();
        Thread.sleep(1000);
        address.getFullName().sendKeys(prop.getProperty("name"));
        address.getMobileNo().sendKeys(prop.getProperty("homePhone"));
        address.getPinCode().sendKeys(prop.getProperty("pinCode"));
        address.getAddressFirstLine().sendKeys(prop.getProperty("house"));
        address.getAddressSecondLine().sendKeys(prop.getProperty("street"));
        address.getLandmark().sendKeys(prop.getProperty("landmark"));
        address.getClickOnAddAddress().click();
        Thread.sleep(2000);



    }
    @Test(priority = 7)
    public void close()
    {
        driver.close();
    }




}