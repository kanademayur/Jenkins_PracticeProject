
import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.Select;

public class YourOrder {
    WebDriver driver;

    public YourOrder(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='nav-orders']")private WebElement orderBtn;
    @FindBy(xpath = "//span[@role='button']")private WebElement dropDown;
    @FindBy(xpath = "//a[@id='time-filter_3']")private WebElement selectLastYear;

    public WebElement getOrderBtn() {
        return orderBtn;
    }

    public WebElement getDropDown() {
//        Select year=new Select(dropDown);
//        year.selectByValue("2021");
        return dropDown;

    }

    public WebElement getSelectLastYear() {
        return selectLastYear;
    }
}