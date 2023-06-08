package org.example.pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
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

    public WebElement getEmailField() {
        return emailField;
    }

    public void setEmailField(WebElement emailField) {
        this.emailField = emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getViewPasswordButton() {
        return viewPasswordButton;
    }

    public WebElement getRegistrationButton() {
        return registrationButton;
    }
}
