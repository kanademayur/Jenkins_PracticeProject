import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class VerifyCart {
    WebDriver driver;

    String expectedQty="1";

    public VerifyCart(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@aria-expanded='true']")private WebElement firstItem;
    @FindBy(xpath = "//button[@class='style__button__1MgdH style__addToCart__9TqqV style__beacon__2ECwE ProductShowcase__action__27dLc style__disableInternalPointerEvents__1ECVO']")private WebElement addToCart;
    @FindBy(xpath = "//span[@class='style__text__2xIA2']//span[contains(text(),'Cart')]")private WebElement goToCart;
    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[2]")private WebElement verifyQuantity;
    //By quantity=By.xpath("//span[@id='a-autoid-4-announce']");

    public WebElement getFirstitem() {
        return firstItem;
    }

    public WebElement getAddTocart() {
        return addToCart;
    }

    public WebElement getGoToCart() {
        return goToCart;
    }

    public WebElement verifyQuantity() {

        return verifyQuantity;
    }


}