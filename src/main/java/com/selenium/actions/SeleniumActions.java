package com.selenium.actions;

import com.selenium.util.Browser;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.Reporter;

import java.time.Duration;

public class SeleniumActions {

    private static final Logger log = LoggerFactory.getLogger(SeleniumActions.class);

    public void openBrowser(String url){

        log.info("Open URL.");
        Browser.getDriver().get(url);

    }

    public void ClickElement(By locator){

        Reporter.log("Click the element");
        WebElement element = new WebDriverWait(Browser.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
        Assert.assertTrue(true, "Element is successfully clicked.");
    }

    public void SetText(By locator, String input) {

        Reporter.log("Input text.");
        WebElement element = new WebDriverWait(Browser.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(locator));
        element.sendKeys(input);
        Assert.assertTrue(true, "Text is successfully added.");
    }
}
