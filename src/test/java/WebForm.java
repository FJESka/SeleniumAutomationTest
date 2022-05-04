import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String EMAIL = "Epostadress";

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"ActionButton_0\"]")
    private WebElement continueBtn;

    @FindBy(xpath = "//*[@id=\"email-helper-text\"]")
    private WebElement alertFailed;

    @FindBy(xpath = "//*[@id=\"id-web-ui\"]/div/div/div/form/div[1]/div[1]/a/img")
    private WebElement findElement;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(){
        this.email.sendKeys(EMAIL);
    }

    public void pressContinueBtn(){
        this.continueBtn.click();
    }

    public void verifyAlertFailed(){
        this.alertFailed.isDisplayed();
    }

    public void findElement(){
        this.findElement.isDisplayed();
    }
}
