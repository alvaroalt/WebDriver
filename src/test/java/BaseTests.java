import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        driver.get("https://auth.afip.gob.ar/contribuyente_/login.xhtml");
        System.out.println(driver.getTitle());
    }

    public static void main(String args[]) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
