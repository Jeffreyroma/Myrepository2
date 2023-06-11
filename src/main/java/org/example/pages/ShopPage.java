package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends BasePage {

    protected WebDriver driver;

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "search-desktop-input")
    private WebElement searchNameOfGameField;

    @FindBy(xpath = "//a[@href=\"/ru-ru/product/hearthstone-heroes-of-warcraft\"]")
    private WebElement theSpecificNameOfTheGame;

    public WebElement getSearchNameOfGameField() {
        return searchNameOfGameField;
    }

    public WebElement getTheSpecificNameOfTheGame() {
        return theSpecificNameOfTheGame;
    }
}
