package com.seleniumFramework.stepdefinitions;

import com.seleniumFramework.pageobjects.AutomationPracticeHomePage;
import com.seleniumFramework.utils.Browser;
import com.seleniumFramework.utils.SeleniumActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AutomationPracticeStepDefinition extends SeleniumActions {

    AutomationPracticeHomePage automationPracticeHomePage = new AutomationPracticeHomePage();

    @Given("user open the automation practice website {string}")
    public void userOpenAutomationPractice(String url) {

        Browser.navigateTo(url);

    }

    @When("user clicks on the {string} menu option")
    public void userClicksOnMenuOption(String menuOption) throws InterruptedException {
        automationPracticeHomePage.selectMenuOption(menuOption);
    }

}
