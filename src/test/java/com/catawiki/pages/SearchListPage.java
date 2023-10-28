package com.catawiki.pages;

import com.catawiki.locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchListPage {
    private WebDriver driver;
    public SearchListPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnSecondLot() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,350);");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SECOND_LOT));
        driver.findElement(Locators.SECOND_LOT).click();
    }

}
