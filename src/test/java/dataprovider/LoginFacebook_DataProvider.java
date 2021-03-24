package dataprovider;

import org.testng.annotations.DataProvider;

public class LoginFacebook_DataProvider {
    @DataProvider(name = "missing fields")
    public Object[][] missingField() {
        return new Object[][]{
                {"steven", "mignardi", "940090223", "abc123"}
        };
    }
}
