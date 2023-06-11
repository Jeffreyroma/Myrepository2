package org.example.pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class AccountPage extends BasePage {

    protected WebDriver driver;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@data-name=\"shop\"]")
    private WebElement selectShopField;

    public WebElement getSelectShopField() {
        return selectShopField;
    }
}
