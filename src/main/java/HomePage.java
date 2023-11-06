import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    protected WebDriver driver;

    @FindBy(xpath = "//*[contains(text(), 'Make smart decisions')]")
    private WebElement makeSmartDecisionsTittle;

    public boolean isMakeSmartDecisionTittlePresent() {
        return makeSmartDecisionsTittle.isDisplayed();
    }


}
