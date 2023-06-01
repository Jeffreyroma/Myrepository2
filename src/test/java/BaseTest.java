import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.AuthorizationFormPage;
import org.example.pages.RegistrationFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://eu.battle.net/login/ru/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
