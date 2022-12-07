import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class NewPaymentOption {

    WebDriver driver;

    public NewPaymentOption (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='nav-link-accountList']")private WebElement accountList;
    @FindBy(xpath = "(//div[@class='a-box ya-card--rich'])[5]")private WebElement addPaymentOption;
    @FindBy(xpath = "(//input[@class='a-button-input'])[5]")private WebElement addDebitCard;
    @FindBy(xpath = "//input[@type='tel']")private WebElement enterCardNo;
    @FindBy(xpath = "//input[@name='ppw-accountHolderName']")private WebElement enterName;
    @FindBy(xpath = "(//span[@role='button'])[1]")private WebElement selectDate;
    @FindBy(xpath = "(//a[@class='a-dropdown-link'])[6]")private WebElement clickOnDate;
    @FindBy(xpath = "(//span[@role='button'])[2]")private WebElement selectYear;
    @FindBy(xpath = "(//a[@class='a-dropdown-link'])[12]")private WebElement clickOnYear;
    @FindBy(xpath = "//input[@name='ppw-widgetEvent:AddCreditCardEvent']")private WebElement clickOnAddYourCard;

    public WebElement getAccountList() {
        return accountList;
    }

    public WebElement getAddPaymentOption() {
        return addPaymentOption;
    }

    public WebElement getAddDebitCard() {
        return addDebitCard;
    }

    public WebElement getEnterCardNo() {
        return enterCardNo;
    }

    public WebElement getEnterName() {
        return enterName;
    }

    public WebElement getSelectDate() {
        return selectDate;
    }

    public WebElement getClickOnDate() {
        return clickOnDate;
    }

    public WebElement getSelectYear() {
        return selectYear;
    }

    public WebElement getClickOnYear() {
        return clickOnYear;
    }

    public WebElement getClickOnAddYourCard() {
        return clickOnAddYourCard;
    }
}