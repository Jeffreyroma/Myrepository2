package org.example.pages;

import org.example.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizationFormPage extends BasePage {

    protected WebDriver driver;

    public AuthorizationFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name=\"accountName\"]")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//span[@class=\"view-password-button\"]")
    private WebElement viewPasswordButton;

    @FindBy(id = "signup")
    private WebElement registrationButton;


    public void enterEmail(String email) {
        Waiters.waitForVisibility(emailField);
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
