package org.example.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationFormPage {

    final WebDriver driver;

    public RegistrationFormPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
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
