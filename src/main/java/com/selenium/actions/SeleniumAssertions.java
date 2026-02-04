package com.selenium.actions;

import com.selenium.util.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumAssertions {

    public boolean verifyText(By locator, By expectedText){

        WebElement element = new WebDriverWait (Browser.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
        if (element.getText().equals(expectedText)){
            return true;
        }else return false;
    }
}
