package hooks;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import utils.SettingsTestData;

import static io.qameta.allure.Allure.step;

public class Hooks
{
    private Browser browser = AqualityServices.getBrowser();
   @Given("Run the Application")
   @Then("Application is opened on the main page")
   @Before()
    public void setup()
    {
        browser =AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(SettingsTestData.getEnvData().getHost());

    }

    @After
    public void teardown()
    {
        browser.quit();
    }

}
