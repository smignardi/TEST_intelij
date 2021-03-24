import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import dataprovider.LoginFacebook_DataProvider;

public class Test1 extends Base{
    private LoginFacebook loginFacebook;

    @BeforeTest
    public void Initialize() throws InterruptedException {
        driver=initializeDriver();
    }


    @Test(dataProvider = "missing fields", dataProviderClass = LoginFacebook_DataProvider.class)
    public void testRegisterMissingFields(String firstName, String lastName, String Email,
                                                 String password) throws InterruptedException {
        loginFacebook = new LoginFacebook(driver);

        loginFacebook.registerLogin(firstName,lastName,Email,password);
        Assert.assertTrue(loginFacebook.lblGeneralErrorisdisplayed());
    }



    @AfterTest
    public void closeDriver(){
        driver.close();
    }
}
