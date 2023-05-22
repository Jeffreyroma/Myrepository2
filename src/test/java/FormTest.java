import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FormTest {

    @Test
    public void checkRegistrationFormData() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\OneDrive\\Документы");
        driver.get("https://demoqa.com/automation-practice-form");
    }
}
