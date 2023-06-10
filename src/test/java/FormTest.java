import org.example.driver.DriverManager;
import org.example.models.UserData;
import org.example.steps.AccountStep;
import org.example.steps.AuthorizationFormStep;
import org.example.utils.JsonReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormTest extends BaseTest {
    protected WebDriver driver;
    private AccountStep accountStep;
    private AuthorizationFormStep authorizationFormStep;

    @BeforeClass
    public void preparationFormTest() {
        driver = DriverManager.getDriver();
        accountStep = new AccountStep(driver);
        authorizationFormStep = new AuthorizationFormStep(driver);
    }

    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void checkRegistrationFormData(UserData userData) {
        authorizationFormStep.enterEmail(userData.getEmail());
        authorizationFormStep.enterPassword(userData.getPassword());
        authorizationFormStep.clickViewPasswordButton();
        authorizationFormStep.clickSubmitButton();
        accountStep.clickShopButton();
        accountStep.enterNameOfGame();

        //Assert.assertTrue(authorizationFormStep.getUserDataText());
    }

   /* @Test
    public void checkAccountPage() {
        accountStep.clickShopButton();
    }*/
}
