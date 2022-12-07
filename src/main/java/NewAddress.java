import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class NewAddress {
    WebDriver driver;

    public NewAddress(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='nav-link-accountList']")private WebElement accountList;
    @FindBy(xpath = "(//div[@class='a-row'])[4]")private WebElement addAddress;
    @FindBy(xpath = "//div[@class='a-box-inner a-padding-extra-large']")private WebElement clickOnAddress;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressFullName']")private WebElement fullName;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")private WebElement mobileNo;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPostalCode']")private WebElement pinCode;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")private WebElement addressFirstLine;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine2']")private WebElement addressSecondLine;
    @FindBy(xpath = "//input[@id='address-ui-widgets-landmark']")private WebElement landmark;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressCity']")private WebElement city;
    @FindBy(xpath = "(//span[@class='a-dropdown-prompt'])[2]")private WebElement selectState;
    @FindBy(xpath = "(//a[@class='a-dropdown-link'])[21]")private WebElement maharashtra;
    @FindBy(xpath = "(//input[@class='a-button-input'])[3]")private WebElement clickOnAddAddress;
    //@FindBy(xpath = "(//div[@class='a-box-inner a-alert-container'])[1]")private WebElement addAdded;
    By paymentAdded= By.xpath("(//div[@class='a-box-inner a-alert-container'])[1]");

    public WebElement getAccountList() {
        return accountList;
    }

    public WebElement getAddAddress() {
        return addAddress;
    }

    public WebElement getClickOnAddress() {
        return clickOnAddress;
    }

    public WebElement getFullName() {
        return fullName;
    }

    public WebElement getMobileNo() {
        return mobileNo;
    }

    public WebElement getAddressSecondLine() {
        return addressSecondLine;
    }

    public WebElement getPinCode() {
        return pinCode;
    }

    public WebElement getAddressFirstLine() {
        return addressFirstLine;
    }

    public WebElement getLandmark() {
        return landmark;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getSelectState() {
        return selectState;
    }

    public WebElement getMaharashtra() {
        return maharashtra;
    }

    public WebElement getClickOnAddAddress() {
        return clickOnAddAddress;
    }

    public String getAddAdded() {
        String message=driver.findElement(paymentAdded).getText();
        return message;
    }
}
