import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.AuthorizationFormPage;
import org.example.pages.RegistrationFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest {
    private WebDriver driver;
    private AuthorizationFormPage authorizationFormPage;
    private RegistrationFormPage registrationFormPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://eu.battle.net/login/ru/");
        authorizationFormPage = new AuthorizationFormPage(driver);
        registrationFormPage = new RegistrationFormPage(driver);
    }

    @Test
    public void checkRegistrationFormData() {
        authorizationFormPage.enterEmail("romamakarcikov@gmail.com");
        authorizationFormPage.enterPassword("123456789");
        authorizationFormPage.clickViewPasswordButton();
        authorizationFormPage.clickRegistrationButton();

        registrationFormPage.clickSelectCountryButton();
        registrationFormPage.clickSelectSpecificCountryButton();

        Assert.assertTrue(registrationFormPage.getSelectSpecificCountryButton().getText().contains("Австралия"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
