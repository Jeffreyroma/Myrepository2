package org.example.steps;

import lombok.extern.log4j.Log4j2;
import org.example.pages.RegistrationFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class RegistrationFormStep {

    final RegistrationFormPage registrationFormPage;

    public RegistrationFormStep(WebDriver driver) {
        registrationFormPage = new RegistrationFormPage(driver);
    }

    public void clickSelectCountryButton() {
        log.info("Click select button of country");
        registrationFormPage.getSelectCountryButton().click();
    }

    public void clickSelectSpecificCountryButton() {
        log.info("Click select button of specific country ");
        registrationFormPage.getSelectSpecificCountryButton().click();
    }

    public WebElement getSelectSpecificCountryButton() {
        return registrationFormPage.getSelectSpecificCountryButton();
    }
}
