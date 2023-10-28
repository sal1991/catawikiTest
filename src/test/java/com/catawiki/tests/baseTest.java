package com.catawiki.tests;

import com.catawiki.pages.HomePage;
import com.catawiki.pages.LotPage;
import com.catawiki.pages.SearchListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseTest {
    WebDriver driver;
    HomePage homePage;
    LotPage lotPage;
    SearchListPage searchListPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/saloni/Documents/chromedrivermac/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        lotPage = new LotPage(driver);
        searchListPage = new SearchListPage(driver);
        driver.get("https://www.catawiki.com");
    }

    public void assertDisplay(By locator, String message) {
        WebDriverWait wait = new WebDriverWait(driver, 20); // Adjust the timeout as needed
        WebElement resultsElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(resultsElement.isDisplayed(), message);
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
