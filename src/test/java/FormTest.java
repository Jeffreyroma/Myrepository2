import org.example.driver.DriverManager;
import org.example.models.UserData;
import org.example.steps.AuthorizationFormStep;
import org.example.steps.RegistrationFormStep;
import org.example.utils.JsonReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormTest extends BaseTest {
    protected WebDriver driver;
    private RegistrationFormStep registrationFormStep;

    private AuthorizationFormStep authorizationFormStep;

    @BeforeClass
    public void preparationFormTest() {
        driver = DriverManager.getDriver();
        registrationFormStep = new RegistrationFormStep(driver);
        authorizationFormStep = new AuthorizationFormStep(driver);
    }

    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void checkRegistrationFormData(UserData userData) {
        authorizationFormStep.enterEmail(userData.getEmail());
        authorizationFormStep.enterPassword(userData.getPassword());
        authorizationFormStep.clickViewPasswordButton();
        authorizationFormStep.clickRegistrationButton();

        registrationFormStep.clickSelectCountryButton();
        registrationFormStep.clickSelectSpecificCountryButton();

        Assert.assertTrue(registrationFormStep.getSelectSpecificCountryButton().getText().contains("Австралия"));
    }
}
