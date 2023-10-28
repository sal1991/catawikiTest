package com.catawiki.pages;

import com.catawiki.locators.Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookie() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ACCEPT_COOKIE));
        driver.findElement(Locators.ACCEPT_COOKIE).click();
    }

    public void closeRegister() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CLOSE_REGISTER));
        driver.findElement(Locators.CLOSE_REGISTER).click();
    }
    public void enterSearchText(String searchText) {
        driver.findElement(Locators.SEARCH_INPUT).sendKeys(searchText);
    }
    public void performSearch() {
        driver.findElement(Locators.SEARCH_INPUT).sendKeys(Keys.RETURN);
    }
}
