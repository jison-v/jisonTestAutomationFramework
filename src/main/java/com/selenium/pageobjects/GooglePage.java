package com.selenium.pageobjects;

import com.selenium.actions.SeleniumActions;
import org.openqa.selenium.By;

public class GooglePage {

    private static final By SEARCH_TEXTBOX = By.xpath("//textarea[@name='q']");
    private static final By SEARCH_BUTTON = By.xpath("//input[@name='btnI'][1]");

    SeleniumActions seleniumActions = new SeleniumActions();

    public void clickSearchButton() {

        seleniumActions.ClickElement(SEARCH_BUTTON);
    }

    public void performSearch() {

        seleniumActions.SetText(SEARCH_TEXTBOX, "Technological Institute of the Philippines");
    }
}
