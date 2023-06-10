package org.example.steps;

import lombok.extern.log4j.Log4j2;
import org.example.pages.AccountPage;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountStep {

    final AccountPage accountPage;

    public AccountStep(WebDriver driver) {
        accountPage = new AccountPage(driver);
    }

    public void clickShopButton() {
        log.info("Click shop button");
        accountPage.getShopButton().click();
    }

    public void enterNameOfGame() {
        log.info("Enter name of game");
        accountPage.getSearchField().sendKeys("Hearthstone");
    }
}
