import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static utils.Utils.pause;

public class BaseTests {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe"); //.exe only for windows
        /*
        EdgeDriver for the Edge browser
        FirefoxDriver
        InternetExplorerDriver
        OperaDriver
        SafariDriver
        RemoteWebDriver
         */
        driver = new ChromeDriver();
        driver.get("https://www.nerdwallet.com/");
        System.out.println(driver.getTitle());
    }

    /**
     * steps
     * 1. Go to https://www.nerdwallet.com/
     *
     * ExpectedResult
     * "Make smart decisions with side-by-side comparisons" title is present
     *
     **/
    @Test
    public void checkMakeSmartDecisionsTittlePresentTest() throws InterruptedException {
        setUp();
        HomePage homePage = new HomePage();
        pause(10000);
        assertTrue(homePage.isMakeSmartDecisionTittlePresent(), "Smart Decisions title isn't present");
        driver.quit();
    }

    /**
     * steps
     * 1. Go to https://www.nerdwallet.com/
     * 2. click on any tab offer (ex. Credit cards, banking..)
     *
     * ExpectedResult
     * check content box tittle for each tab
     *
     **/


    public static void main(String args[]) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
