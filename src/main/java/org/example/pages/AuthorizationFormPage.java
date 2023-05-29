package org.example.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationFormPage {

    final WebDriver driver;

    public AuthorizationFormPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name=\"accountName\"]")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//span[@class=\"view-password-button\"]")
    private WebElement viewPasswordButton;

    @FindBy(id = "signup")
    private  WebElement registrationButton;


    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickViewPasswordButton() {
        viewPasswordButton.click();
    }

    public void clickRegistrationButton() {
        registrationButton.click();
    }
}
