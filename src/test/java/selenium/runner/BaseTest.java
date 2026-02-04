package selenium.runner;

import com.selenium.actions.SeleniumActions;
import com.selenium.pageobjects.GooglePage;
import com.selenium.util.Browser;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest extends SeleniumActions {

    SeleniumActions actions = new SeleniumActions();
    GooglePage googlePageTest = new GooglePage();

    @Test
    public void OpenGoogleAndSearch(){

        actions.openBrowser("https://www.google.com/");

        googlePageTest.performSearch();
        googlePageTest.clickSearchButton();
    }


}
