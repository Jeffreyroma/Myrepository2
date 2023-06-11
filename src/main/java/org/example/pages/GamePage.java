package org.example.pages;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GamePage extends BasePage{

    protected WebDriver driver;

    public GamePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "wishlist.action.add")
    private WebElement addWishListButton;

    public WebElement getAddWishListButton() {
        return addWishListButton;
    }
}

