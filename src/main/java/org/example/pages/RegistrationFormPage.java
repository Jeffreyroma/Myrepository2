package org.example.pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class RegistrationFormPage extends BasePage {

    protected WebDriver driver;

    public RegistrationFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//select[@class=\"step__input\"]")
    private WebElement selectCountryButton;

    @FindBy(xpath = "//option[@value=\"AUS\"]")
    private WebElement selectSpecificCountryButton;

    public WebElement getSelectSpecificCountryButton() {
        return selectSpecificCountryButton;
    }

    public void clickSelectCountryButton() {
        log.info("Click select button of country");
        selectCountryButton.click();
    }

    public void clickSelectSpecificCountryButton() {
        log.info("Click select button of specific country ");
        selectSpecificCountryButton.click();
    }
}
