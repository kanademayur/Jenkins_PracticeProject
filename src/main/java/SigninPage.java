import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class SigninPage {
    WebDriver driver;

    public SigninPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='nav-link-accountList']")private WebElement SignIn;
    @FindBy(xpath = "//input[@type='email']")private WebElement emailId;
    @FindBy(xpath = "//input[@id='continue']")private  WebElement continueBtn;
    @FindBy(xpath = "//input[@id='ap_password']")private WebElement password;
    @FindBy(xpath = "//input[@id='signInSubmit']")private WebElement SubmitBtn;

    public WebElement getSignIn() {
        return SignIn;
    }

    public WebElement getEmailId() {
        return emailId;
    }

    public WebElement getContinueBtn() {
        return continueBtn;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSubmitBtn() {
        return SubmitBtn;
    }
}