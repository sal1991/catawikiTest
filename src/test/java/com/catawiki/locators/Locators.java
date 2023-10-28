package com.catawiki.locators;

import org.openqa.selenium.By;

public class Locators {
    public static final By SEARCH_INPUT = By.xpath("//input[@type='search']");
    public static final By ACCEPT_COOKIE = By.id("cookie_bar_agree_button");
    public static final By CLOSE_REGISTER = By.xpath("//*[@class ='U8_GZLFEClxUK2oNFY8A js-close-btn']");
    public static final By SECOND_LOT = By.xpath("(//*[@class='c-extended-lot-card'])[2]");
    public static final By LOT_NAME_ELEMENT = By.xpath("//*[@class ='u-m-b-xxl-2 c-page__heading u-typography-h2-serif be-lot-details-scrollable-gallery__title--multiline']");
    public static final By HEART_COUNT_ELEMENT = By.xpath("//*[@class ='c-button-template u-cursor-pointer zG6zAT1BAQyTmNlWe9Sg UAEVwRXF5k2cthh5QVQc dW8iLOPLpU6Wjd6izzRw']");
    public static final  By CURRENT_BID_ELEMENT = By.xpath("//*[@class = 'be-lot-bid-status-section__bid-amount u-typography-h2']");
   public static final  By RESULTS_LOCATOR = By.id("lot-list");

}
