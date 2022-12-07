import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class TodaysDeals {
    WebDriver driver;

    public TodaysDeals(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='slot-7']/div[@id='slot-7']/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/a[1]/div[1]")private WebElement thirdDeal;

    public WebElement getThirdDeal()
    {
        return thirdDeal;
    }

}