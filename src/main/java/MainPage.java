import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private  WebDriver driver;

    @FindBy(id = "from")
    private WebElement from;

    @FindBy(id = "to")
    private WebElement to;

    @FindBy(id = "when")
    private WebElement when;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/div/div[5]/form/button[2]")
    private WebElement buttonSearch;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[1]/div/section/article[1]/header/div/h3/a/span[2]")
    private WebElement segmentTitle;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[1]/div/section/article[1]/div[1]/div[1]/div[2]/text()")
    private WebElement time;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[1]/div/section/article[1]/header/div/h3/a/figure/svg")
    private WebElement icon;

    @FindBy(className = "SearchSegment")
    private WebElement countElements;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTextTitle() {
        return driver.getTitle();
    }

    public MainPage typeFrom (String fromText) {
        from.clear();
        from.sendKeys(fromText);
        return this;
    }

    public MainPage typeTo (String toText) {
        to.sendKeys(toText);
        return this;
    }

    public  MainPage typeWhen (String whenText) {
        when.clear();
        when.sendKeys(whenText);
        return this;
    }

    public  MainPage clickSearchButton() {
        buttonSearch.click();
        return this;
    }


}
