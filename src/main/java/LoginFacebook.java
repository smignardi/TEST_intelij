import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginFacebook {

    private final WebDriver driver;

    @FindBy(xpath="//input[@name='firstname']")
    private WebElement inputFirstName;

    @FindBy(xpath="//input[@name='lastname']")
    private WebElement inputLastName;

    @FindBy(xpath="//input[@name='reg_email__']")
    private WebElement inputEmail;

    @FindBy(id="password_step_input")
    private WebElement inputPassword;

    @FindBy(xpath="//button[@name='websubmit']")
    private WebElement butonRegister;


    @FindBy(xpath="//div[contains(@class,'uiStickyPlaceholderInput')]")
    private WebElement lblGeneralError;

    public boolean lblGeneralErrorisdisplayed() {
        return lblGeneralError.isDisplayed();
    }


    //CONSTRUCTOR
    public LoginFacebook(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void registerLogin(String firstName,String lastName,String Email,String Password) throws InterruptedException {
        inputFirstName.clear();
        inputFirstName.sendKeys(firstName);

        inputLastName.clear();
        inputLastName.sendKeys(lastName);

        inputEmail.clear();
        inputEmail.sendKeys(Email);

        inputPassword.clear();
        inputPassword.sendKeys(Password);

        butonRegister.click();
        Thread.sleep(2000);

    }
}
