package org.example.steps;

import lombok.extern.log4j.Log4j2;
import org.example.pages.AuthorizationFormPage;
import org.example.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class AuthorizationFormStep {

    final AuthorizationFormPage authorizationFormPage;

    public AuthorizationFormStep(WebDriver driver) {
        authorizationFormPage = new AuthorizationFormPage(driver);
    }

    public void enterEmail(String email) {
        log.info("Enter email");
        authorizationFormPage.getEmailField().sendKeys(email);
        Waiters.waitForVisibility(authorizationFormPage.getEmailField());
    }

    public void enterPassword(String password) {
        log.info("Enter password");
        authorizationFormPage.getPasswordField().sendKeys(password);
    }

    public void clickViewPasswordButton() {
        log.info("Click view button");
        authorizationFormPage.getViewPasswordButton().click();
    }

    public void clickSubmitButton() {
        log.info("Click submit button");
        authorizationFormPage.getSubmitButton().click();
    }

    public Boolean getUserDataText() {
        log.info("Get user data text");
       return authorizationFormPage.getSubmitButton().isSelected();
    }
}
