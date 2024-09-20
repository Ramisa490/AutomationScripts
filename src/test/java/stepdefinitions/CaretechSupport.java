package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.File;

public class CaretechSupport extends Reused_Variables
{

    @Given("Go to \"Customer portal\" on the Main Page")
    public void ClickCustomerPortal()
    {
        firstPage.ClickCustomerPortal();
    }

    @When("Clicks on \"Caretech Support\" button on the Shop Page")
    public void  ClickCaretechSupport()
    {
        secondPage.ClickCaretechSupport();
    }

    @And("Fill in \"Your name\" with \"John Doe\"")
    public void EnterName()
    {
        thirdPage.EnterName(name);
    }
    @And("Fill in \"Your email\" with \"john.doe@yahoo.com\"")
    public void EnterEmail()
    {
        thirdPage.EnterEmail(email);
    }
    @And("Fill in the \"Reference\" with \"ref#1\"")
    public void EnterReference()
    {
        thirdPage.EnterReference(ref);

    }
    @And("Leave the \"Description\" field empty")
    public void EnterDescription()
    {
        thirdPage.EnterDescription(Desc);
    }
    @And("Click on the \"Choose File\" Button and attaches a file")
    public void ChooseFile()
    {
        thirdPage.ChooseFile(new File(FilePath).getAbsolutePath());
    }
    @And("Click on the \"Submit\" button")
    public void Submit()
    {
        thirdPage.Submit();
    }

    @Then("Success message is displayed with \"Thank you! Your ticket has been sent.\"")
    public void SuccessMessageDisplayed()
    {
        Assert.assertTrue(successPage.isSuccessMessageDisplayed(),"Message is not displayed");
    }
}
