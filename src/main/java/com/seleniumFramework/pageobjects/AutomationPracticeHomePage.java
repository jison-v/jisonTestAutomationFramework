package com.seleniumFramework.pageobjects;

import com.seleniumFramework.utils.Browser;
import com.seleniumFramework.utils.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationPracticeHomePage extends Browser {

    private static final String HOME_PAGE_URL = "https://automationexercise.com/";
    private static final By MENU_OPTIONS = By.xpath("//ul[@class='nav navbar-nav']//li/a");

    public String getHomePageUrl() {
        return HOME_PAGE_URL;
    }

    public static void selectMenuOption(String menuOption) throws InterruptedException {

        waitForPageLoad(getDriver(), 10);
        WebElement menuElement = getElements(MENU_OPTIONS, 10).stream()
                .filter(element -> element.getText().contains(menuOption))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Menu option not found: " + menuOption));

        SeleniumActions.clickElement(menuElement);
    }

}
