import org.example.driver.DriverManager;
import org.example.models.UserData;
import org.example.pages.AuthorizationFormPage;
import org.example.pages.RegistrationFormPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FormTest extends BaseTest {
    protected WebDriver driver;
    private AuthorizationFormPage authorizationFormPage;
    private RegistrationFormPage registrationFormPage;

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{
                {new UserData("romamakarcikov@gmail.com")},
                {new UserData("ann@gmail.com")}
        };
    }

    @BeforeClass
    public void preparationFormTest() {
        driver = DriverManager.getDriver();
        authorizationFormPage = new AuthorizationFormPage(driver);
        registrationFormPage = new RegistrationFormPage(driver);
    }

    @Test(dataProvider = "data-provider")
    public void checkRegistrationFormData(UserData userData) {
        authorizationFormPage.enterEmail(userData.getEmail());
        authorizationFormPage.enterPassword("123456789");
        authorizationFormPage.clickViewPasswordButton();
        authorizationFormPage.clickRegistrationButton();

        registrationFormPage.clickSelectCountryButton();
        registrationFormPage.clickSelectSpecificCountryButton();

        Assert.assertTrue(registrationFormPage.getSelectSpecificCountryButton().getText().contains("Австралия"));
    }
}
