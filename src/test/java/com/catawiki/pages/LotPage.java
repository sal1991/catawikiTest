package com.catawiki.pages;

import com.catawiki.locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LotPage {
    private WebDriver driver;
    public LotPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getLotName() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'"));
        String name = driver.findElement(Locators.LOT_NAME_ELEMENT).getText();
        System.out.println("Lot's name: "+name);
    }
    public void getFavourites() {
        String favourites = driver.findElement(Locators.HEART_COUNT_ELEMENT).getText();
        System.out.println("Favourites Count: "+favourites);
    }
    public void getCurrentBidValue() {
        String currentBid = driver.findElement(Locators.CURRENT_BID_ELEMENT).getText();
        System.out.println("Current Bid Value: "+currentBid);
    }

}
