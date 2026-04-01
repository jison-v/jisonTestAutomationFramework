package com.seleniumFramework.stepdefinitions;

import com.seleniumFramework.pageobjects.TablePressPage;
import com.seleniumFramework.utils.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TablePressStepDefinition extends Browser {

    @Given("user open the table press website {string}")
    public void useOpenTableWebsite(String url){

        navigateTo(url);
    }

    @And("user sort the name in the given table in {string} order")
    public void userSortTheName(String order) {

        TablePressPage.clickAscendingSortButton();
    }

    @Then("the user will see that the name is sorted in {string} order")
    public void theResultsShouldBeSortedInAscendingOrder(String order) {

        TablePressPage.checkTheResult();
    }

    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String button) {

        TablePressPage.clickShowMoreButton();
    }

    @Then("the user will see that the additional name is sorted in {string} order")
    public void theAdditionalResultIsSorted(String order) {

        TablePressPage.checkTheResult();
    }

}
