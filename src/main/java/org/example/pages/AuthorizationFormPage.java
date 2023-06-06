package org.example.pages;

import lombok.extern.log4j.Log4j2;
import org.example.utils.Waiters;
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


    public void enterEmail(String email) {
        log.info("Enter email");
        Waiters.waitForVisibility(emailField);
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        log.info("Enter password");
        passwordField.sendKeys(password);
    }

    public void clickViewPasswordButton() {
        log.info("Click view button");
        viewPasswordButton.click();
    }

    public void clickRegistrationButton() {
        log.info("Click registration button");
        registrationButton.click();
    }
}
