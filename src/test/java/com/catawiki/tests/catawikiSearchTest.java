package com.catawiki.tests;

import com.catawiki.locators.Locators;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class catawikiSearchTest extends baseTest{

    @Test
    public void performCatawikiSearch() throws InterruptedException {
        homePage.acceptCookie();
        homePage.closeRegister();
        homePage.enterSearchText("train");
        homePage.performSearch();

        assertDisplay(Locators.RESULTS_LOCATOR, "Search results not displayed");
        searchListPage.clickOnSecondLot();
        assertDisplay(Locators.LOT_NAME_ELEMENT, "Lot page is not displayed.");
        lotPage.getLotName();
        lotPage.getFavourites();
        lotPage.getCurrentBidValue();
    }
}
