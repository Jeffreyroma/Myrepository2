import org.example.driver.DriverManager;
import org.example.models.UserData;
import org.example.pages.GamePage;
import org.example.steps.AccountStep;
import org.example.steps.AuthorizationFormStep;
import org.example.steps.GameStep;
import org.example.steps.ShopFormStep;
import org.example.utils.JsonReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormTest extends BaseTest {
    protected WebDriver driver;
    private AuthorizationFormStep authorizationFormStep;
    private AccountStep accountStep;
    private ShopFormStep shopFormStep;
    private GameStep gameStep;

    @BeforeClass
    public void preparationFormTest() {
        driver = DriverManager.getDriver();
        accountStep = new AccountStep(driver);
        authorizationFormStep = new AuthorizationFormStep(driver);
        shopFormStep = new ShopFormStep(driver);
        gameStep = new GameStep(driver);
    }

    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void checkRegistrationFormData(UserData userData) throws InterruptedException {
        authorizationFormStep.enterEmail(userData.getEmail());
        authorizationFormStep.enterPassword(userData.getPassword());
        authorizationFormStep.clickViewPasswordButton();
        authorizationFormStep.clickSubmitButton();
        //добавить проверку



        //страница акка в отдельный тест закинуть и добавить проверку
        accountStep.clickSelectShopField();

        //страница магазина в отдельный тест и добавить проверку
        shopFormStep.enterNameOfGame("Hearthstone game");
        shopFormStep.clickTheSpecificNameOfTheGame();
        gameStep.clickWishListField();
        Assert.assertTrue(authorizationFormStep.getUserDataText().contains(userData.getEmail()));




    }

    @Test
    public void checkAccountForm() {
       // accountStep.clickSelectShopField();
    }
}
