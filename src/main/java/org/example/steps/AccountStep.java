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

    public void clickSelectShopField() {
        log.info("Click select shop field");
        accountPage.getSelectShopField().click();
    }
}
