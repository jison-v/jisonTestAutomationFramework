package com.seleniumFramework.pageobjects;

import com.seleniumFramework.utils.Browser;
import com.seleniumFramework.utils.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class TablePressPage extends Browser {

    private static Logger consoleLogger = LoggerFactory.getLogger(SeleniumActions.class);

    private static final By AscendingSortButton = By.xpath("//*[@id='tablepress-demo-premium_wrapper']/div[3]/div/div/div[1]/div/table/thead/tr/th[1]/div/span[2]");
    private static final By Result = By.xpath("//tbody[@class='row-striping row-hover']/tr/td[1]");
    private static final By ShowMoreButton = By.xpath("//div[@class='dt-paging']/nav/button");

    public static void clickShowMoreButton() {

        Browser.setZoom(70);
        SeleniumActions.clickElement(ShowMoreButton);
    }

    public static void clickAscendingSortButton() {

        SeleniumActions.clickElement(AscendingSortButton);
    }

    public static void checkTheResult() {

        List<WebElement> elements = getElements(Result, 10);
        List<String> tableData = new ArrayList<>();

        for(WebElement el : elements){
            tableData.add(el.getText());
        }

        //Sort the tableData list based on the first column (name)
        tableData.sort(String::compareToIgnoreCase);

        for(int i = 0; i < elements.size(); i++){
            String actualText = elements.get(i).getText();
            String expectedText = tableData.get(i);
            if (!actualText.equals(expectedText)) {
                throw new AssertionError("FAILED: Expected text: '" + expectedText + "' but got: '" + actualText + "'");
            }else{
                consoleLogger.info("PASSED: Text verification successful. Expected and actual text: '{}'", expectedText);
            }
        }

    }

}
