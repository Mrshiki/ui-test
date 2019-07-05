import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

class MainPageTest {

    private static WebDriver driver;
    private  static MainPage mainPage;


    @BeforeAll
    static void beforeAll() {
        System.setProperty("webdriver.gecko.driver", "/Users/user/IdeaProjects/rugoodline/src/driver/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rasp.yandex.ru");
        mainPage = new MainPage(driver);

    }

    @Test
    void url() {
        String heading = mainPage.getTextTitle();
        Assert.assertEquals("Расписание самолётов, поездов, электричек и автобусов", heading);

    }

    @Test
    void enterForm() {
 //       driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
        mainPage.typeFrom("Кемерово");
        mainPage.typeTo("Москва");
        mainPage.typeWhen("07.07.2019");

    }

    @Test
    void clickButtonSearch() {
        mainPage.clickSearchButton();
    }







//    @AfterAll
//    static void tearDown() {
//        driver.quit();
//    }
}
