import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://eu.battle.net/login/ru/");
    }

    @Test
    public void checkRegistrationFormData() {
        WebElement emailField = driver.findElement(By.xpath("//input[@name=\"accountName\"]"));
        emailField.sendKeys("romamakarcikov@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        passwordField.sendKeys("123456789");

        WebElement viewPasswordButton = driver.findElement(By.xpath("//span[@class=\"view-password-button\"]"));
        viewPasswordButton.click();

        WebElement registrationButton = driver.findElement(By.id("signup"));
        registrationButton.click();

        WebElement selectButton = driver.findElement(By.xpath("//select[@class=\"step__input\"]"));
        selectButton.click();

        WebElement selectCountryButton = driver.findElement(By.xpath("//option[@value=\"AUS\"]"));
        selectCountryButton.click();

        Assert.assertTrue(selectCountryButton.getText().contains("Австралия"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
