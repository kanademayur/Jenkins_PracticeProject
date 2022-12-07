import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class SearchForMobiles {
    WebDriver driver;

    public SearchForMobiles(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "twotabsearchtextbox")private WebElement search;
    @FindBy(xpath = "(//div[@class='nav-right'])[1]")private WebElement searchButton;
    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")private WebElement lastmobile;
    By lastMobile= By.xpath("(//span[@class='rush-component s-latency-cf-section']//div)[211]");

    public WebElement getSearch() {
        return search;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getLastMobile() {

        return lastmobile;
    }
}