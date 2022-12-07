import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class PrimeCheckBox {
    WebDriver driver;

    public PrimeCheckBox(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()=\"Baby\"]")private WebElement babyBtn;
    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[3]")private WebElement primeBox;
    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/span[1]/span[2]")private WebElement deliveryDate;



    public WebElement getBabyBtn() {
        return babyBtn;
    }

    public WebElement getPrimeBox() {
        return primeBox;
    }

    public WebElement getDeliveryDate() {
        return deliveryDate;
    }
}