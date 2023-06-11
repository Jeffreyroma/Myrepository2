package org.example.steps;

import org.example.pages.GamePage;
import org.example.pages.ShopPage;
import org.openqa.selenium.WebDriver;

public class GameStep {

    final GamePage gamePage;
    public GameStep(WebDriver driver) {
        gamePage = new GamePage(driver);
    }

    public void clickWishListField() {
        gamePage.getAddWishListButton().click();
    }

}
