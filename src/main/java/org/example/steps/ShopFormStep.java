package org.example.steps;

import lombok.extern.log4j.Log4j2;
import org.example.pages.ShopPage;
import org.example.utils.Waiters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
@Log4j2
public class ShopFormStep {

    final ShopPage shopPage;

    public ShopFormStep(WebDriver driver) {
        shopPage = new ShopPage(driver);
    }

    public void enterNameOfGame(String nameOfGame) throws InterruptedException {
        log.info("Enter name of game");

        shopPage.getSearchNameOfGameField().sendKeys(nameOfGame);
        //убрать слип
        Thread.sleep(5000);
        shopPage.getSearchNameOfGameField().sendKeys(Keys.ENTER);
    }

    public void clickTheSpecificNameOfTheGame() {
        log.info("Click the specific name of the game");
        shopPage.getTheSpecificNameOfTheGame().click();
    }
}
