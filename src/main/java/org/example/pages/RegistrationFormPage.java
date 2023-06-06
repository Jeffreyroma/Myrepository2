package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        selectCountryButton.click();
    }

    public void clickSelectSpecificCountryButton() {
        selectSpecificCountryButton.click();
    }
}
